// Copyright MDSE Research Group. All Rights Reserved.

#pragma once


UENUM(BlueprintType)
enum class ECarColor : uint8
{
	Red UMETA(DisplayName = "Red"),
	Green UMETA(DisplayName = "Green"),
	Blue UMETA(DisplayName = "Blue"),
	White UMETA(DisplayName = "White"),
	Black UMETA(DisplayName = "Black"),
};

UENUM(BlueprintType, Meta = (Bitflags))
namespace EWeatherType
{
	enum Type
	{
		Sunny = 0 UMETA(DisplayName = "Sunny"),
		Cloudy = 1 << 0 UMETA(DisplayName = "Cloudy"),
		Rainy = 1 << 1 UMETA(DisplayName = "Rainy"),
		Snowy = 1 << 2 UMETA(DisplayName = "Snowy"),
		
	};
}
