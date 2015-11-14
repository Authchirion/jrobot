package de.dr1fter.jrobot.gui;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;

/**
 * An empty Window
 * 
 * @author Marcel Weber (Authchirion)
 *
 */
public class Window {

	private GLFWErrorCallback errorCallback;
	private long window;
	private long monitor;
	private final static String TITLE = "JRobot";

	/**
	 * Initializes and creates a window.
	 */
	public Window() {
		initGLFW();
		createWindow();
	}

	/**
	 * Initializes GLFW. Throws IllegalStateException if it fails.
	 */
	private final void initGLFW() {
		errorCallback = GLFWErrorCallback.createPrint(System.err);
		GLFW.glfwSetErrorCallback(errorCallback);

		if (GLFW.glfwInit() != GLFW.GLFW_TRUE) {
			throw new IllegalStateException("Could not initialize GLFW");
		}
	}

	/**
	 * Creates a window. Throws RuntimeException if it fails.
	 */
	private final void createWindow() {
		monitor = GLFW.glfwGetPrimaryMonitor();
		window = GLFW.glfwCreateWindow(GLFW.glfwGetVideoMode(monitor).width(), GLFW.glfwGetVideoMode(monitor).height(),
				TITLE, monitor, 0);
		if (window == 0) {
			GLFW.glfwTerminate();
			throw new RuntimeException("Could not create Window");
		}
	}

	/**
	 * Destroys Window, terminates GLFW and releases GLFWErrorCallback
	 * 
	 * @return <code>0</code> if successful
	 */
	public final int closeWindow() {
		GLFW.glfwDestroyWindow(window);
		GLFW.glfwTerminate();
		errorCallback.release();
		return 0;
	}

	/**
	 * Gets a handle on your window
	 * 
	 * @return Handle on your window
	 */
	public final long getWindow() {
		return this.window;
	}
}
