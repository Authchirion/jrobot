package de.dr1fter.jrobot.model;

public interface Board
{
	Tile getTile(TileCoordinates coords);
	TileCoordinates getSize();
}
