
package hardestgame;
import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author 803015
 */
public class Enemy {
private int x, int y, vx, vy;
private final static int SPEED = 2;
private final static int WIDTH = 25, HEIGHT = 25;
private final static Color COLOR = Color.BLUE;
//constructor

    public Enemy(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
//draws a circle(oval)
    public void draw(Graphics g) {
        g.drawOval(x, y, WIDTH, HEIGHT);
    }
//getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public static int getSPEED() {
        return SPEED;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static Color getCOLOR() {
        return COLOR;
    }
    
    }


