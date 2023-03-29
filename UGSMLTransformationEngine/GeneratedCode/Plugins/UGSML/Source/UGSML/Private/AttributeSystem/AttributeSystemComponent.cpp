// Copyright MDSE Research Group. All Rights Reserved.

#include "AttributeSystem/AttributeSystemComponent.h"
#include "AttributeSystem/MOERandomGenerator.h"
#include "NiagaraSystem.h"

UAttributeSystemComponent::UAttributeSystemComponent()
{
	PrimaryComponentTick.bCanEverTick = true;
	bWantsInitializeComponent = true;
}

void UAttributeSystemComponent::TickComponent(float DeltaTime, ELevelTick TickType, FActorComponentTickFunction* ThisTickFunction)
{
	Super::TickComponent(DeltaTime, TickType, ThisTickFunction);

	// Regenerations
	RegenerateHealth(DeltaTime);

}

void UAttributeSystemComponent::InitializeComponent()
{
	Super::InitializeComponent();
	InitializeAttributeSystem();
}

void UAttributeSystemComponent::BeginPlay()
{
	Super::BeginPlay();
	OnStrengthChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateMaxHealthDependenciesInt);
	OnStrengthChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateHealthRegenerationDependenciesInt);
	OnArmorChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateHealthDistortionDependenciesInt);
	OnLevelChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateArmorDependenciesInt);
	OnLevelChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateStrengthDependenciesInt);
	OnLevelChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateDamageDependenciesInt);
	OnLevelChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateMaxXPDependenciesInt);
	OnLevelChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateMaxCopperDependenciesInt);
	OnLevelChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateMaxSilverDependenciesInt);
	OnLevelChanged.AddDynamic(this, &UAttributeSystemComponent::UpdateMaxGoldDependenciesInt);

	OnMaxHealthChanged.AddDynamic(this, &UAttributeSystemComponent::RemapHealthForMax);
	OnMaxResourceChanged.AddDynamic(this, &UAttributeSystemComponent::ReclampResourceInt);
	OnMaxLevelChanged.AddDynamic(this, &UAttributeSystemComponent::ReclampLevelInt);
	OnMaxXPChanged.AddDynamic(this, &UAttributeSystemComponent::ReclampXPInt);
	OnMaxCopperChanged.AddDynamic(this, &UAttributeSystemComponent::ReclampCopperInt);
	OnMaxSilverChanged.AddDynamic(this, &UAttributeSystemComponent::ReclampSilverInt);
	OnMaxGoldChanged.AddDynamic(this, &UAttributeSystemComponent::ReclampGoldInt);

}

void UAttributeSystemComponent::AddDeathSounds(USoundBase* Value)
{
	DeathSounds.Add(Value);
}

void UAttributeSystemComponent::RemoveDeathSounds(USoundBase* Value)
{
	DeathSounds.Remove(Value);
}

TArray<USoundBase*> UAttributeSystemComponent::GetDeathSounds() const
{
	return DeathSounds;
}

void UAttributeSystemComponent::AddHeroNameExclusions(FString Value)
{
	HeroNameExclusions.Add(Value);
}

void UAttributeSystemComponent::RemoveHeroNameExclusions(FString Value)
{
	HeroNameExclusions.Remove(Value);
}

TArray<FString> UAttributeSystemComponent::GetHeroNameExclusions() const
{
	return HeroNameExclusions;
}

void UAttributeSystemComponent::AddHairColorInclusions(FColor Value)
{
	HairColorInclusions.Add(Value);
}

void UAttributeSystemComponent::RemoveHairColorInclusions(FColor Value)
{
	HairColorInclusions.Remove(Value);
}

TArray<FColor> UAttributeSystemComponent::GetHairColorInclusions() const
{
	return HairColorInclusions;
}

void UAttributeSystemComponent::SetHealth(float Value)
{
	float OldHealth = GetTotalHealth();
	Health = ClampValue(Value, GetTotalMinHealth(), GetTotalMaxHealth());
	float NewHealth = GetTotalHealth();

	if (OldHealth != NewHealth)
		OnHealthChanged.Broadcast(OldHealth, NewHealth);

	if (NewHealth == GetTotalMinHealth() && OldHealth != NewHealth)
		OnHealthHitMin.Broadcast();

	if (NewHealth == GetTotalMaxHealth() && OldHealth != NewHealth)
		OnHealthHitMax.Broadcast();
}

bool UAttributeSystemComponent::AddHealth(float Amount, bool ApplyDistortion)
{
	if (ApplyDistortion)
		Amount = (Amount * GetTotalHealthDistortion());
	SetHealth(GetDynamicHealth() + Amount);
	return true;
}

float UAttributeSystemComponent::GetDynamicHealth() const
{
	return Health;
}

float UAttributeSystemComponent::GetTotalHealth() const
{
	return (GetDynamicHealth());
}

bool UAttributeSystemComponent::IsHealthRegenerationDisabled() const
{
	return bIsHealthRegenerationDisabled;
}

void UAttributeSystemComponent::DisableHealthRegeneration()
{
	bIsHealthRegenerationDisabled = true;
}

void UAttributeSystemComponent::EnableHealthRegeneration()
{
	bIsHealthRegenerationDisabled = false;
}

void UAttributeSystemComponent::ToggleHealthRegeneration()
{
	bIsHealthRegenerationDisabled = !bIsHealthRegenerationDisabled;
}

float UAttributeSystemComponent::GetDynamicMinHealth() const
{
	return MinHealth;
}

float UAttributeSystemComponent::GetTotalMinHealth() const
{
	return (GetDynamicMinHealth());
}

void UAttributeSystemComponent::SetMaxHealth(float Value)
{
	float OldMaxHealth = GetTotalMaxHealth();
	MaxHealth = ClampValue(Value, MIN_flt, MAX_flt);
	float NewMaxHealth = GetTotalMaxHealth();

	if (OldMaxHealth != NewMaxHealth)
		OnMaxHealthChanged.Broadcast(OldMaxHealth, NewMaxHealth);
}

bool UAttributeSystemComponent::AddMaxHealth(float Amount)
{
	SetMaxHealth(GetDynamicMaxHealth() + Amount);
	return true;
}

float UAttributeSystemComponent::GetBaseMaxHealth() const
{
	return BaseMaxHealth;
}

float UAttributeSystemComponent::GetDependentMaxHealth() const
{
	return DependentMaxHealth;
}

float UAttributeSystemComponent::GetDynamicMaxHealth() const
{
	return MaxHealth;
}

float UAttributeSystemComponent::GetTotalMaxHealth() const
{
	return (GetBaseMaxHealth() + GetDynamicMaxHealth() + GetDependentMaxHealth());
}

void UAttributeSystemComponent::SetHealthRegeneration(float Value)
{
	float OldHealthRegeneration = GetTotalHealthRegeneration();
	HealthRegeneration = ClampValue(Value, MIN_flt, MAX_flt);
	float NewHealthRegeneration = GetTotalHealthRegeneration();

	if (OldHealthRegeneration != NewHealthRegeneration)
		OnHealthRegenerationChanged.Broadcast(OldHealthRegeneration, NewHealthRegeneration);
}

bool UAttributeSystemComponent::AddHealthRegeneration(float Amount)
{
	SetHealthRegeneration(GetDynamicHealthRegeneration() + Amount);
	return true;
}

float UAttributeSystemComponent::GetBaseHealthRegeneration() const
{
	return BaseHealthRegeneration;
}

float UAttributeSystemComponent::GetDependentHealthRegeneration() const
{
	return DependentHealthRegeneration;
}

float UAttributeSystemComponent::GetDynamicHealthRegeneration() const
{
	return HealthRegeneration;
}

float UAttributeSystemComponent::GetTotalHealthRegeneration() const
{
	return ((GetBaseHealthRegeneration() + GetDynamicHealthRegeneration() + GetDependentHealthRegeneration()) * GetTotalHealthRegenerationDistortion());
}

