package de.dr1fter.jrobot.model;

import static com.google.common.base.Preconditions.checkNotNull;

public class ModelUtils
{
	public static void validateNonNegative(int i)
	{
		if(i < 0)
			throw new RuntimeException("value was < 0");
	}
	public static void validateNonNegative(TileCoordinates coords)
	{
		checkNotNull(coords);
		if(coords.getX() < 0 || coords.getY() < 0)
			throw new RuntimeException("coords were < 0");
	}
}
