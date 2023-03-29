// Copyright MDSE Research Group. All Rights Reserved.

#include "AttributeSystem/MOERandomGenerator.h"

float UMOERandomGenerator::GetRandomWithMOE_Implementation(float Value, float MOE) const
{
	return FMath::RandRange(Value - FMath::Abs(MOE), Value + FMath::Abs(MOE));
}
