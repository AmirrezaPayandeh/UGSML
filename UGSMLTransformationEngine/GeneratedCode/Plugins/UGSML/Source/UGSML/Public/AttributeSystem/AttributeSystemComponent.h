// Copyright MDSE Research Group. All Rights Reserved.

#pragma once

#include "CoreMinimal.h"

#include "Components/ActorComponent.h"
#include "UGSMLDelegates.h"
#include "Module/UGSMLModule.h"
#include "AttributeSystemComponent.generated.h"

// Forward Declarations
class UMOERandomGenerator;
class UNiagaraSystem;

UCLASS(ClassGroup=(GameSystems), meta=(BlueprintSpawnableComponent))
class UGSML_API UAttributeSystemComponent : public UActorComponent
{
	GENERATED_BODY()

public:
	UAttributeSystemComponent();

	virtual void TickComponent(float DeltaTime, ELevelTick TickType, FActorComponentTickFunction* ThisTickFunction) override;

	virtual void InitializeComponent() override;

protected:
	virtual void BeginPlay() override;

public:
	/// Delegates

	// Health
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Health")
	FFloatVariableStatusSignature OnHealthChanged;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Health")
	FMinMaxSignature OnHealthHitMax;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Health")
	FMinMaxSignature OnHealthHitMin;

	// MaxHealth
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxHealth")
	FFloatVariableStatusSignature OnMaxHealthChanged;

	// HealthRegeneration
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|HealthRegeneration")
	FFloatVariableStatusSignature OnHealthRegenerationChanged;

	// HealthRegenerationDistortion
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|HealthRegenerationDistortion")
	FFloatVariableStatusSignature OnHealthRegenerationDistortionChanged;

	// HealthDistortion
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|HealthDistortion")
	FFloatVariableStatusSignature OnHealthDistortionChanged;

	// Armor
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Armor")
	FIntVariableStatusSignature OnArmorChanged;

	// Strength
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Strength")
	FIntVariableStatusSignature OnStrengthChanged;

	// Damage
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Damage")
	FFloatVariableStatusSignature OnDamageChanged;

	// DamageMarginOfError
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|DamageMarginOfError")
	FFloatVariableStatusSignature OnDamageMarginOfErrorChanged;

	// Resource
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Resource")
	FIntVariableStatusSignature OnResourceChanged;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Resource")
	FMinMaxSignature OnResourceHitMax;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Resource")
	FMinMaxSignature OnResourceHitMin;

	// MaxResource
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxResource")
	FIntVariableStatusSignature OnMaxResourceChanged;

	// Level
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Level")
	FIntVariableStatusSignature OnLevelChanged;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Level")
	FMinMaxSignature OnLevelHitMax;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Level")
	FMinMaxSignature OnLevelHitMin;

	// MaxLevel
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxLevel")
	FIntVariableStatusSignature OnMaxLevelChanged;

	// XP
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|XP")
	FIntVariableStatusSignature OnXPChanged;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|XP")
	FMinMaxSignature OnXPHitMax;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|XP")
	FMinMaxSignature OnXPHitMin;

	// MaxXP
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxXP")
	FIntVariableStatusSignature OnMaxXPChanged;

	// Copper
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Copper")
	FIntVariableStatusSignature OnCopperChanged;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Copper")
	FMinMaxSignature OnCopperHitMax;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Copper")
	FMinMaxSignature OnCopperHitMin;

	// MaxCopper
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxCopper")
	FIntVariableStatusSignature OnMaxCopperChanged;

	// Silver
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Silver")
	FIntVariableStatusSignature OnSilverChanged;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Silver")
	FMinMaxSignature OnSilverHitMax;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Silver")
	FMinMaxSignature OnSilverHitMin;

	// MaxSilver
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxSilver")
	FIntVariableStatusSignature OnMaxSilverChanged;

	// Gold
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Gold")
	FIntVariableStatusSignature OnGoldChanged;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Gold")
	FMinMaxSignature OnGoldHitMax;
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|Gold")
	FMinMaxSignature OnGoldHitMin;

	// MaxGold
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxGold")
	FIntVariableStatusSignature OnMaxGoldChanged;

	// IsDead
	UPROPERTY(BlueprintAssignable, Category = "Attribute System|IsDead")
	FBoolVariableStatusSignature OnIsDeadChanged;

	// HeroName
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|HeroName")
	FNameVariableStatusSignature OnHeroNameChanged;

