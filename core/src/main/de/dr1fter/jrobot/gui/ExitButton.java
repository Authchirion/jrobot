package de.dr1fter.jrobot.gui;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by sonnenschein on 02.01.2016.
 */
public class ExitButton extends TextButton {

    MainMenu menu;

    public ExitButton(String text, TextButtonStyle style, MainMenu menu ) {
        super(text, style);
        this.menu = menu;
        this.addListener(new ExitListener());
    }

    private class ExitListener extends InputListener {
        @Override
        public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
            menu.dispose();
            return super.touchDown(event, x, y, pointer, button);
        }
    }

}
