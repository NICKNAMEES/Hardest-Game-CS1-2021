/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 803015
 */
public class Player {
   private int x,y; 
   private final static int WIDTH = 50, HEIGHT = 50;
private final Color COLOR = Color.RED;

//constant
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
     
    }
public void draw (Graphics g) {
    g.setColor(COLOR);
    g.drawRect(x, y, WIDTH, HEIGHT);
 g.fillRect(x, y, WIDTH, HEIGHT);
}
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
   
}
