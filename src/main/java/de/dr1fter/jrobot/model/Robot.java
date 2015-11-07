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
	
	Robot setDirection(Direction dir);
	Robot setPosition(Position pos);
}
