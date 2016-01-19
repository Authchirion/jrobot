package de.dr1fter.jrobot.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.dr1fter.jrobot.JRobot;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.fullscreen = true;
        config.vSyncEnabled = true;
		new LwjglApplication(new JRobot(), config);
	}
}
