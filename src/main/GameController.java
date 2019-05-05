package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;


import object.Ball;

public class GameController extends JPanel implements KeyListener, ActionListener {
	
	private static final long serialVersionUID = 2718275833511956034L;
	private Ball ball;
	private Ball enemyBall;
	private Timer timer;
	private int delay = 8;

	public GameController() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		ball = new Ball(20, 20);
		enemyBall = new Ball(100, 100);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		//background
		g.setColor(Color.black);
		g.fillRect(1, 1, 697, 612);
		
		//borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 607);
		g.fillRect(0, 0, 697, 3);
		g.fillRect(696, 0, 3, 607);
		g.fillRect(0, 598, 697, 3);
		
		//ball
		g.fillOval(ball.getX(), ball.getY(), ball.getSize(), ball.getSize());
		
		//enemy ball
		g.setColor(Color.red);
		g.fillOval(enemyBall.getX(), enemyBall.getY(), enemyBall.getSize(), enemyBall.getSize());
		
		g.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ball.moveRight();
			enemyBall.moveRandom();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ball.moveLeft();
			enemyBall.moveRandom();
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			ball.moveUp();
			enemyBall.moveRandom();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ball.moveDown();
			enemyBall.moveRandom();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

