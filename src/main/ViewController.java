package main;

import javax.swing.JFrame;

public class ViewController {
	
	public static void main(String[] args) {
		JFrame gameView = new JFrame();
		GameController controller = new GameController();
		gameView.setBounds(10, 10, 700, 600);
		gameView.setTitle("No Name Game");
		gameView.setResizable(false);
		gameView.setVisible(true);
		gameView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameView.add(controller);
	}
}