	// MaxHeroNameLength
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxHeroNameLength")
	FIntVariableStatusSignature OnMaxHeroNameLengthChanged;

	// MyVector2D
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MyVector2D")
	FVector2DVariableStatusSignature OnMyVector2DChanged;

	// MinMyVector2D
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MinMyVector2D")
	FVector2DVariableStatusSignature OnMinMyVector2DChanged;

	// MaxMyVector2D
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxMyVector2D")
	FVector2DVariableStatusSignature OnMaxMyVector2DChanged;

	// DestinationLocation
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|DestinationLocation")
	FVectorVariableStatusSignature OnDestinationLocationChanged;

	// MinDestinationLocation
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MinDestinationLocation")
	FVectorVariableStatusSignature OnMinDestinationLocationChanged;

	// MaxDestinationLocation
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxDestinationLocation")
	FVectorVariableStatusSignature OnMaxDestinationLocationChanged;

	// MyRotator
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MyRotator")
	FRotatorVariableStatusSignature OnMyRotatorChanged;

	// MinMyRotator
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MinMyRotator")
	FRotatorVariableStatusSignature OnMinMyRotatorChanged;

	// MaxMyRotator
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxMyRotator")
	FRotatorVariableStatusSignature OnMaxMyRotatorChanged;

	// MyTransform
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MyTransform")
	FTransformationVariableStatusSignature OnMyTransformChanged;

	// MinMyTransform
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MinMyTransform")
	FTransformationVariableStatusSignature OnMinMyTransformChanged;

	// MaxMyTransform
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MaxMyTransform")
	FTransformationVariableStatusSignature OnMaxMyTransformChanged;

	// HairColor
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|HairColor")
	FColorVariableStatusSignature OnHairColorChanged;

	// MyCarColor
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MyCarColor")
	FCarColorVariableStatusSignature OnMyCarColorChanged;

	// CurrentWeather
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|CurrentWeather")
	FWeatherTypeVariableStatusSignature OnCurrentWeatherChanged;

	// MyStruct
	UPROPERTY(BlueprintAssignable, Category = "AttributeSystem|MyStruct")
	FMyStructVariableStatusSignature OnMyStructChanged;

	/// ~Delegates

	/// Functions

	// DeathSounds
	UFUNCTION(BlueprintCallable, Category = "Attribute System|DeathSounds")
	void AddDeathSounds(USoundBase* Value);
	UFUNCTION(BlueprintCallable, Category = "Attribute System|DeathSounds")
	void RemoveDeathSounds(USoundBase* Value);
	UFUNCTION(BlueprintCallable, Category = "Attribute System|DeathSounds")
	TArray<USoundBase*> GetDeathSounds() const;

	// HeroNameExclusions
	UFUNCTION(BlueprintCallable, Category = "Attribute System|HeroNameExclusions")
	void AddHeroNameExclusions(FString Value);
	UFUNCTION(BlueprintCallable, Category = "Attribute System|HeroNameExclusions")
	void RemoveHeroNameExclusions(FString Value);
	UFUNCTION(BlueprintCallable, Category = "Attribute System|HeroNameExclusions")
	TArray<FString> GetHeroNameExclusions() const;

	// HairColorInclusions
	UFUNCTION(BlueprintCallable, Category = "Attribute System|HairColorInclusions")
	void AddHairColorInclusions(FColor Value);
	UFUNCTION(BlueprintCallable, Category = "Attribute System|HairColorInclusions")
	void RemoveHairColorInclusions(FColor Value);
	UFUNCTION(BlueprintCallable, Category = "Attribute System|HairColorInclusions")
	TArray<FColor> GetHairColorInclusions() const;

