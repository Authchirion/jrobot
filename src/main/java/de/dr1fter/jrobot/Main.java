package de.dr1fter.jrobot;

import org.lwjgl.glfw.GLFW;

import de.dr1fter.jrobot.gui.Window;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello, cruel world");
		exampleWindow();
		System.exit(42);
	}

	/**
	 * Example coding how to use the Window class
	 */
	public static void exampleWindow() {
		Window window = new Window();

		// displays empty window until Escape was pressed
		while (GLFW.glfwGetKey(window.getWindow(), GLFW.GLFW_KEY_ESCAPE) != 1) {
			GLFW.glfwPollEvents();
			window.getWindow();
		}
		window.closeWindow();
	}

}
