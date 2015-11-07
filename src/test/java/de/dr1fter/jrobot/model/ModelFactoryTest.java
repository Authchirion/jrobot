package de.dr1fter.jrobot.model;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ModelFactoryTest
{
	final ModelFactory examinee = ModelFactory.INSTANCE;
	
	@Rule
	public ExpectedException ex = ExpectedException.none();
	
	@Test
	public void instance_should_not_be_null()
	{
		assertThat(examinee, notNullValue());
	}
	
	@Test
	public void board_should_fail_on_null() throws Exception
	{
		ex.expect(RuntimeException.class);
		examinee.board((TileCoordinates) null);
	}
	
	@Test
	public void board_should_be_created() throws Exception
	{
		TileCoordinates size = examinee.coordinates(1, 2);
		Board board = examinee.board(size);
		assertThat(board, notNullValue());
		
		TileCoordinates boardSize = board.getSize();
		
		assertThat(size, equalTo(boardSize));
	}

}
