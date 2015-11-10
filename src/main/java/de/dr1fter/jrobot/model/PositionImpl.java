package de.dr1fter.jrobot.model;

public class PositionImpl implements Position {

	private int x, y;

	public PositionImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

}
