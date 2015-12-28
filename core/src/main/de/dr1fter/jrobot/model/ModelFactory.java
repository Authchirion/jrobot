package de.dr1fter.jrobot.model;

import static com.google.common.base.Preconditions.checkNotNull;
import static de.dr1fter.jrobot.model.ModelUtils.validateNonNegative;

import de.dr1fter.jrobot.model.Tile.Type;

public abstract class ModelFactory
{
	public abstract Board board(TileCoordinates size);
	public abstract TileCoordinates coordinates(int x, int y);
	public abstract Position position(int x, int y);
	public abstract Tile tile(Type t);
	
	public final static ModelFactory INSTANCE = new ModelFactoryImpl();
		
	static class ModelFactoryImpl extends ModelFactory
	{
		@Override
		public Board board(TileCoordinates size)
		{
			checkNotNull(size);
			// validate size
			validateNonNegative(size);
			
			return new BoardImpl(size);
		}

		@Override
		public TileCoordinates coordinates(int x, int y)
		{
			validateNonNegative(x);
			validateNonNegative(y);
			
			return new TileCoordinatesImpl(x,y);
		}

		@Override
		public Position position(int x, int y)
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Tile tile(Type t)
		{
			checkNotNull(t);
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