void UAttributeSystemComponent::SetHealthRegenerationDistortion(float Value)
{
	float OldHealthRegenerationDistortion = GetTotalHealthRegenerationDistortion();
	HealthRegenerationDistortion = ClampValue(Value, MIN_flt, MAX_flt);
	float NewHealthRegenerationDistortion = GetTotalHealthRegenerationDistortion();

	if (OldHealthRegenerationDistortion != NewHealthRegenerationDistortion)
		OnHealthRegenerationDistortionChanged.Broadcast(OldHealthRegenerationDistortion, NewHealthRegenerationDistortion);
}

bool UAttributeSystemComponent::AddHealthRegenerationDistortion(float Amount)
{
	SetHealthRegenerationDistortion(GetDynamicHealthRegenerationDistortion() + Amount);
	return true;
}

float UAttributeSystemComponent::GetDynamicHealthRegenerationDistortion() const
{
	return HealthRegenerationDistortion;
}

float UAttributeSystemComponent::GetTotalHealthRegenerationDistortion() const
{
	return (GetDynamicHealthRegenerationDistortion());
}

void UAttributeSystemComponent::SetHealthDistortion(float Value)
{
	float OldHealthDistortion = GetTotalHealthDistortion();
	HealthDistortion = ClampValue(Value, MIN_flt, MAX_flt);
	float NewHealthDistortion = GetTotalHealthDistortion();

	if (OldHealthDistortion != NewHealthDistortion)
		OnHealthDistortionChanged.Broadcast(OldHealthDistortion, NewHealthDistortion);
}

bool UAttributeSystemComponent::AddHealthDistortion(float Amount)
{
	SetHealthDistortion(GetDynamicHealthDistortion() + Amount);
	return true;
}

float UAttributeSystemComponent::GetDependentHealthDistortion() const
{
	return DependentHealthDistortion;
}

float UAttributeSystemComponent::GetDynamicHealthDistortion() const
{
	return HealthDistortion;
}

float UAttributeSystemComponent::GetTotalHealthDistortion() const
{
	return (GetDynamicHealthDistortion() + GetDependentHealthDistortion());
}

void UAttributeSystemComponent::SetArmor(int32 Value)
{
	int32 OldArmor = GetTotalArmor();
	Armor = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewArmor = GetTotalArmor();

	if (OldArmor != NewArmor)
		OnArmorChanged.Broadcast(OldArmor, NewArmor);
}

