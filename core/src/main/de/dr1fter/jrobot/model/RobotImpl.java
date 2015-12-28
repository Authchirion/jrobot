package de.dr1fter.jrobot.model;

public class RobotImpl implements Robot {
	
	private Direction dir;
	private Position pos;
	
	public RobotImpl(Direction dir, Position pos) {
		this.dir = dir;
		this.pos = pos;
	}

	@Override
	public Direction getDirection() {
		return dir;
	}

	@Override
	public Position getPosition() {
		return pos;
	}

	@Override
	public Robot setDirection(Direction dir) {
		this.dir = dir;
		return this;
		
	}

	@Override
	public Robot setPosition(Position pos) {
		this.pos = pos;
		return this;
	}
	

}
