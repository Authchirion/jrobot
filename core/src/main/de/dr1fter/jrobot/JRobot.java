package de.dr1fter.jrobot;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class JRobot extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	TextButton button;
	Stage stage;
	TextButton.TextButtonStyle style;
	BitmapFont font;
    int count;

	
	@Override
	public void create () {
        batch = new SpriteBatch();
		style = new TextButton.TextButtonStyle();
		font = new BitmapFont();
        style.font = font;
		button = new TextButton("This is a button", style);
        count = 0;
        button.setPosition(Gdx.graphics.getWidth() / 2 - button.getWidth() / 2, Gdx.graphics.getHeight() / 2);

        button.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                count++;
                button.setText("Button clicked: " + count + " times");
            }
        });

		stage = new Stage();
        Gdx.input.setInputProcessor(stage);
		stage.addActor(button);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(20, 40, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}
}
