package Übungen.Snake;

import java.awt.*;

public class Essen extends Rectangle{
	

	Essen(int x,int y,int width,int height){
		super(x,y,width,height);
	}
	
	public void draw(Graphics g) {
		
		g.setColor(Color.GREEN);
		g.fillOval(x, y, width, height);
	}
	
	
	

}
