package de.dr1fter.jrobot.gui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Array;

import de.dr1fter.jrobot.JRobot;

/**
 * Created by Authchirion on 29.12.2015.
 */
public class MainMenu implements Screen {

    private TextureAtlas textureAtlas;
    private Skin buttonSkin;
    private Array<TextButton> buttons;
    private TextButton.TextButtonStyle style;
    private Stage stage;
    private JRobot jRobot;
    private OrthographicCamera camera;

    public MainMenu() {

    }

    public MainMenu(JRobot jRobot) {
        this.jRobot = jRobot;
        createButtons();
        this.camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getDesktopDisplayMode().width, Gdx.graphics.getDesktopDisplayMode().height);
        Gdx.input.setInputProcessor(stage);
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl20.glClearColor((195.0f/255.0f),(187.0f/250.0f),(187.0f/250.0f),1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.draw();

        camera.update();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        textureAtlas.dispose();
        buttonSkin.dispose();
        stage.dispose();
        jRobot.dispose();

    }

    private void createButtons() {

        this.textureAtlas = new TextureAtlas("menuButton.pack");
        this.buttonSkin = new Skin();
        buttonSkin.addRegions(textureAtlas);

        this.style = new TextButton.TextButtonStyle();
        style.up = buttonSkin.getDrawable("menuButtonUnPushed");
        style.down = buttonSkin.getDrawable("menuButtonPushed");
        style.font = jRobot.font;

        int width = 512;
        int height = 256;

        int PosX = Gdx.graphics.getDesktopDisplayMode().width/2 - width/2;
        int PosY = Gdx.graphics.getDesktopDisplayMode().height - height;

       buttons = new Array<>(true, 4, TextButton.class);

        buttons.add(new TextButton("New Game", style));
        buttons.add(new TextButton("Load Game", style));
        buttons.add(new TextButton("Settings", style));
        buttons.add(new ExitButton("Exit", style,this));

        buttons.get(0).setSize(width, height);
        buttons.get(1).setSize(width, height);
        buttons.get(2).setSize(width, height);
        buttons.get(3).setSize(width, height);

        buttons.get(0).setPosition(PosX, PosY);
        buttons.get(1).setPosition(PosX, PosY - height);
        buttons.get(2).setPosition(PosX, PosY - 2 * height);
        buttons.get(3).setPosition(PosX, PosY - 3 * height);

        stage = new Stage();
        stage.addActor(buttons.get(0));
        stage.addActor(buttons.get(1));
        stage.addActor(buttons.get(2));
        stage.addActor(buttons.get(3));

    }

    private class MainMenuInteraction extends InputListener {

        @Override
        public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

            return super.touchDown(event, x, y, pointer, button);
        }
    }
}