	// Health
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Health")
	void SetHealth(float Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Health")
	bool AddHealth(float Amount, bool ApplyDistortion);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Health")
	float GetDynamicHealth() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Health")
	float GetTotalHealth() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	bool IsHealthRegenerationDisabled() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	void DisableHealthRegeneration();
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	void EnableHealthRegeneration();
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	void ToggleHealthRegeneration();

	// MinHealth
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinHealth")
	float GetDynamicMinHealth() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinHealth")
	float GetTotalMinHealth() const;

	// MaxHealth
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHealth")
	void SetMaxHealth(float Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHealth")
	bool AddMaxHealth(float Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHealth")
	float GetBaseMaxHealth() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHealth")
	float GetDependentMaxHealth() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHealth")
	float GetDynamicMaxHealth() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHealth")
	float GetTotalMaxHealth() const;

	// HealthRegeneration
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	void SetHealthRegeneration(float Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	bool AddHealthRegeneration(float Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	float GetBaseHealthRegeneration() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	float GetDependentHealthRegeneration() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	float GetDynamicHealthRegeneration() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegeneration")
	float GetTotalHealthRegeneration() const;

	// HealthRegenerationDistortion
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegenerationDistortion")
	void SetHealthRegenerationDistortion(float Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegenerationDistortion")
	bool AddHealthRegenerationDistortion(float Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegenerationDistortion")
	float GetDynamicHealthRegenerationDistortion() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthRegenerationDistortion")
	float GetTotalHealthRegenerationDistortion() const;

	// HealthDistortion
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthDistortion")
	void SetHealthDistortion(float Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthDistortion")
	bool AddHealthDistortion(float Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthDistortion")
	float GetDependentHealthDistortion() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthDistortion")
	float GetDynamicHealthDistortion() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HealthDistortion")
	float GetTotalHealthDistortion() const;

	// Armor
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Armor")
	void SetArmor(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Armor")
	bool AddArmor(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Armor")
	int32 GetBaseArmor() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Armor")
	int32 GetDependentArmor() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Armor")
	int32 GetDynamicArmor() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Armor")
	int32 GetTotalArmor() const;

	// Strength
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Strength")
	void SetStrength(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Strength")
	bool AddStrength(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Strength")
	int32 GetBaseStrength() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Strength")
	int32 GetDependentStrength() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Strength")
	int32 GetDynamicStrength() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Strength")
	int32 GetTotalStrength() const;

	// Damage
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Damage")
	void SetDamage(float Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Damage")
	bool AddDamage(float Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Damage")
	float GetBaseDamage() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Damage")
	float GetDependentDamage() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Damage")
	float GetDynamicDamage() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Damage")
	float GetTotalDamage() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Damage")
	void SetDamageMOERandomGenerator(TSubclassOf<UMOERandomGenerator> MOERandomGeneratorClass);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Damage")
	float GetRandomDamage() const;

	// DamageMarginOfError
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|DamageMarginOfError")
	void SetDamageMarginOfError(float Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|DamageMarginOfError")
	bool AddDamageMarginOfError(float Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|DamageMarginOfError")
	float GetDynamicDamageMarginOfError() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|DamageMarginOfError")
	float GetTotalDamageMarginOfError() const;

	// Resource
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Resource")
	void SetResource(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Resource")
	bool CanAddResource(int32 Amount) const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Resource")
	bool AddResource(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Resource")
	int32 GetDynamicResource() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Resource")
	int32 GetTotalResource() const;

	// MinResource
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinResource")
	int32 GetDynamicMinResource() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinResource")
	int32 GetTotalMinResource() const;

	// MaxResource
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxResource")
	void SetMaxResource(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxResource")
	bool AddMaxResource(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxResource")
	int32 GetBaseMaxResource() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxResource")
	int32 GetDynamicMaxResource() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxResource")
	int32 GetTotalMaxResource() const;

	// Level
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Level")
	void SetLevel(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Level")
	bool CanAddLevel(int32 Amount) const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Level")
	bool AddLevel(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Level")
	int32 GetDynamicLevel() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Level")
	int32 GetTotalLevel() const;

	// MinLevel
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinLevel")
	int32 GetDynamicMinLevel() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinLevel")
	int32 GetTotalMinLevel() const;

	// MaxLevel
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxLevel")
	void SetMaxLevel(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxLevel")
	bool AddMaxLevel(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxLevel")
	int32 GetDynamicMaxLevel() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxLevel")
	int32 GetTotalMaxLevel() const;

	// XP
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|XP")
	void SetXP(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|XP")
	bool AddXP(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|XP")
	int32 GetDynamicXP() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|XP")
	int32 GetTotalXP() const;

	// MinXP
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinXP")
	int32 GetDynamicMinXP() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinXP")
	int32 GetTotalMinXP() const;

	// MaxXP
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxXP")
	void SetMaxXP(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxXP")
	bool AddMaxXP(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxXP")
	int32 GetDependentMaxXP() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxXP")
	int32 GetDynamicMaxXP() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxXP")
	int32 GetTotalMaxXP() const;

	// Copper
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Copper")
	void SetCopper(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Copper")
	bool CanAddCopper(int32 Amount) const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Copper")
	bool AddCopper(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Copper")
	int32 GetDynamicCopper() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Copper")
	int32 GetTotalCopper() const;

	// MinCopper
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinCopper")
	int32 GetDynamicMinCopper() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinCopper")
	int32 GetTotalMinCopper() const;

	// MaxCopper
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxCopper")
	void SetMaxCopper(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxCopper")
	bool AddMaxCopper(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxCopper")
	int32 GetBaseMaxCopper() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxCopper")
	int32 GetDependentMaxCopper() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxCopper")
	int32 GetDynamicMaxCopper() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxCopper")
	int32 GetTotalMaxCopper() const;

	// Silver
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Silver")
	void SetSilver(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Silver")
	bool CanAddSilver(int32 Amount) const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Silver")
	bool AddSilver(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Silver")
	int32 GetDynamicSilver() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Silver")
	int32 GetTotalSilver() const;

	// MinSilver
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinSilver")
	int32 GetDynamicMinSilver() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinSilver")
	int32 GetTotalMinSilver() const;

	// MaxSilver
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxSilver")
	void SetMaxSilver(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxSilver")
	bool AddMaxSilver(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxSilver")
	int32 GetBaseMaxSilver() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxSilver")
	int32 GetDependentMaxSilver() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxSilver")
	int32 GetDynamicMaxSilver() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxSilver")
	int32 GetTotalMaxSilver() const;

	// Gold
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Gold")
	void SetGold(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Gold")
	bool CanAddGold(int32 Amount) const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Gold")
	bool AddGold(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Gold")
	int32 GetDynamicGold() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|Gold")
	int32 GetTotalGold() const;

	// MinGold
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinGold")
	int32 GetDynamicMinGold() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinGold")
	int32 GetTotalMinGold() const;

	// MaxGold
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxGold")
	void SetMaxGold(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxGold")
	bool AddMaxGold(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxGold")
	int32 GetBaseMaxGold() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxGold")
	int32 GetDependentMaxGold() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxGold")
	int32 GetDynamicMaxGold() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxGold")
	int32 GetTotalMaxGold() const;

	// IsDead
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|IsDead")
	void SetIsDead(bool Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|IsDead")
	void ToggleIsDead();
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|IsDead")
	bool GetIsDead() const;

	// HeroName
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HeroName")
	bool SetHeroName(FName Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HeroName")
	FName GetHeroName() const;

	// MaxHeroNameLength
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHeroNameLength")
	void SetMaxHeroNameLength(int32 Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHeroNameLength")
	bool AddMaxHeroNameLength(int32 Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHeroNameLength")
	int32 GetDynamicMaxHeroNameLength() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxHeroNameLength")
	int32 GetTotalMaxHeroNameLength() const;

	// MyVector2D
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyVector2D")
	void SetMyVector2D(FVector2D Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyVector2D")
	bool AddMyVector2D(FVector2D Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyVector2D")
	FVector2D GetMyVector2D() const;

	// MinMyVector2D
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyVector2D")
	void SetMinMyVector2D(FVector2D Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyVector2D")
	bool AddMinMyVector2D(FVector2D Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyVector2D")
	FVector2D GetMinMyVector2D() const;

	// MaxMyVector2D
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyVector2D")
	void SetMaxMyVector2D(FVector2D Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyVector2D")
	bool AddMaxMyVector2D(FVector2D Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyVector2D")
	FVector2D GetMaxMyVector2D() const;

	// DestinationLocation
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|DestinationLocation")
	void SetDestinationLocation(FVector Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|DestinationLocation")
	bool AddDestinationLocation(FVector Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|DestinationLocation")
	FVector GetDestinationLocation() const;

	// MinDestinationLocation
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinDestinationLocation")
	void SetMinDestinationLocation(FVector Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinDestinationLocation")
	bool AddMinDestinationLocation(FVector Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinDestinationLocation")
	FVector GetMinDestinationLocation() const;

	// MaxDestinationLocation
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxDestinationLocation")
	void SetMaxDestinationLocation(FVector Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxDestinationLocation")
	bool AddMaxDestinationLocation(FVector Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxDestinationLocation")
	FVector GetMaxDestinationLocation() const;

	// MyRotator
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyRotator")
	void SetMyRotator(FRotator Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyRotator")
	bool AddMyRotator(FRotator Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyRotator")
	FRotator GetMyRotator() const;

	// MinMyRotator
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyRotator")
	void SetMinMyRotator(FRotator Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyRotator")
	bool AddMinMyRotator(FRotator Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyRotator")
	FRotator GetMinMyRotator() const;

	// MaxMyRotator
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyRotator")
	void SetMaxMyRotator(FRotator Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyRotator")
	bool AddMaxMyRotator(FRotator Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyRotator")
	FRotator GetMaxMyRotator() const;

	// MyTransform
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyTransform")
	void SetMyTransform(FTransform Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyTransform")
	bool AddMyTransform(FTransform Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyTransform")
	FTransform GetMyTransform() const;

	// MinMyTransform
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyTransform")
	void SetMinMyTransform(FTransform Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyTransform")
	bool AddMinMyTransform(FTransform Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MinMyTransform")
	FTransform GetMinMyTransform() const;

	// MaxMyTransform
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyTransform")
	void SetMaxMyTransform(FTransform Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyTransform")
	bool AddMaxMyTransform(FTransform Amount);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MaxMyTransform")
	FTransform GetMaxMyTransform() const;

	// HairColor
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HairColor")
	bool SetHairColor(FColor Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|HairColor")
	FColor GetHairColor() const;

	// MyCarColor
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyCarColor")
	void SetMyCarColor(ECarColor Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyCarColor")
	ECarColor GetMyCarColor() const;

	// CurrentWeather
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|CurrentWeather")
	void AddCurrentWeatherKey(int32 Key);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|CurrentWeather")
	void RemoveCurrentWeatherKey(int32 Key);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|CurrentWeather")
	int32 GetCurrentWeather() const;
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|CurrentWeather")
	bool CurrentWeatherHasKey(int32 Key) const;

	// MyStruct
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyStruct")
	void SetMyStruct(FMyStruct Value);
	UFUNCTION(BlueprintCallable, Category = "AttributeSystem|MyStruct")
	FMyStruct GetMyStruct() const;

	/// ~Functions

protected:
	/// Arrays

	// DeathSounds
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|DeathSounds")
	TArray<USoundBase*> DeathSounds;

	// HeroNameExclusions
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|HeroNameExclusions")
	TArray<FString> HeroNameExclusions;

	// HairColorInclusions
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|HairColorInclusions")
	TArray<FColor> HairColorInclusions;
	/// ~Arrays

	/// Single Attributes

	// Health
	float Health = 0.0f;
	bool bIsHealthRegenerationDisabled = 0.0f;

	// MinHealth
	const float MinHealth = 0.0f;

	// MaxHealth
	float MaxHealth = 0.0f;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	float BaseMaxHealth = BASE_MAXHEALTH;
	float DependentMaxHealth = 0;

	// HealthRegeneration
	float HealthRegeneration = 0.0f;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	float BaseHealthRegeneration = BASE_HEALTHREGENERATION;
	float DependentHealthRegeneration = 0;

	// HealthRegenerationDistortion
	float HealthRegenerationDistortion = 0.0f;

	// HealthDistortion
	float HealthDistortion = 0.0f;
	float DependentHealthDistortion = 0;

	// Armor
	int32 Armor = 0;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	int32 BaseArmor = BASE_ARMOR;
	int32 DependentArmor = 0;

	// Strength
	int32 Strength = 0;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	int32 BaseStrength = BASE_STRENGTH;
	int32 DependentStrength = 0;

	// Damage
	float Damage = 0.0f;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|MOE")
	TSubclassOf<UMOERandomGenerator> DamageMOERandomGeneratorClass = nullptr;
	TObjectPtr<UMOERandomGenerator> DamageMOERandomGenerator = nullptr;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	float BaseDamage = BASE_DAMAGE;
	float DependentDamage = 0;

	// DamageMarginOfError
	float DamageMarginOfError = 0.0f;

	// Resource
	int32 Resource = 0;

	// MinResource
	const int32 MinResource = 0;

	// MaxResource
	int32 MaxResource = 0;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	int32 BaseMaxResource = BASE_MAXRESOURCE;

	// Level
	int32 Level = 0;

	// MinLevel
	const int32 MinLevel = 0;

	// MaxLevel
	int32 MaxLevel = 0;

	// XP
	int32 XP = 0;

	// MinXP
	const int32 MinXP = 0;

	// MaxXP
	int32 MaxXP = 0;
	int32 DependentMaxXP = 0;

	// Copper
	int32 Copper = 0;

	// MinCopper
	const int32 MinCopper = 0;

	// MaxCopper
	int32 MaxCopper = 0;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	int32 BaseMaxCopper = BASE_MAXCOPPER;
	int32 DependentMaxCopper = 0;

	// Silver
	int32 Silver = 0;

	// MinSilver
	const int32 MinSilver = 0;

	// MaxSilver
	int32 MaxSilver = 0;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	int32 BaseMaxSilver = BASE_MAXSILVER;
	int32 DependentMaxSilver = 0;

	// Gold
	int32 Gold = 0;

	// MinGold
	const int32 MinGold = 0;

	// MaxGold
	int32 MaxGold = 0;
	UPROPERTY(EditAnywhere, Category = "AttributeSystem|BaseAttribute")
	int32 BaseMaxGold = BASE_MAXGOLD;
	int32 DependentMaxGold = 0;

	// IsDead
	bool bIsDead = false;

	// HeroName
	FName HeroName = FName("");

	// MaxHeroNameLength
	int32 MaxHeroNameLength = 0;

	// MyVector2D
	FVector2D MyVector2D = FVector2D(0.0f, 0.0f);

	// MinMyVector2D
	FVector2D MinMyVector2D = FVector2D(0.0f, 0.0f);

	// MaxMyVector2D
	FVector2D MaxMyVector2D = FVector2D(0.0f, 0.0f);

	// DestinationLocation
	FVector DestinationLocation = FVector(0.0f, 0.0f, 0.0f);

	// MinDestinationLocation
	FVector MinDestinationLocation = FVector(0.0f, 0.0f, 0.0f);

	// MaxDestinationLocation
	FVector MaxDestinationLocation = FVector(0.0f, 0.0f, 0.0f);

	// MyRotator
	FRotator MyRotator = FRotator(0.0f, 0.0f, 0.0f);

	// MinMyRotator
	FRotator MinMyRotator = FRotator(0.0f, 0.0f, 0.0f);

	// MaxMyRotator
	FRotator MaxMyRotator = FRotator(0.0f, 0.0f, 0.0f);

	// MyTransform
	FTransform MyTransform = FTransform(FRotator(0.0f, 0.0f, 0.0f), FVector(0.0f, 0.0f, 0.0f), FVector(0.0f, 0.0f, 0.0f));

	// MinMyTransform
	FTransform MinMyTransform = FTransform(FRotator(0.0f, 0.0f, 0.0f), FVector(0.0f, 0.0f, 0.0f), FVector(0.0f, 0.0f, 0.0f));

	// MaxMyTransform
	FTransform MaxMyTransform = FTransform(FRotator(0.0f, 0.0f, 0.0f), FVector(0.0f, 0.0f, 0.0f), FVector(0.0f, 0.0f, 0.0f));

	// HairColor
	FColor HairColor = FColor(0, 0, 0, 255);

	// MyCarColor
	ECarColor MyCarColor = ECarColor::Red;

	// CurrentWeather
	UPROPERTY(Meta = (Bitmask, BitmaskEnum = "EWeatherType::Type"))
	int32 CurrentWeather = static_cast<int32>(EWeatherType::Sunny);

	// MyStruct
	FMyStruct MyStruct;
	/// ~Single Attributes

private:
	/// Other

	// Health
	void InitializeHealth();
	UFUNCTION()
	void RemapHealthForMax(float OldMaxHealth, float NewMaxHealth);
	void RegenerateHealth(float DeltaTime);

	// Damage
	void InitializeDamage();

	// Resource
	void InitializeResource();
	UFUNCTION()
	void ReclampResourceInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void ReclampResourceFloat(float OldValue, float NewValue);

	// Level
	void InitializeLevel();
	UFUNCTION()
	void ReclampLevelInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void ReclampLevelFloat(float OldValue, float NewValue);

	// XP
	void InitializeXP();
	UFUNCTION()
	void ReclampXPInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void ReclampXPFloat(float OldValue, float NewValue);

	// Copper
	void InitializeCopper();
	UFUNCTION()
	void ReclampCopperInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void ReclampCopperFloat(float OldValue, float NewValue);

	// Silver
	void InitializeSilver();
	UFUNCTION()
	void ReclampSilverInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void ReclampSilverFloat(float OldValue, float NewValue);

	// Gold
	void InitializeGold();
	UFUNCTION()
	void ReclampGoldInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void ReclampGoldFloat(float OldValue, float NewValue);

	/// ~Other

	/// Dependency Functions

	// MaxHealth
	float CalculateMaxHealthDependencies() const;
	void UpdateMaxHealthDependencies();
	UFUNCTION()
	void UpdateMaxHealthDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateMaxHealthDependenciesFloat(float OldValue, float NewValue);

	// HealthRegeneration
	float CalculateHealthRegenerationDependencies() const;
	void UpdateHealthRegenerationDependencies();
	UFUNCTION()
	void UpdateHealthRegenerationDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateHealthRegenerationDependenciesFloat(float OldValue, float NewValue);

	// HealthDistortion
	float CalculateHealthDistortionDependencies() const;
	void UpdateHealthDistortionDependencies();
	UFUNCTION()
	void UpdateHealthDistortionDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateHealthDistortionDependenciesFloat(float OldValue, float NewValue);

	// Armor
	int32 CalculateArmorDependencies() const;
	void UpdateArmorDependencies();
	UFUNCTION()
	void UpdateArmorDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateArmorDependenciesFloat(float OldValue, float NewValue);

	// Strength
	int32 CalculateStrengthDependencies() const;
	void UpdateStrengthDependencies();
	UFUNCTION()
	void UpdateStrengthDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateStrengthDependenciesFloat(float OldValue, float NewValue);

	// Damage
	float CalculateDamageDependencies() const;
	void UpdateDamageDependencies();
	UFUNCTION()
	void UpdateDamageDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateDamageDependenciesFloat(float OldValue, float NewValue);

	// MaxXP
	int32 CalculateMaxXPDependencies() const;
	void UpdateMaxXPDependencies();
	UFUNCTION()
	void UpdateMaxXPDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateMaxXPDependenciesFloat(float OldValue, float NewValue);

	// MaxCopper
	int32 CalculateMaxCopperDependencies() const;
	void UpdateMaxCopperDependencies();
	UFUNCTION()
	void UpdateMaxCopperDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateMaxCopperDependenciesFloat(float OldValue, float NewValue);

	// MaxSilver
	int32 CalculateMaxSilverDependencies() const;
	void UpdateMaxSilverDependencies();
	UFUNCTION()
	void UpdateMaxSilverDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateMaxSilverDependenciesFloat(float OldValue, float NewValue);

	// MaxGold
	int32 CalculateMaxGoldDependencies() const;
	void UpdateMaxGoldDependencies();
	UFUNCTION()
	void UpdateMaxGoldDependenciesInt(int32 OldValue, int32 NewValue);
	UFUNCTION()
	void UpdateMaxGoldDependenciesFloat(float OldValue, float NewValue);

	/// ~Dependency Functions

	// Auxiliary Functions
	void InitializeAttributeSystem();

protected:
	template<typename T>
	T RemapValue(T Value, T OldMin, T OldMax, T NewMin, T NewMax) const;

	template<typename T>
	T ClampValue(T Value, T Min, T Max) const;

	FVector2D ClampVector2D(FVector2D Value, FVector2D Min, FVector2D Max) const;

	FVector ClampVector(FVector Value, FVector Min, FVector Max) const;

	FRotator ClampRotator(FRotator Value, FRotator Min, FRotator Max) const;

	FTransform ClampTransform(FTransform Value, FTransform Min, FTransform Max) const;

	template<typename T>
	bool ValueInRange(T Value, T Min, T Max) const;

	bool Vector2DInRange(FVector2D Value, FVector2D Min, FVector2D Max) const;

	bool VectorInRange(FVector Value, FVector Min, FVector Max) const;

	bool RotatorInRange(FRotator Value, FRotator Min, FRotator Max) const;

	bool TransformInRange(FTransform Value, FTransform Min, FTransform Max) const;

	bool StringContainsExclusion(const FString& StringToCheck, TArray<FString> ExclusionArray) const;

	bool StringRefusesInclusion(const FString& StringToCheck, TArray<FString> InclusionArray) const;

	bool ColorContainsExclusion(const FColor& ColorToCheck, TArray<FColor> ExclusionArray) const;

	bool ColorRefusesInclusion(const FColor& ColorToCheck, TArray<FColor> InclusionArray) const;
};
