package game;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Paddle extends Sprite {
	
	private int dx;
	
	public Paddle() {
		initPaddle();
	}
	
	private void initPaddle() {
		loadImage();
		getImageDimensions();
		
		resetState();
		
	}
	
	private void loadImage() {
		
		var ii = new ImageIcon("src/game/Images/paddle.png");
		image = ii.getImage();
	}
	
	void move() {
		x += dx;
		
		if (x <= 0) {
			x = 0;
		}
	
	if (x >= Commons.WIDTH - imageWidth) {
			x = Commons.WIDTH - imageWidth;
	}
	
	
	}
	
	void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) {
			dx = -2;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
		
	}
	
	void KeyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
		
		
	}
	
	private void resetState() {
		
		x=Commons.INIT_BALL_X;
		y=Commons.INIT_BALL_Y;
	}
	

}
