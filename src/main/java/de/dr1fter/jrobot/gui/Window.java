package de.dr1fter.jrobot.gui;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;

public class Window {

	private GLFWErrorCallback errorCallback;
	private long window;
	private long monitor;
	private final static String TITLE = "JRobot";

	public Window() {
		initGLFW();
		createWindow();
	}

	private final void initGLFW() {
		errorCallback = GLFWErrorCallback.createPrint(System.err);
		GLFW.glfwSetErrorCallback(errorCallback);

		if (GLFW.glfwInit() != GLFW.GLFW_TRUE) {
			throw new IllegalStateException("Could not initialize GLFW");
		}
	}

	private final void createWindow() {
		monitor = GLFW.glfwGetPrimaryMonitor();
		window = GLFW.glfwCreateWindow(GLFW.glfwGetVideoMode(monitor).width(), GLFW.glfwGetVideoMode(monitor).height(),
				TITLE, monitor, 0);
		if (window == 0) {
			GLFW.glfwTerminate();
			throw new RuntimeException("Could not create Window");
		}
	}

	public final int closeWindow() {
		GLFW.glfwDestroyWindow(window);
		GLFW.glfwTerminate();
		errorCallback.release();
		return 0;
	}

	public final long getWindow() {
		return this.window;
	}
}
