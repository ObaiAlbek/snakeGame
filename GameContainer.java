package Übungen.Snake;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Timer;

import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class GameContainer extends JPanel implements Runnable {

    final static int WIDTH_WINDOW = 1000;
    final static int HEIGHT_WINDOW = 700;
    Dimension fensterSize = new Dimension(WIDTH_WINDOW, HEIGHT_WINDOW);

    Snake snake;
    ArrayList<Snake> speicher; // Liste für Schlangenteile
    static final int snake_Width = 20;
    static final int snake_Height = 20;

    Essen essen;
    static final int essen_Width = 10;
    static final int essen_Height = 10;

    Thread game;
    Random random;

    GameContainer() {
        random = new Random();
        speicher = new ArrayList<>();
        drawSnake();
        drawEssen(); 
        this.setFocusable(true);
        this.setPreferredSize(fensterSize);
        this.addKeyListener(new AL()); // KeyListener für die Steuerung
        game = new Thread(this);
        game.start();
    }

    public void checkKollision() {
        if (speicher.get(0).intersects(essen)) {
            drawEssen();
            growSnake(); 
        }
        
        if (snake.y <= 0 || snake.x <= 0)
        	 game.interrupt();
//        
//        for (int i = 1 ; i < speicher.size() ; i--) {
//        	if (speicher.get(0).intersects(speicher.get(i))) {
//        	    System.out.println("Game Over");
//        	    game.interrupt();
//        	    break;
//        	}
//        }
//        
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH_WINDOW, HEIGHT_WINDOW);

        for (Snake snake : speicher) 
            snake.draw(g);
        
        essen.draw(g); 
    }

    public void drawSnake() {
        int startX = random.nextInt(WIDTH_WINDOW - 200);
        int startY = random.nextInt(HEIGHT_WINDOW - 200);
        snake = new Snake(startX, startY, snake_Width, snake_Height);
        speicher.add(snake); 
    }

    // Neues Essen erstellen
    public void drawEssen() {
        int essenX = random.nextInt(WIDTH_WINDOW - 200);
        int essenY = random.nextInt(HEIGHT_WINDOW - 200);
        essen = new Essen(essenX, essenY, essen_Width, essen_Height);
    }

    public void growSnake() {
        Snake lastSegment = speicher.get(speicher.size() - 1);
        Snake newSegment = new Snake(lastSegment.x, lastSegment.y, snake_Width, snake_Height);
        speicher.add(newSegment);
    }

    // Bewegung der Schlange
    public void move() {
        for (int i = speicher.size() - 1; i > 0; i--) {
            speicher.get(i).x = speicher.get(i - 1).x;
            speicher.get(i).y = speicher.get(i - 1).y;
    
        }
        snake.moveSnake();
    }

    @Override
    public void run() {
        try {
            while (true) {
                move(); 
                checkKollision();
                repaint();
                Thread.sleep(20); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public class AL extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            snake.keyPressed(e);
        }
    }
}
