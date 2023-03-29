// Copyright MDSE Research Group. All Rights Reserved.

#pragma once

#include "CoreMinimal.h"
#include "UGSMLDependencies.h"

#include "UGSMLDelegates.generated.h"

UCLASS()
class UGSML_API UUGSMLDelegates : public UObject
{
	GENERATED_BODY()
};

DECLARE_DYNAMIC_MULTICAST_DELEGATE(FMinMaxSignature);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FFloatVariableStatusSignature, float, OldValue, float, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FIntVariableStatusSignature, int32, OldValue, int32, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FBoolVariableStatusSignature, bool, OldValue, bool, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FNameVariableStatusSignature, FName, OldValue, FName, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FStringVariableStatusSignature, FString, OldValue, FString, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FTextVariableStatusSignature, FText, OldValue, FText, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FVector2DVariableStatusSignature, FVector2D, OldValue, FVector2D, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FVectorVariableStatusSignature, FVector, OldValue, FVector, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FRotatorVariableStatusSignature, FRotator, OldValue, FRotator, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FTransformationVariableStatusSignature, FTransform, OldValue, FTransform, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FColorVariableStatusSignature, FColor, OldValue, FColor, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FTextureVariableStatusSignature, UTexture2D*, OldValue, UTexture2D*, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FModelVariableStatusSignature, UStaticMesh*, OldValue, UStaticMesh*, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FParticleVariableStatusSignature, UNiagaraSystem*, OldValue, UNiagaraSystem*, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FAudioVariableStatusSignature, USoundBase*, OldValue, USoundBase*, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FMaterialVariableStatusSignature, UMaterialInterface*, OldValue, UMaterialInterface*, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FAnimationVariableStatusSignature, UAnimMontage*, OldValue, UAnimMontage*, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FCarColorVariableStatusSignature, ECarColor, OldValue, ECarColor, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FWeatherTypeVariableStatusSignature, EWeatherType::Type, OldValue, EWeatherType::Type, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FMyStructVariableStatusSignature, FMyStruct, OldValue, FMyStruct, NewValue);
DECLARE_DYNAMIC_MULTICAST_DELEGATE_TwoParams(FMySecondStructureVariableStatusSignature, FMySecondStructure, OldValue, FMySecondStructure, NewValue);