bool UAttributeSystemComponent::AddArmor(int32 Amount)
{
	SetArmor(GetDynamicArmor() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetBaseArmor() const
{
	return BaseArmor;
}

int32 UAttributeSystemComponent::GetDependentArmor() const
{
	return DependentArmor;
}

int32 UAttributeSystemComponent::GetDynamicArmor() const
{
	return Armor;
}

int32 UAttributeSystemComponent::GetTotalArmor() const
{
	return (GetBaseArmor() + GetDynamicArmor() + GetDependentArmor());
}

void UAttributeSystemComponent::SetStrength(int32 Value)
{
	int32 OldStrength = GetTotalStrength();
	Strength = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewStrength = GetTotalStrength();

	if (OldStrength != NewStrength)
		OnStrengthChanged.Broadcast(OldStrength, NewStrength);
}

bool UAttributeSystemComponent::AddStrength(int32 Amount)
{
	SetStrength(GetDynamicStrength() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetBaseStrength() const
{
	return BaseStrength;
}

int32 UAttributeSystemComponent::GetDependentStrength() const
{
	return DependentStrength;
}

int32 UAttributeSystemComponent::GetDynamicStrength() const
{
	return Strength;
}

int32 UAttributeSystemComponent::GetTotalStrength() const
{
	return (GetBaseStrength() + GetDynamicStrength() + GetDependentStrength());
}

void UAttributeSystemComponent::SetDamage(float Value)
{
	float OldDamage = GetTotalDamage();
	Damage = ClampValue(Value, MIN_flt, MAX_flt);
	float NewDamage = GetTotalDamage();

	if (OldDamage != NewDamage)
		OnDamageChanged.Broadcast(OldDamage, NewDamage);
}

bool UAttributeSystemComponent::AddDamage(float Amount)
{
	SetDamage(GetDynamicDamage() + Amount);
	return true;
}

float UAttributeSystemComponent::GetBaseDamage() const
{
	return BaseDamage;
}

float UAttributeSystemComponent::GetDependentDamage() const
{
	return DependentDamage;
}

float UAttributeSystemComponent::GetDynamicDamage() const
{
	return Damage;
}

float UAttributeSystemComponent::GetTotalDamage() const
{
	return (GetBaseDamage() + GetDynamicDamage() + GetDependentDamage());
}

void UAttributeSystemComponent::SetDamageMOERandomGenerator(TSubclassOf<UMOERandomGenerator> MOERandomGeneratorClass)
{
	if (MOERandomGeneratorClass)
	{
		DamageMOERandomGeneratorClass = MOERandomGeneratorClass;
		DamageMOERandomGenerator = NewObject<UMOERandomGenerator>(this, MOERandomGeneratorClass);
	}
}

float UAttributeSystemComponent::GetRandomDamage() const
{
	if (DamageMOERandomGenerator)
	{
		return DamageMOERandomGenerator->GetRandomWithMOE(GetTotalDamage(), GetTotalDamageMarginOfError());
	}

	return FMath::RandRange(GetTotalDamage() - FMath::Abs(GetTotalDamageMarginOfError()), GetTotalDamage() + FMath::Abs(GetTotalDamageMarginOfError()));
}

void UAttributeSystemComponent::SetDamageMarginOfError(float Value)
{
	float OldDamageMarginOfError = GetTotalDamageMarginOfError();
	DamageMarginOfError = ClampValue(Value, MIN_flt, MAX_flt);
	float NewDamageMarginOfError = GetTotalDamageMarginOfError();

	if (OldDamageMarginOfError != NewDamageMarginOfError)
		OnDamageMarginOfErrorChanged.Broadcast(OldDamageMarginOfError, NewDamageMarginOfError);
}

bool UAttributeSystemComponent::AddDamageMarginOfError(float Amount)
{
	SetDamageMarginOfError(GetDynamicDamageMarginOfError() + Amount);
	return true;
}

float UAttributeSystemComponent::GetDynamicDamageMarginOfError() const
{
	return DamageMarginOfError;
}

float UAttributeSystemComponent::GetTotalDamageMarginOfError() const
{
	return (GetDynamicDamageMarginOfError());
}

void UAttributeSystemComponent::SetResource(int32 Value)
{
	int32 OldResource = GetTotalResource();
	Resource = ClampValue(Value, GetTotalMinResource(), GetTotalMaxResource());
	int32 NewResource = GetTotalResource();

	if (OldResource != NewResource)
		OnResourceChanged.Broadcast(OldResource, NewResource);

	if (NewResource == GetTotalMinResource() && OldResource != NewResource)
		OnResourceHitMin.Broadcast();

	if (NewResource == GetTotalMaxResource() && OldResource != NewResource)
		OnResourceHitMax.Broadcast();
}

bool UAttributeSystemComponent::CanAddResource(int32 Amount) const
{
	return ValueInRange(GetTotalResource() + Amount, GetTotalMinResource(), GetTotalMaxResource());
}

bool UAttributeSystemComponent::AddResource(int32 Amount)
{
	if (!CanAddResource(Amount))
		return false;
	SetResource(GetDynamicResource() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetDynamicResource() const
{
	return Resource;
}

int32 UAttributeSystemComponent::GetTotalResource() const
{
	return (GetDynamicResource());
}

int32 UAttributeSystemComponent::GetDynamicMinResource() const
{
	return MinResource;
}

int32 UAttributeSystemComponent::GetTotalMinResource() const
{
	return (GetDynamicMinResource());
}

void UAttributeSystemComponent::SetMaxResource(int32 Value)
{
	int32 OldMaxResource = GetTotalMaxResource();
	MaxResource = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewMaxResource = GetTotalMaxResource();

	if (OldMaxResource != NewMaxResource)
		OnMaxResourceChanged.Broadcast(OldMaxResource, NewMaxResource);
}

bool UAttributeSystemComponent::AddMaxResource(int32 Amount)
{
	SetMaxResource(GetDynamicMaxResource() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetBaseMaxResource() const
{
	return BaseMaxResource;
}

int32 UAttributeSystemComponent::GetDynamicMaxResource() const
{
	return MaxResource;
}

int32 UAttributeSystemComponent::GetTotalMaxResource() const
{
	return (GetBaseMaxResource() + GetDynamicMaxResource());
}

void UAttributeSystemComponent::SetLevel(int32 Value)
{
	int32 OldLevel = GetTotalLevel();
	Level = ClampValue(Value, GetTotalMinLevel(), GetTotalMaxLevel());
	int32 NewLevel = GetTotalLevel();

	if (OldLevel != NewLevel)
		OnLevelChanged.Broadcast(OldLevel, NewLevel);

	if (NewLevel == GetTotalMinLevel() && OldLevel != NewLevel)
		OnLevelHitMin.Broadcast();

	if (NewLevel == GetTotalMaxLevel() && OldLevel != NewLevel)
		OnLevelHitMax.Broadcast();
}

bool UAttributeSystemComponent::CanAddLevel(int32 Amount) const
{
	return ValueInRange(GetTotalLevel() + Amount, GetTotalMinLevel(), GetTotalMaxLevel());
}

bool UAttributeSystemComponent::AddLevel(int32 Amount)
{
	if (!CanAddLevel(Amount))
		return false;
	SetLevel(GetDynamicLevel() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetDynamicLevel() const
{
	return Level;
}

int32 UAttributeSystemComponent::GetTotalLevel() const
{
	return (GetDynamicLevel());
}

int32 UAttributeSystemComponent::GetDynamicMinLevel() const
{
	return MinLevel;
}

int32 UAttributeSystemComponent::GetTotalMinLevel() const
{
	return (GetDynamicMinLevel());
}

void UAttributeSystemComponent::SetMaxLevel(int32 Value)
{
	int32 OldMaxLevel = GetTotalMaxLevel();
	MaxLevel = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewMaxLevel = GetTotalMaxLevel();

	if (OldMaxLevel != NewMaxLevel)
		OnMaxLevelChanged.Broadcast(OldMaxLevel, NewMaxLevel);
}

bool UAttributeSystemComponent::AddMaxLevel(int32 Amount)
{
	SetMaxLevel(GetDynamicMaxLevel() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetDynamicMaxLevel() const
{
	return MaxLevel;
}

int32 UAttributeSystemComponent::GetTotalMaxLevel() const
{
	return (GetDynamicMaxLevel());
}

void UAttributeSystemComponent::SetXP(int32 Value)
{
	int32 OldXP = GetTotalXP();
	XP = ClampValue(Value, GetTotalMinXP(), GetTotalMaxXP());
	int32 NewXP = GetTotalXP();

	if (OldXP != NewXP)
		OnXPChanged.Broadcast(OldXP, NewXP);

	if (NewXP == GetTotalMinXP() && OldXP != NewXP)
		OnXPHitMin.Broadcast();

	if (NewXP == GetTotalMaxXP() && OldXP != NewXP)
		OnXPHitMax.Broadcast();
}

bool UAttributeSystemComponent::AddXP(int32 Amount)
{
	int32 RemainingXPToAdd = 0.0f;
	if (Amount > 0.0f)
	{
		RemainingXPToAdd = ClampValue(Amount - (GetTotalMaxXP() - GetTotalXP()), -1.0f, Amount);
		if (RemainingXPToAdd >= 0.0f)
		{
			if (AddLevel(1.0))
			{
				SetXP(GetTotalMinXP());
				AddXP(RemainingXPToAdd);
			}
			else
				SetXP(GetDynamicXP() + Amount);
		}
		else
			SetXP(GetDynamicXP() + Amount);
	}
	if (Amount < 0.0f)
	{
		RemainingXPToAdd = ClampValue(Amount + GetTotalXP(), Amount, 1.0f);
		if (RemainingXPToAdd < 0.0f)
		{
			if (AddLevel(-1.0))
			{
				SetXP(GetTotalMaxXP());
				AddXP(RemainingXPToAdd);
			}
			else
				SetXP(GetDynamicXP() + Amount);
		}
		else
			SetXP(GetDynamicXP() + Amount);
	}
	return true;
}

int32 UAttributeSystemComponent::GetDynamicXP() const
{
	return XP;
}

int32 UAttributeSystemComponent::GetTotalXP() const
{
	return (GetDynamicXP());
}

int32 UAttributeSystemComponent::GetDynamicMinXP() const
{
	return MinXP;
}

int32 UAttributeSystemComponent::GetTotalMinXP() const
{
	return (GetDynamicMinXP());
}

void UAttributeSystemComponent::SetMaxXP(int32 Value)
{
	int32 OldMaxXP = GetTotalMaxXP();
	MaxXP = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewMaxXP = GetTotalMaxXP();

	if (OldMaxXP != NewMaxXP)
		OnMaxXPChanged.Broadcast(OldMaxXP, NewMaxXP);
}

bool UAttributeSystemComponent::AddMaxXP(int32 Amount)
{
	SetMaxXP(GetDynamicMaxXP() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetDependentMaxXP() const
{
	return DependentMaxXP;
}

int32 UAttributeSystemComponent::GetDynamicMaxXP() const
{
	return MaxXP;
}

int32 UAttributeSystemComponent::GetTotalMaxXP() const
{
	return (GetDynamicMaxXP() + GetDependentMaxXP());
}

void UAttributeSystemComponent::SetCopper(int32 Value)
{
	int32 OldCopper = GetTotalCopper();
	Copper = ClampValue(Value, GetTotalMinCopper(), GetTotalMaxCopper());
	int32 NewCopper = GetTotalCopper();

	if (OldCopper != NewCopper)
		OnCopperChanged.Broadcast(OldCopper, NewCopper);

	if (NewCopper == GetTotalMinCopper() && OldCopper != NewCopper)
		OnCopperHitMin.Broadcast();

	if (NewCopper == GetTotalMaxCopper() && OldCopper != NewCopper)
		OnCopperHitMax.Broadcast();
}

bool UAttributeSystemComponent::CanAddCopper(int32 Amount) const
{
	int64 TotalLimit = 0 + static_cast<int64>(GetTotalMaxCopper()) * 1.0 + static_cast<int64>(GetTotalMaxSilver()) * 100.0 + static_cast<int64>(GetTotalMaxGold()) * 10000.0;

	int64 TotalAdditionAmount = static_cast<int64>(Amount) * 1.0;

	int64 TotalCurrent = 0 + static_cast<int64>(GetTotalCopper()) * 1.0 + static_cast<int64>(GetTotalSilver()) * 100.0 + static_cast<int64>(GetTotalGold()) * 10000.0;

	int64 Result = TotalCurrent + TotalAdditionAmount;

	if (Result > TotalLimit || Result < 0)
		return false;
	return true;
}

bool UAttributeSystemComponent::AddCopper(int32 Amount)
{
	if (!CanAddCopper(Amount))
		return false;
	int32 RemainingCopperToAdd = 0.0f;
	if (Amount > 0.0f)
	{
		RemainingCopperToAdd = ClampValue(Amount - (GetTotalMaxCopper() - GetTotalCopper()), -1.0f, Amount);
		if (RemainingCopperToAdd >= 0.0f)
		{
			if (AddSilver(1.0))
			{
				SetCopper(GetTotalMinCopper());
				AddCopper(RemainingCopperToAdd);
			}
			else
				SetCopper(GetDynamicCopper() + Amount);
		}
		else
			SetCopper(GetDynamicCopper() + Amount);
	}
	if (Amount < 0.0f)
	{
		RemainingCopperToAdd = ClampValue(Amount + GetTotalCopper(), Amount, 1.0f);
		if (RemainingCopperToAdd < 0.0f)
		{
			if (AddSilver(-1.0))
			{
				SetCopper(GetTotalMaxCopper());
				AddCopper(RemainingCopperToAdd);
			}
			else
				SetCopper(GetDynamicCopper() + Amount);
		}
		else
			SetCopper(GetDynamicCopper() + Amount);
	}
	return true;
}

int32 UAttributeSystemComponent::GetDynamicCopper() const
{
	return Copper;
}

int32 UAttributeSystemComponent::GetTotalCopper() const
{
	return (GetDynamicCopper());
}

int32 UAttributeSystemComponent::GetDynamicMinCopper() const
{
	return MinCopper;
}

int32 UAttributeSystemComponent::GetTotalMinCopper() const
{
	return (GetDynamicMinCopper());
}

void UAttributeSystemComponent::SetMaxCopper(int32 Value)
{
	int32 OldMaxCopper = GetTotalMaxCopper();
	MaxCopper = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewMaxCopper = GetTotalMaxCopper();

	if (OldMaxCopper != NewMaxCopper)
		OnMaxCopperChanged.Broadcast(OldMaxCopper, NewMaxCopper);
}

bool UAttributeSystemComponent::AddMaxCopper(int32 Amount)
{
	SetMaxCopper(GetDynamicMaxCopper() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetBaseMaxCopper() const
{
	return BaseMaxCopper;
}

int32 UAttributeSystemComponent::GetDependentMaxCopper() const
{
	return DependentMaxCopper;
}

int32 UAttributeSystemComponent::GetDynamicMaxCopper() const
{
	return MaxCopper;
}

int32 UAttributeSystemComponent::GetTotalMaxCopper() const
{
	return (GetBaseMaxCopper() + GetDynamicMaxCopper() + GetDependentMaxCopper());
}

void UAttributeSystemComponent::SetSilver(int32 Value)
{
	int32 OldSilver = GetTotalSilver();
	Silver = ClampValue(Value, GetTotalMinSilver(), GetTotalMaxSilver());
	int32 NewSilver = GetTotalSilver();

	if (OldSilver != NewSilver)
		OnSilverChanged.Broadcast(OldSilver, NewSilver);

	if (NewSilver == GetTotalMinSilver() && OldSilver != NewSilver)
		OnSilverHitMin.Broadcast();

	if (NewSilver == GetTotalMaxSilver() && OldSilver != NewSilver)
		OnSilverHitMax.Broadcast();
}

bool UAttributeSystemComponent::CanAddSilver(int32 Amount) const
{
	int64 TotalLimit = 0 + static_cast<int64>(GetTotalMaxCopper()) * 1.0 + static_cast<int64>(GetTotalMaxSilver()) * 100.0 + static_cast<int64>(GetTotalMaxGold()) * 10000.0;

	int64 TotalAdditionAmount = static_cast<int64>(Amount) * 100.0;

	int64 TotalCurrent = 0 + static_cast<int64>(GetTotalCopper()) * 1.0 + static_cast<int64>(GetTotalSilver()) * 100.0 + static_cast<int64>(GetTotalGold()) * 10000.0;

	int64 Result = TotalCurrent + TotalAdditionAmount;

	if (Result > TotalLimit || Result < 0)
		return false;
	return true;
}

bool UAttributeSystemComponent::AddSilver(int32 Amount)
{
	if (!CanAddSilver(Amount))
		return false;
	int32 RemainingSilverToAdd = 0.0f;
	if (Amount > 0.0f)
	{
		RemainingSilverToAdd = ClampValue(Amount - (GetTotalMaxSilver() - GetTotalSilver()), -1.0f, Amount);
		if (RemainingSilverToAdd >= 0.0f)
		{
			if (AddGold(1.0))
			{
				SetSilver(GetTotalMinSilver());
				AddSilver(RemainingSilverToAdd);
			}
			else
				SetSilver(GetDynamicSilver() + Amount);
		}
		else
			SetSilver(GetDynamicSilver() + Amount);
	}
	if (Amount < 0.0f)
	{
		RemainingSilverToAdd = ClampValue(Amount + GetTotalSilver(), Amount, 1.0f);
		if (RemainingSilverToAdd < 0.0f)
		{
			if (AddGold(-1.0))
			{
				SetSilver(GetTotalMaxSilver());
				AddSilver(RemainingSilverToAdd);
			}
			else
				SetSilver(GetDynamicSilver() + Amount);
		}
		else
			SetSilver(GetDynamicSilver() + Amount);
	}
	return true;
}

int32 UAttributeSystemComponent::GetDynamicSilver() const
{
	return Silver;
}

int32 UAttributeSystemComponent::GetTotalSilver() const
{
	return (GetDynamicSilver());
}

int32 UAttributeSystemComponent::GetDynamicMinSilver() const
{
	return MinSilver;
}

int32 UAttributeSystemComponent::GetTotalMinSilver() const
{
	return (GetDynamicMinSilver());
}

void UAttributeSystemComponent::SetMaxSilver(int32 Value)
{
	int32 OldMaxSilver = GetTotalMaxSilver();
	MaxSilver = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewMaxSilver = GetTotalMaxSilver();

	if (OldMaxSilver != NewMaxSilver)
		OnMaxSilverChanged.Broadcast(OldMaxSilver, NewMaxSilver);
}

bool UAttributeSystemComponent::AddMaxSilver(int32 Amount)
{
	SetMaxSilver(GetDynamicMaxSilver() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetBaseMaxSilver() const
{
	return BaseMaxSilver;
}

int32 UAttributeSystemComponent::GetDependentMaxSilver() const
{
	return DependentMaxSilver;
}

int32 UAttributeSystemComponent::GetDynamicMaxSilver() const
{
	return MaxSilver;
}

int32 UAttributeSystemComponent::GetTotalMaxSilver() const
{
	return (GetBaseMaxSilver() + GetDynamicMaxSilver() + GetDependentMaxSilver());
}

void UAttributeSystemComponent::SetGold(int32 Value)
{
	int32 OldGold = GetTotalGold();
	Gold = ClampValue(Value, GetTotalMinGold(), GetTotalMaxGold());
	int32 NewGold = GetTotalGold();

	if (OldGold != NewGold)
		OnGoldChanged.Broadcast(OldGold, NewGold);

	if (NewGold == GetTotalMinGold() && OldGold != NewGold)
		OnGoldHitMin.Broadcast();

	if (NewGold == GetTotalMaxGold() && OldGold != NewGold)
		OnGoldHitMax.Broadcast();
}

bool UAttributeSystemComponent::CanAddGold(int32 Amount) const
{
	int64 TotalLimit = 0 + static_cast<int64>(GetTotalMaxCopper()) * 1.0 + static_cast<int64>(GetTotalMaxSilver()) * 100.0 + static_cast<int64>(GetTotalMaxGold()) * 10000.0;

	int64 TotalAdditionAmount = static_cast<int64>(Amount) * 10000.0;

	int64 TotalCurrent = 0 + static_cast<int64>(GetTotalCopper()) * 1.0 + static_cast<int64>(GetTotalSilver()) * 100.0 + static_cast<int64>(GetTotalGold()) * 10000.0;

	int64 Result = TotalCurrent + TotalAdditionAmount;

	if (Result > TotalLimit || Result < 0)
		return false;
	return true;
}

bool UAttributeSystemComponent::AddGold(int32 Amount)
{
	if (!CanAddGold(Amount))
		return false;
	SetGold(GetDynamicGold() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetDynamicGold() const
{
	return Gold;
}

int32 UAttributeSystemComponent::GetTotalGold() const
{
	return (GetDynamicGold());
}

int32 UAttributeSystemComponent::GetDynamicMinGold() const
{
	return MinGold;
}

int32 UAttributeSystemComponent::GetTotalMinGold() const
{
	return (GetDynamicMinGold());
}

void UAttributeSystemComponent::SetMaxGold(int32 Value)
{
	int32 OldMaxGold = GetTotalMaxGold();
	MaxGold = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewMaxGold = GetTotalMaxGold();

	if (OldMaxGold != NewMaxGold)
		OnMaxGoldChanged.Broadcast(OldMaxGold, NewMaxGold);
}

bool UAttributeSystemComponent::AddMaxGold(int32 Amount)
{
	SetMaxGold(GetDynamicMaxGold() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetBaseMaxGold() const
{
	return BaseMaxGold;
}

int32 UAttributeSystemComponent::GetDependentMaxGold() const
{
	return DependentMaxGold;
}

int32 UAttributeSystemComponent::GetDynamicMaxGold() const
{
	return MaxGold;
}

int32 UAttributeSystemComponent::GetTotalMaxGold() const
{
	return (GetBaseMaxGold() + GetDynamicMaxGold() + GetDependentMaxGold());
}

void UAttributeSystemComponent::SetIsDead(bool Value)
{
	bool OldIsDead = GetIsDead();
	bIsDead = Value;
	bool NewIsDead = GetIsDead();

	if (OldIsDead != NewIsDead)
		OnIsDeadChanged.Broadcast(OldIsDead, NewIsDead);
}

void UAttributeSystemComponent::ToggleIsDead()
{
	SetIsDead(!GetIsDead());
}

bool UAttributeSystemComponent::GetIsDead() const
{
	return bIsDead;
}

bool UAttributeSystemComponent::SetHeroName(FName Value)
{
	if (!ValueInRange(HeroName.ToString().Len(), 1, GetTotalMaxHeroNameLength()))
		return false;

	if (StringContainsExclusion(HeroName.ToString(), GetHeroNameExclusions()))
		return false;

	FName OldHeroName = GetHeroName();
	HeroName = Value;
	FName NewHeroName = GetHeroName();

	if (OldHeroName != NewHeroName)
		OnHeroNameChanged.Broadcast(OldHeroName, NewHeroName);

	return true;
}

FName UAttributeSystemComponent::GetHeroName() const
{
	return HeroName;
}

void UAttributeSystemComponent::SetMaxHeroNameLength(int32 Value)
{
	int32 OldMaxHeroNameLength = GetTotalMaxHeroNameLength();
	MaxHeroNameLength = ClampValue(Value, MIN_int32, MAX_int32);
	int32 NewMaxHeroNameLength = GetTotalMaxHeroNameLength();

	if (OldMaxHeroNameLength != NewMaxHeroNameLength)
		OnMaxHeroNameLengthChanged.Broadcast(OldMaxHeroNameLength, NewMaxHeroNameLength);
}

bool UAttributeSystemComponent::AddMaxHeroNameLength(int32 Amount)
{
	SetMaxHeroNameLength(GetDynamicMaxHeroNameLength() + Amount);
	return true;
}

int32 UAttributeSystemComponent::GetDynamicMaxHeroNameLength() const
{
	return MaxHeroNameLength;
}

int32 UAttributeSystemComponent::GetTotalMaxHeroNameLength() const
{
	return (GetDynamicMaxHeroNameLength());
}

void UAttributeSystemComponent::SetMyVector2D(FVector2D Value)
{
	FVector2D OldMyVector2D = GetMyVector2D();
	MyVector2D = ClampVector2D(Value, GetMinMyVector2D(), GetMaxMyVector2D());
	FVector2D NewMyVector2D = GetMyVector2D();

	if (OldMyVector2D != NewMyVector2D)
		OnMyVector2DChanged.Broadcast(OldMyVector2D, NewMyVector2D);
}

bool UAttributeSystemComponent::AddMyVector2D(FVector2D Amount)
{
	SetMyVector2D(GetMyVector2D() + Amount);
	return true;
}

FVector2D UAttributeSystemComponent::GetMyVector2D() const
{
	return MyVector2D;
}

void UAttributeSystemComponent::SetMinMyVector2D(FVector2D Value)
{
	FVector2D OldMinMyVector2D = GetMinMyVector2D();
	MinMyVector2D = ClampVector2D(Value, FVector2D(MIN_dbl), FVector2D(MAX_dbl));
	FVector2D NewMinMyVector2D = GetMinMyVector2D();

	if (OldMinMyVector2D != NewMinMyVector2D)
		OnMinMyVector2DChanged.Broadcast(OldMinMyVector2D, NewMinMyVector2D);
}

bool UAttributeSystemComponent::AddMinMyVector2D(FVector2D Amount)
{
	SetMinMyVector2D(GetMinMyVector2D() + Amount);
	return true;
}

FVector2D UAttributeSystemComponent::GetMinMyVector2D() const
{
	return MinMyVector2D;
}

void UAttributeSystemComponent::SetMaxMyVector2D(FVector2D Value)
{
	FVector2D OldMaxMyVector2D = GetMaxMyVector2D();
	MaxMyVector2D = ClampVector2D(Value, FVector2D(MIN_dbl), FVector2D(MAX_dbl));
	FVector2D NewMaxMyVector2D = GetMaxMyVector2D();

	if (OldMaxMyVector2D != NewMaxMyVector2D)
		OnMaxMyVector2DChanged.Broadcast(OldMaxMyVector2D, NewMaxMyVector2D);
}

bool UAttributeSystemComponent::AddMaxMyVector2D(FVector2D Amount)
{
	SetMaxMyVector2D(GetMaxMyVector2D() + Amount);
	return true;
}

FVector2D UAttributeSystemComponent::GetMaxMyVector2D() const
{
	return MaxMyVector2D;
}

void UAttributeSystemComponent::SetDestinationLocation(FVector Value)
{
	FVector OldDestinationLocation = GetDestinationLocation();
	DestinationLocation = ClampVector(Value, GetMinDestinationLocation(), GetMaxDestinationLocation());
	FVector NewDestinationLocation = GetDestinationLocation();

	if (OldDestinationLocation != NewDestinationLocation)
		OnDestinationLocationChanged.Broadcast(OldDestinationLocation, NewDestinationLocation);
}

bool UAttributeSystemComponent::AddDestinationLocation(FVector Amount)
{
	SetDestinationLocation(GetDestinationLocation() + Amount);
	return true;
}

FVector UAttributeSystemComponent::GetDestinationLocation() const
{
	return DestinationLocation;
}

void UAttributeSystemComponent::SetMinDestinationLocation(FVector Value)
{
	FVector OldMinDestinationLocation = GetMinDestinationLocation();
	MinDestinationLocation = ClampVector(Value, FVector(MIN_dbl), FVector(MAX_dbl));
	FVector NewMinDestinationLocation = GetMinDestinationLocation();

	if (OldMinDestinationLocation != NewMinDestinationLocation)
		OnMinDestinationLocationChanged.Broadcast(OldMinDestinationLocation, NewMinDestinationLocation);
}

bool UAttributeSystemComponent::AddMinDestinationLocation(FVector Amount)
{
	SetMinDestinationLocation(GetMinDestinationLocation() + Amount);
	return true;
}

FVector UAttributeSystemComponent::GetMinDestinationLocation() const
{
	return MinDestinationLocation;
}

void UAttributeSystemComponent::SetMaxDestinationLocation(FVector Value)
{
	FVector OldMaxDestinationLocation = GetMaxDestinationLocation();
	MaxDestinationLocation = ClampVector(Value, FVector(MIN_dbl), FVector(MAX_dbl));
	FVector NewMaxDestinationLocation = GetMaxDestinationLocation();

	if (OldMaxDestinationLocation != NewMaxDestinationLocation)
		OnMaxDestinationLocationChanged.Broadcast(OldMaxDestinationLocation, NewMaxDestinationLocation);
}

bool UAttributeSystemComponent::AddMaxDestinationLocation(FVector Amount)
{
	SetMaxDestinationLocation(GetMaxDestinationLocation() + Amount);
	return true;
}

FVector UAttributeSystemComponent::GetMaxDestinationLocation() const
{
	return MaxDestinationLocation;
}

void UAttributeSystemComponent::SetMyRotator(FRotator Value)
{
	FRotator OldMyRotator = GetMyRotator();
	MyRotator = ClampRotator(Value, GetMinMyRotator(), GetMaxMyRotator());
	FRotator NewMyRotator = GetMyRotator();

	if (OldMyRotator != NewMyRotator)
		OnMyRotatorChanged.Broadcast(OldMyRotator, NewMyRotator);
}

bool UAttributeSystemComponent::AddMyRotator(FRotator Amount)
{
	SetMyRotator(GetMyRotator() + Amount);
	return true;
}

FRotator UAttributeSystemComponent::GetMyRotator() const
{
	return MyRotator;
}

void UAttributeSystemComponent::SetMinMyRotator(FRotator Value)
{
	FRotator OldMinMyRotator = GetMinMyRotator();
	MinMyRotator = ClampRotator(Value, FRotator(MIN_dbl), FRotator(MAX_dbl));
	FRotator NewMinMyRotator = GetMinMyRotator();

	if (OldMinMyRotator != NewMinMyRotator)
		OnMinMyRotatorChanged.Broadcast(OldMinMyRotator, NewMinMyRotator);
}

bool UAttributeSystemComponent::AddMinMyRotator(FRotator Amount)
{
	SetMinMyRotator(GetMinMyRotator() + Amount);
	return true;
}

FRotator UAttributeSystemComponent::GetMinMyRotator() const
{
	return MinMyRotator;
}

void UAttributeSystemComponent::SetMaxMyRotator(FRotator Value)
{
	FRotator OldMaxMyRotator = GetMaxMyRotator();
	MaxMyRotator = ClampRotator(Value, FRotator(MIN_dbl), FRotator(MAX_dbl));
	FRotator NewMaxMyRotator = GetMaxMyRotator();

	if (OldMaxMyRotator != NewMaxMyRotator)
		OnMaxMyRotatorChanged.Broadcast(OldMaxMyRotator, NewMaxMyRotator);
}

bool UAttributeSystemComponent::AddMaxMyRotator(FRotator Amount)
{
	SetMaxMyRotator(GetMaxMyRotator() + Amount);
	return true;
}

FRotator UAttributeSystemComponent::GetMaxMyRotator() const
{
	return MaxMyRotator;
}

void UAttributeSystemComponent::SetMyTransform(FTransform Value)
{
	FTransform OldMyTransform = GetMyTransform();
	MyTransform = ClampTransform(Value, GetMinMyTransform(), GetMaxMyTransform());
	FTransform NewMyTransform = GetMyTransform();

	if (OldMyTransform.Equals(NewMyTransform, 0.000001f))
		OnMyTransformChanged.Broadcast(OldMyTransform, NewMyTransform);
}

bool UAttributeSystemComponent::AddMyTransform(FTransform Amount)
{
	SetMyTransform(GetMyTransform() + Amount);
	return true;
}

FTransform UAttributeSystemComponent::GetMyTransform() const
{
	return MyTransform;
}

void UAttributeSystemComponent::SetMinMyTransform(FTransform Value)
{
	FTransform OldMinMyTransform = GetMinMyTransform();
	MinMyTransform = ClampTransform(Value, FTransform(FRotator(MIN_dbl), FVector(MIN_dbl), FVector(MIN_dbl)), FTransform(FRotator(MAX_dbl), FVector(MAX_dbl), FVector(MAX_dbl)));
	FTransform NewMinMyTransform = GetMinMyTransform();

	if (OldMinMyTransform.Equals(NewMinMyTransform, 0.000001f))
		OnMinMyTransformChanged.Broadcast(OldMinMyTransform, NewMinMyTransform);
}

bool UAttributeSystemComponent::AddMinMyTransform(FTransform Amount)
{
	SetMinMyTransform(GetMinMyTransform() + Amount);
	return true;
}

FTransform UAttributeSystemComponent::GetMinMyTransform() const
{
	return MinMyTransform;
}

void UAttributeSystemComponent::SetMaxMyTransform(FTransform Value)
{
	FTransform OldMaxMyTransform = GetMaxMyTransform();
	MaxMyTransform = ClampTransform(Value, FTransform(FRotator(MIN_dbl), FVector(MIN_dbl), FVector(MIN_dbl)), FTransform(FRotator(MAX_dbl), FVector(MAX_dbl), FVector(MAX_dbl)));
	FTransform NewMaxMyTransform = GetMaxMyTransform();

	if (OldMaxMyTransform.Equals(NewMaxMyTransform, 0.000001f))
		OnMaxMyTransformChanged.Broadcast(OldMaxMyTransform, NewMaxMyTransform);
}

bool UAttributeSystemComponent::AddMaxMyTransform(FTransform Amount)
{
	SetMaxMyTransform(GetMaxMyTransform() + Amount);
	return true;
}

FTransform UAttributeSystemComponent::GetMaxMyTransform() const
{
	return MaxMyTransform;
}

bool UAttributeSystemComponent::SetHairColor(FColor Value)
{

	if (ColorRefusesInclusion(Value, GetHairColorInclusions()))
		return false;

	FColor OldHairColor = GetHairColor();
	HairColor = Value;
	FColor NewHairColor = GetHairColor();

	if (OldHairColor != NewHairColor)
		OnHairColorChanged.Broadcast(OldHairColor, NewHairColor);

	return true;
}

FColor UAttributeSystemComponent::GetHairColor() const
{
	return HairColor;
}

void UAttributeSystemComponent::SetMyCarColor(ECarColor Value)
{
	ECarColor OldMyCarColor = GetMyCarColor();
	MyCarColor = Value;
	ECarColor NewMyCarColor = GetMyCarColor();

	if (OldMyCarColor != NewMyCarColor)
		OnMyCarColorChanged.Broadcast(OldMyCarColor, NewMyCarColor);
}

ECarColor UAttributeSystemComponent::GetMyCarColor() const
{
	return MyCarColor;
}

void UAttributeSystemComponent::AddCurrentWeatherKey(int32 Key)
{
	int32 OldCurrentWeather = GetCurrentWeather();
	CurrentWeather |= static_cast<int32>(Key);
	int32 NewCurrentWeather = GetCurrentWeather();

	if (OldCurrentWeather != NewCurrentWeather)
		OnCurrentWeatherChanged.Broadcast(static_cast<EWeatherType::Type>(OldCurrentWeather), static_cast<EWeatherType::Type>(NewCurrentWeather));
}

void UAttributeSystemComponent::RemoveCurrentWeatherKey(int32 Key)
{
	int32 OldCurrentWeather = GetCurrentWeather();
	CurrentWeather &= ~static_cast<int32>(Key);
	int32 NewCurrentWeather = GetCurrentWeather();

	if (OldCurrentWeather != NewCurrentWeather)
		OnCurrentWeatherChanged.Broadcast(static_cast<EWeatherType::Type>(OldCurrentWeather), static_cast<EWeatherType::Type>(NewCurrentWeather));
}

int32 UAttributeSystemComponent::GetCurrentWeather() const
{
	return static_cast<EWeatherType::Type>(CurrentWeather);
}

bool UAttributeSystemComponent::CurrentWeatherHasKey(int32 Key) const
{
	return GetCurrentWeather() & static_cast<int32>(Key);
}

void UAttributeSystemComponent::SetMyStruct(FMyStruct Value)
{
	FMyStruct OldMyStruct = GetMyStruct();
	MyStruct = Value;
	FMyStruct NewMyStruct = GetMyStruct();

	if (OldMyStruct != NewMyStruct)
		OnMyStructChanged.Broadcast(OldMyStruct, NewMyStruct);
}

FMyStruct UAttributeSystemComponent::GetMyStruct() const
{
	return MyStruct;
}


void UAttributeSystemComponent::InitializeHealth()
{
	SetHealth(GetTotalMaxHealth());
}

void UAttributeSystemComponent::RemapHealthForMax(float OldMaxHealth, float NewMaxHealth)
{
	SetHealth(RemapValue(GetTotalHealth(), GetTotalMinHealth(), OldMaxHealth, GetTotalMinHealth(), NewMaxHealth));
}

void UAttributeSystemComponent::RegenerateHealth(float DeltaTime)
{
	if (!bIsHealthRegenerationDisabled)
		AddHealth(GetTotalHealthRegeneration() * DeltaTime, false);
}

void UAttributeSystemComponent::InitializeDamage()
{
	SetDamageMOERandomGenerator(DamageMOERandomGeneratorClass);
}

void UAttributeSystemComponent::InitializeResource()
{
	SetResource(GetTotalMinResource());
}
void UAttributeSystemComponent::ReclampResourceInt(int32 OldValue, int32 NewValue)
{
	SetResource(GetTotalResource());
}

void UAttributeSystemComponent::ReclampResourceFloat(float OldValue, float NewValue)
{
	SetResource(GetTotalResource());
}

void UAttributeSystemComponent::InitializeLevel()
{
	SetLevel(GetTotalMinLevel());
}
void UAttributeSystemComponent::ReclampLevelInt(int32 OldValue, int32 NewValue)
{
	SetLevel(GetTotalLevel());
}

void UAttributeSystemComponent::ReclampLevelFloat(float OldValue, float NewValue)
{
	SetLevel(GetTotalLevel());
}

void UAttributeSystemComponent::InitializeXP()
{
	SetXP(GetTotalMinXP());
}
void UAttributeSystemComponent::ReclampXPInt(int32 OldValue, int32 NewValue)
{
	SetXP(GetTotalXP());
}

void UAttributeSystemComponent::ReclampXPFloat(float OldValue, float NewValue)
{
	SetXP(GetTotalXP());
}

void UAttributeSystemComponent::InitializeCopper()
{
	SetCopper(GetTotalMinCopper());
}
void UAttributeSystemComponent::ReclampCopperInt(int32 OldValue, int32 NewValue)
{
	SetCopper(GetTotalCopper());
}

void UAttributeSystemComponent::ReclampCopperFloat(float OldValue, float NewValue)
{
	SetCopper(GetTotalCopper());
}

void UAttributeSystemComponent::InitializeSilver()
{
	SetSilver(GetTotalMinSilver());
}
void UAttributeSystemComponent::ReclampSilverInt(int32 OldValue, int32 NewValue)
{
	SetSilver(GetTotalSilver());
}

void UAttributeSystemComponent::ReclampSilverFloat(float OldValue, float NewValue)
{
	SetSilver(GetTotalSilver());
}

void UAttributeSystemComponent::InitializeGold()
{
	SetGold(GetTotalMinGold());
}
void UAttributeSystemComponent::ReclampGoldInt(int32 OldValue, int32 NewValue)
{
	SetGold(GetTotalGold());
}

void UAttributeSystemComponent::ReclampGoldFloat(float OldValue, float NewValue)
{
	SetGold(GetTotalGold());
}


float UAttributeSystemComponent::CalculateMaxHealthDependencies() const
{
	return GetTotalStrength() * 10;
}

void UAttributeSystemComponent::UpdateMaxHealthDependencies()
{
	float OldMaxHealth = GetTotalMaxHealth();
	DependentMaxHealth = CalculateMaxHealthDependencies();
	float NewMaxHealth = GetTotalMaxHealth();
	
	if (OldMaxHealth != NewMaxHealth)
		OnMaxHealthChanged.Broadcast(OldMaxHealth, NewMaxHealth);
}

void UAttributeSystemComponent::UpdateMaxHealthDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateMaxHealthDependencies();
}

void UAttributeSystemComponent::UpdateMaxHealthDependenciesFloat(float OldValue, float NewValue)
{
	UpdateMaxHealthDependencies();
}

float UAttributeSystemComponent::CalculateHealthRegenerationDependencies() const
{
	return GetTotalStrength() * 0.2f;
}

void UAttributeSystemComponent::UpdateHealthRegenerationDependencies()
{
	float OldHealthRegeneration = GetTotalHealthRegeneration();
	DependentHealthRegeneration = CalculateHealthRegenerationDependencies();
	float NewHealthRegeneration = GetTotalHealthRegeneration();
	
	if (OldHealthRegeneration != NewHealthRegeneration)
		OnHealthRegenerationChanged.Broadcast(OldHealthRegeneration, NewHealthRegeneration);
}

void UAttributeSystemComponent::UpdateHealthRegenerationDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateHealthRegenerationDependencies();
}

void UAttributeSystemComponent::UpdateHealthRegenerationDependenciesFloat(float OldValue, float NewValue)
{
	UpdateHealthRegenerationDependencies();
}

float UAttributeSystemComponent::CalculateHealthDistortionDependencies() const
{
	return 1.0f - (0.052f * GetTotalArmor()) / (0.9f + 0.048f * FMath::Abs(GetTotalArmor()));
}

void UAttributeSystemComponent::UpdateHealthDistortionDependencies()
{
	float OldHealthDistortion = GetTotalHealthDistortion();
	DependentHealthDistortion = CalculateHealthDistortionDependencies();
	float NewHealthDistortion = GetTotalHealthDistortion();
	
	if (OldHealthDistortion != NewHealthDistortion)
		OnHealthDistortionChanged.Broadcast(OldHealthDistortion, NewHealthDistortion);
}

void UAttributeSystemComponent::UpdateHealthDistortionDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateHealthDistortionDependencies();
}

void UAttributeSystemComponent::UpdateHealthDistortionDependenciesFloat(float OldValue, float NewValue)
{
	UpdateHealthDistortionDependencies();
}

int32 UAttributeSystemComponent::CalculateArmorDependencies() const
{
	return GetTotalLevel() * 1;
}

void UAttributeSystemComponent::UpdateArmorDependencies()
{
	int32 OldArmor = GetTotalArmor();
	DependentArmor = CalculateArmorDependencies();
	int32 NewArmor = GetTotalArmor();
	
	if (OldArmor != NewArmor)
		OnArmorChanged.Broadcast(OldArmor, NewArmor);
}

void UAttributeSystemComponent::UpdateArmorDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateArmorDependencies();
}

void UAttributeSystemComponent::UpdateArmorDependenciesFloat(float OldValue, float NewValue)
{
	UpdateArmorDependencies();
}

int32 UAttributeSystemComponent::CalculateStrengthDependencies() const
{
	return GetTotalLevel() * 1;
}

void UAttributeSystemComponent::UpdateStrengthDependencies()
{
	int32 OldStrength = GetTotalStrength();
	DependentStrength = CalculateStrengthDependencies();
	int32 NewStrength = GetTotalStrength();
	
	if (OldStrength != NewStrength)
		OnStrengthChanged.Broadcast(OldStrength, NewStrength);
}

void UAttributeSystemComponent::UpdateStrengthDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateStrengthDependencies();
}

void UAttributeSystemComponent::UpdateStrengthDependenciesFloat(float OldValue, float NewValue)
{
	UpdateStrengthDependencies();
}

float UAttributeSystemComponent::CalculateDamageDependencies() const
{
	return GetTotalLevel() * 1.0f;
}

void UAttributeSystemComponent::UpdateDamageDependencies()
{
	float OldDamage = GetTotalDamage();
	DependentDamage = CalculateDamageDependencies();
	float NewDamage = GetTotalDamage();
	
	if (OldDamage != NewDamage)
		OnDamageChanged.Broadcast(OldDamage, NewDamage);
}

void UAttributeSystemComponent::UpdateDamageDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateDamageDependencies();
}

void UAttributeSystemComponent::UpdateDamageDependenciesFloat(float OldValue, float NewValue)
{
	UpdateDamageDependencies();
}

int32 UAttributeSystemComponent::CalculateMaxXPDependencies() const
{
	return GetTotalLevel() * 20;
}

void UAttributeSystemComponent::UpdateMaxXPDependencies()
{
	int32 OldMaxXP = GetTotalMaxXP();
	DependentMaxXP = CalculateMaxXPDependencies();
	int32 NewMaxXP = GetTotalMaxXP();
	
	if (OldMaxXP != NewMaxXP)
		OnMaxXPChanged.Broadcast(OldMaxXP, NewMaxXP);
}

void UAttributeSystemComponent::UpdateMaxXPDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateMaxXPDependencies();
}

void UAttributeSystemComponent::UpdateMaxXPDependenciesFloat(float OldValue, float NewValue)
{
	UpdateMaxXPDependencies();
}

int32 UAttributeSystemComponent::CalculateMaxCopperDependencies() const
{
	return GetTotalLevel() * 8;
}

void UAttributeSystemComponent::UpdateMaxCopperDependencies()
{
	int32 OldMaxCopper = GetTotalMaxCopper();
	DependentMaxCopper = CalculateMaxCopperDependencies();
	int32 NewMaxCopper = GetTotalMaxCopper();
	
	if (OldMaxCopper != NewMaxCopper)
		OnMaxCopperChanged.Broadcast(OldMaxCopper, NewMaxCopper);
}

void UAttributeSystemComponent::UpdateMaxCopperDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateMaxCopperDependencies();
}

void UAttributeSystemComponent::UpdateMaxCopperDependenciesFloat(float OldValue, float NewValue)
{
	UpdateMaxCopperDependencies();
}

int32 UAttributeSystemComponent::CalculateMaxSilverDependencies() const
{
	return GetTotalLevel() * 4;
}

void UAttributeSystemComponent::UpdateMaxSilverDependencies()
{
	int32 OldMaxSilver = GetTotalMaxSilver();
	DependentMaxSilver = CalculateMaxSilverDependencies();
	int32 NewMaxSilver = GetTotalMaxSilver();
	
	if (OldMaxSilver != NewMaxSilver)
		OnMaxSilverChanged.Broadcast(OldMaxSilver, NewMaxSilver);
}

void UAttributeSystemComponent::UpdateMaxSilverDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateMaxSilverDependencies();
}

void UAttributeSystemComponent::UpdateMaxSilverDependenciesFloat(float OldValue, float NewValue)
{
	UpdateMaxSilverDependencies();
}

int32 UAttributeSystemComponent::CalculateMaxGoldDependencies() const
{
	return GetTotalLevel() * 2;
}

void UAttributeSystemComponent::UpdateMaxGoldDependencies()
{
	int32 OldMaxGold = GetTotalMaxGold();
	DependentMaxGold = CalculateMaxGoldDependencies();
	int32 NewMaxGold = GetTotalMaxGold();
	
	if (OldMaxGold != NewMaxGold)
		OnMaxGoldChanged.Broadcast(OldMaxGold, NewMaxGold);
}

void UAttributeSystemComponent::UpdateMaxGoldDependenciesInt(int32 OldValue, int32 NewValue)
{
	UpdateMaxGoldDependencies();
}

void UAttributeSystemComponent::UpdateMaxGoldDependenciesFloat(float OldValue, float NewValue)
{
	UpdateMaxGoldDependencies();
}


void UAttributeSystemComponent::InitializeAttributeSystem()
{
	// Dependency Updates
	UpdateMaxHealthDependencies();
	UpdateHealthRegenerationDependencies();
	UpdateHealthDistortionDependencies();
	UpdateArmorDependencies();
	UpdateStrengthDependencies();
	UpdateDamageDependencies();
	UpdateMaxXPDependencies();
	UpdateMaxCopperDependencies();
	UpdateMaxSilverDependencies();
	UpdateMaxGoldDependencies();

	// Initializations
	InitializeHealth();
	InitializeDamage();
	InitializeResource();
	InitializeLevel();
	InitializeXP();
	InitializeCopper();
	InitializeSilver();
	InitializeGold();

}

template<typename T>
T UAttributeSystemComponent::RemapValue(T Value, T OldMin, T OldMax, T NewMin, T NewMax) const
{
	return FMath::GetMappedRangeValueClamped(FVector2D(OldMin, OldMax), FVector2D(NewMin, NewMax), Value);
}

template<typename T>
T UAttributeSystemComponent::ClampValue(T Value, T Min, T Max) const
{
	return FMath::Clamp(Value, Min, Max);
}

template<typename T>
bool UAttributeSystemComponent::ValueInRange(T Value, T Min, T Max) const
{
	return Value >= Min && Value <= Max;
}

FVector2D UAttributeSystemComponent::ClampVector2D(FVector2D Value, FVector2D Min, FVector2D Max) const
{
	FVector2D Result;
	Result.X = ClampValue(Value.X, Min.X, Max.X);
	Result.Y = ClampValue(Value.Y, Min.Y, Max.Y);
	return Result;
}

FVector UAttributeSystemComponent::ClampVector(FVector Value, FVector Min, FVector Max) const
{
	FVector Result;
	Result.X = ClampValue(Value.X, Min.X, Max.X);
	Result.Y = ClampValue(Value.Y, Min.Y, Max.Y);
	Result.Z = ClampValue(Value.Z, Min.Z, Max.Z);
	return Result;
}

FRotator UAttributeSystemComponent::ClampRotator(FRotator Value, FRotator Min, FRotator Max) const
{
	FRotator Result;
	Result.Roll = ClampValue(Value.Roll, Min.Roll, Max.Roll);
	Result.Pitch = ClampValue(Value.Pitch, Min.Pitch, Max.Pitch);
	Result.Yaw = ClampValue(Value.Yaw, Min.Yaw, Max.Yaw);
	return Result;
}

FTransform UAttributeSystemComponent::ClampTransform(FTransform Value, FTransform Min, FTransform Max) const
{
	FVector NewTranslation;
	NewTranslation.X = ClampValue(Value.GetTranslation().X, Min.GetTranslation().X, Max.GetTranslation().X);
	NewTranslation.Y = ClampValue(Value.GetTranslation().Y, Min.GetTranslation().Y, Max.GetTranslation().Y);
	NewTranslation.Z = ClampValue(Value.GetTranslation().Z, Min.GetTranslation().Z, Max.GetTranslation().Z);

	FVector NewScale3D;
	NewScale3D.X = ClampValue(Value.GetScale3D().X, Min.GetScale3D().X, Max.GetScale3D().X);
	NewScale3D.Y = ClampValue(Value.GetScale3D().Y, Min.GetScale3D().Y, Max.GetScale3D().Y);
	NewScale3D.Z = ClampValue(Value.GetScale3D().Z, Min.GetScale3D().Z, Max.GetScale3D().Z);

	FRotator NewRotation;
	NewRotation.Roll = ClampValue(Value.GetRotation().Rotator().Roll, Min.GetRotation().Rotator().Roll, Max.GetRotation().Rotator().Roll);
	NewRotation.Pitch = ClampValue(Value.GetRotation().Rotator().Pitch, Min.GetRotation().Rotator().Pitch, Max.GetRotation().Rotator().Pitch);
	NewRotation.Yaw = ClampValue(Value.GetRotation().Rotator().Yaw, Min.GetRotation().Rotator().Yaw, Max.GetRotation().Rotator().Yaw);

	return FTransform(NewRotation, NewTranslation, NewScale3D);
}

bool UAttributeSystemComponent::Vector2DInRange(FVector2D Value, FVector2D Min, FVector2D Max) const
{
	return Value.ComponentwiseAllGreaterOrEqual(Min) && Value.ComponentwiseAllLessOrEqual(Max);
}

bool UAttributeSystemComponent::VectorInRange(FVector Value, FVector Min, FVector Max) const
{
	return ((Value.X >= Min.X && Value.Y >= Min.Y && Value.Z >= Min.Z) && (Value.X <= Max.X && Value.Y <= Max.Y && Value.Z <= Max.Z));
}

bool UAttributeSystemComponent::RotatorInRange(FRotator Value, FRotator Min, FRotator Max) const
{
	return ((Value.Roll >= Min.Roll && Value.Pitch >= Min.Pitch && Value.Yaw >= Min.Yaw) && (Value.Roll <= Max.Roll && Value.Pitch <= Max.Pitch && Value.Yaw <= Max.Yaw));
}

bool UAttributeSystemComponent::TransformInRange(FTransform Value, FTransform Min, FTransform Max) const
{
	return VectorInRange(Value.GetTranslation(), Min.GetTranslation(), Max.GetTranslation()) && VectorInRange(Value.GetScale3D(), Min.GetScale3D(), Max.GetScale3D()) && RotatorInRange(Value.GetRotation().Rotator(), Min.GetRotation().Rotator(), Max.GetRotation().Rotator());
}

bool UAttributeSystemComponent::StringContainsExclusion(const FString& StringToCheck, TArray<FString> ExclusionArray) const
{
	for (const FString& ExclusionString : ExclusionArray)
		if (StringToCheck.Contains(ExclusionString))
			return true;
	return false;
}

bool UAttributeSystemComponent::StringRefusesInclusion(const FString& StringToCheck, TArray<FString> InclusionArray) const
{
	TArray<FString> Words;
	StringToCheck.ParseIntoArray(Words, TEXT(" "), true);
	for (FString WordToCheck : Words)
		if (!InclusionArray.Contains(WordToCheck))
			return true;
	return false;
}

bool UAttributeSystemComponent::ColorContainsExclusion(const FColor& ColorToCheck, TArray<FColor> ExclusionArray) const
{
	for (const FColor& ExclusionColor : ExclusionArray)
		if (ColorToCheck == ExclusionColor)
			return true;
	return false;
}

bool UAttributeSystemComponent::ColorRefusesInclusion(const FColor& ColorToCheck, TArray<FColor> InclusionArray) const
{
	for (const FColor& InclusionColor : InclusionArray)
		if (ColorToCheck == InclusionColor)
			return false;
	return true;
}
