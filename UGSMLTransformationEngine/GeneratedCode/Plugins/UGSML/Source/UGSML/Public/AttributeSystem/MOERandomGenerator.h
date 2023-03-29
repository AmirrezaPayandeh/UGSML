// Copyright MDSE Research Group. All Rights Reserved.

#pragma once

#include "CoreMinimal.h"
#include "UObject/NoExportTypes.h"
#include "MOERandomGenerator.generated.h"

/**
 * Base margin of error random generator. Inherit from this class and implement your own random function in c++ or blueprint.
 */
UCLASS(Blueprintable, BlueprintType)
class UGSML_API UMOERandomGenerator : public UObject
{
	GENERATED_BODY()
	
public:
	UFUNCTION(BlueprintNativeEvent, Category = "MOE")
	float GetRandomWithMOE(float Value, float MOE) const;
	virtual float GetRandomWithMOE_Implementation(float Value, float MOE) const;

};
