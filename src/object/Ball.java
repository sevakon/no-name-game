package object;

import java.util.Random;

public class Ball {
	private int x;
	private int y;
	private int size = 20;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getY() {
		return y;
	}
	
	public void moveRight() {
		if (x + 20 < 700)
			x += 20;
	}
	
	public void moveLeft() {
		if (x - 20 > -10)
			x -= 20;
	}
	
	public void moveDown() {
		if (y + 20 < 600)
			y += 20;
	}
	
	public void moveUp() {
		if (y - 20 > -10)
			y -= 20;
	}
	
	public void moveRandom() {
		Random random = new Random();
		int randomDirecttion = random.nextInt(4);
		System.out.println(randomDirecttion);
		switch (randomDirecttion) {
			case 0: moveRight(); break;
			case 1: moveUp(); break;
			case 2: moveLeft(); break;
			case 3: moveDown(); break;
		}
	}
}
