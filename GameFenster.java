package Übungen.Snake;

import javax.swing.*;

public class GameFenster extends JFrame {
	
	GameContainer gameplay;
	GameFenster(){
		gameplay = new GameContainer();
		this.add(gameplay);
		this.setTitle("SnakeGame");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
	}
}
