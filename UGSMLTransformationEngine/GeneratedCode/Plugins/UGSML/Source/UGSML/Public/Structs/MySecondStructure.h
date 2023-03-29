// Copyright MDSE Research Group. All Rights Reserved.

#pragma once

#include "Enumurations/UGSMLEnumurations.h"
#include "MySecondStructure.generated.h"

class UNiagaraSystem;

USTRUCT(BlueprintType)
struct FMySecondStructure
{
	GENERATED_BODY()

public:
	FORCEINLINE FMySecondStructure() {}

	explicit FORCEINLINE FMySecondStructure(float InSomeFloat, bool InSomeBoolean);

	bool operator!=(const FMySecondStructure& Other) const;

	bool operator==(const FMySecondStructure& Other) const;
	
	UPROPERTY(EditAnywhere, BlueprintReadWrite)
	float SomeFloat = 0.0f;
	
	UPROPERTY(EditAnywhere, BlueprintReadWrite)
	bool bSomeBoolean = true;
	
};

FORCEINLINE FMySecondStructure::FMySecondStructure(float InSomeFloat, bool InSomeBoolean)
	: SomeFloat(InSomeFloat), bSomeBoolean(InSomeBoolean)
{
}

FORCEINLINE bool FMySecondStructure::operator!=(const FMySecondStructure& Other) const
{
	return !(*this == Other);
}

FORCEINLINE bool FMySecondStructure::operator==(const FMySecondStructure& Other) const
{
	return true && SomeFloat == Other.SomeFloat && bSomeBoolean == Other.bSomeBoolean;
}

FORCEINLINE uint32 GetTypeHash(const FMySecondStructure& Structure)
{
	return FCrc::MemCrc_DEPRECATED(&Structure, sizeof(Structure));
}
