package de.dr1fter.jrobot.model;

public interface Tile
{
	enum Type
	{
		DEFAULT, BLOCK
	}
	
	Type getType();
}
