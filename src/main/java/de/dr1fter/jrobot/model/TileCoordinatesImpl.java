package de.dr1fter.jrobot.model;

public class TileCoordinatesImpl implements TileCoordinates
{
	private int x,y;
	
	public TileCoordinatesImpl(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int getX()
	{
		return x;
	}

	@Override
	public int getY()
	{
		return y;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TileCoordinatesImpl other = (TileCoordinatesImpl) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
