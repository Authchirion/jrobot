package de.dr1fter.jrobot.model;

class BoardImpl implements Board
{
	private final TileCoordinates size;

	public BoardImpl(TileCoordinates size)
	{
		this.size = size;
	}

	@Override
	public Tile getTile(TileCoordinates coords)
	{
		return null;
	}

	@Override
	public TileCoordinates getSize()
	{
		return size;
	}

}
