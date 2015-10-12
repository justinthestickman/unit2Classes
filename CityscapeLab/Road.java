import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A road that can be positioned anywhere on the screen.
 * 
 * @author Justin Huang 
 * @version 1 October 2015
 */
public class Road
{
    /** 
       xLeft x-coordinate of left side of road
       yTop y-coordinate of top of road
    */
    
    private int xLeft;
    private int yTop; 
   
    private Rectangle road;

    /**
     * Constructs a road with a given top left corner.
     * @param x the x-coordinate of the top left corner.
     * @param y the y-coordinate of the top left corner.
     */
    public Road(int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
        this.road = new Rectangle(this.xLeft,this.yTop,1250,50);
    }

    /**
     * Draws the road.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.DARK_GRAY);
        g2.fill(this.road);
        g2.draw(this.road);
    }
}

