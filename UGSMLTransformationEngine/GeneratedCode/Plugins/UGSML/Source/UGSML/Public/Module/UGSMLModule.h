// Copyright MDSE Research Group. All Rights Reserved.

#pragma once

#include "CoreMinimal.h"
#include "Modules/ModuleManager.h"

class FUGSMLModule : public IModuleInterface
{
public:
	virtual void StartupModule() override;
	virtual void ShutdownModule() override;
};
/// AttributeSystem
DECLARE_LOG_CATEGORY_EXTERN(LogAttributeSystem, Log, All);

// BaseMaxHealth
#define BASE_MAXHEALTH 100.0

// BaseHealthRegeneration
#define BASE_HEALTHREGENERATION 1.0

// BaseArmor
#define BASE_ARMOR 2.0

// BaseStrength
#define BASE_STRENGTH 5.0

// BaseDamage
#define BASE_DAMAGE 20.0

// BaseMaxResource
#define BASE_MAXRESOURCE 100.0

// BaseMaxCopper
#define BASE_MAXCOPPER 92.0

// BaseMaxSilver
#define BASE_MAXSILVER 96.0

// BaseMaxGold
#define BASE_MAXGOLD 2.0
/// ~End AttributeSystem
