package de.dr1fter.jrobot.model;

/**
 * A robot
 * 
 * @author Christian Cwienk (dr1fter)
 */
public interface Robot
{
	Direction getDirection();
	Position getPosition();
	
    void setDirection(Direction dir);
	void setPosition(Position pos);
}
