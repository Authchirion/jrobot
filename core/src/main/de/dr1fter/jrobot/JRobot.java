package de.dr1fter.jrobot;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

import de.dr1fter.jrobot.gui.MainMenu;

public class JRobot extends Game {

    public Batch batch;
    private FreeTypeFontGenerator.FreeTypeFontParameter parameter;
    private FreeTypeFontGenerator generator;
    public BitmapFont font;

	
	@Override
	public void create () {
        Gdx.graphics.setDisplayMode(Gdx.graphics.getDesktopDisplayMode().width, Gdx.graphics.getDesktopDisplayMode().height, true);
        Gdx.graphics.setVSync(true);
        batch = new SpriteBatch();
        loadFont();
        setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
        super.render();

	}

    private void loadFont() {
        generator = new FreeTypeFontGenerator(Gdx.files.internal("FFF_Tusj.ttf"));
        parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 64;
        parameter.color = Color.BLUE;
        font = generator.generateFont(parameter);
    }

    public void dispose() {
        generator.dispose();
        batch.dispose();
    }
}
