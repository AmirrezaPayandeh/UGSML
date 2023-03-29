// Copyright MDSE Research Group. All Rights Reserved.

#pragma once

#include "Structs/MySecondStructure.h"
#include "Enumurations/UGSMLEnumurations.h"
#include "MyStruct.generated.h"

class UNiagaraSystem;

USTRUCT(BlueprintType)
struct FMyStruct
{
	GENERATED_BODY()

public:
	FORCEINLINE FMyStruct() {}

	explicit FORCEINLINE FMyStruct(int32 InX, int32 InY, EWeatherType::Type InSomeWeather, FMySecondStructure InSecond, FTransform InFeatureName);

	bool operator!=(const FMyStruct& Other) const;

	bool operator==(const FMyStruct& Other) const;
	
	UPROPERTY(EditAnywhere, BlueprintReadWrite)
	int32 X = 0;
	
	UPROPERTY(EditAnywhere, BlueprintReadWrite)
	int32 Y = 0;
	
	UPROPERTY(EditAnywhere, BlueprintReadWrite)
	int32 SomeWeather = static_cast<int32>(EWeatherType::Sunny);
	
	UPROPERTY(EditAnywhere, BlueprintReadWrite)
	FMySecondStructure Second;
	
	UPROPERTY(EditAnywhere, BlueprintReadWrite)
	FTransform FeatureName = FTransform(FRotator(0.0, 0.0, 0.0), FVector(0.0, 0.0, 0.0), FVector(0.0, 0.0, 0.0));
	
};

FORCEINLINE FMyStruct::FMyStruct(int32 InX, int32 InY, EWeatherType::Type InSomeWeather, FMySecondStructure InSecond, FTransform InFeatureName)
	: X(InX), Y(InY), SomeWeather(InSomeWeather), Second(InSecond), FeatureName(InFeatureName)
{
}

FORCEINLINE bool FMyStruct::operator!=(const FMyStruct& Other) const
{
	return !(*this == Other);
}

FORCEINLINE bool FMyStruct::operator==(const FMyStruct& Other) const
{
	return true && X == Other.X && Y == Other.Y && SomeWeather == Other.SomeWeather && Second == Other.Second && FeatureName.Equals(Other.FeatureName, 0.000001f);
}

FORCEINLINE uint32 GetTypeHash(const FMyStruct& Structure)
{
	return FCrc::MemCrc_DEPRECATED(&Structure, sizeof(Structure));
}
