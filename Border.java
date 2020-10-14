
package hardestgame;

/**
 *
 * @author 803015
 */
import java.awt.Color;
import java.awt.Graphics;
public class Border {
 private final int x, y, width, height;
 private final static Color COLOR = Color.BLACK;
 // constructor for border

    public Border(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
 
 // draws a rectangle
 public void draw(Graphics g) {
     g.drawRect(x, y, width, height);
 }
 //getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static Color getCOLOR() {
        return COLOR;
    }
 
}
