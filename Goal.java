
package hardestgame;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author 803015
 */
public class Goal {
    private int x, y;
    private final int WIDTH, HEIGHT;
    private final boolean isFinish;
    private final static Color COLOR = Color.BLACK;
    //constructor

    public Goal(int WIDTH, int HEIGHT, boolean isFinish) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.isFinish = isFinish;
    }
    //draws a rectangle
    public void draw(Graphics g) {
    g.drawRect(x, y, WIDTH, HEIGHT);
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

    public boolean isIsFinish() {
        return isFinish;
    }

    public static Color getCOLOR() {
        return COLOR;
    }
    
}
//getters
