import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class PlayerShip extends GameObject implements KeyListener {

	public PlayerShip(int startingX, int startingY) {
		// ADD CODE HERE TO INITIALIZE THE PLAYER SHIP
		// you will need to set the 4 attributes from GameObject: x, y, width, height
	}

	public void update() {
		// ADD CODE HERE TO UPDATE THE PLAYER SHIP
		// this will be executed once per iteration of the game loop
	}

	public void draw(Graphics g, JFrame gameWindow) {
		// ADD CODE HERE TO DRAW THE PLAYER SHIP IN THE GAME WINDOW
		// this will be executed once per iteration of the game loop
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// This method will remain empty
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// This method will be useful when writing the code allowing the user to control the PlayerShip
		// This method is called when a key is pressed on the keyboard
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// This method will be useful when writing the code allowing the user to control the PlayerShip
		// This method is called when a key is released on the keyboard
	}
}
