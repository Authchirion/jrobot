package de.dr1fter.jrobot.model;

public class PositionImpl implements Position {

	private final int x, y;

	public PositionImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public final int getX() {
		return x;
	}

	@Override
	public final int getY() {
		return y;
	}

}
