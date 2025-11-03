package Übungen.Snake;

import java.awt.*;
import java.awt.event.*;

public class Snake extends Rectangle {
	
	int ybewegung;
	int xbewegung;
	int speed = 10;
	Snake(int x, int y, int width,int height){
		
		super(x,y,width,height);
	}
	
	public void draw(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(x,y,width,height);
	}
	
	public void moveSnake() {
		y += ybewegung;
		x += xbewegung;
		
	}
	
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_W) {
			
			setY(-speed);
			setX(0);
		}
		
		
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			setY(speed);
			setX(0);
		}
			
		
		else if  (e.getKeyCode() == KeyEvent.VK_D) {
			setX(speed);
			setY(0);
		}
			
		
		else if  (e.getKeyCode() == KeyEvent.VK_A) {
			setX(-speed);
			setY(0);
		}
		
	}
	
	
	public void setX(int xbe) {
		xbewegung = xbe;
	}
	
	public void setY(int ybe) {
		ybewegung = ybe;
	}
	
}
