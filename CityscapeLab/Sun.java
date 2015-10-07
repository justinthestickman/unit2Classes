import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A sun that appears in the upper right corner of the screen.
 * 
 * @author Justin Huang
 * @version 1 October 2015
 */
public class Sun
{
    /** 
       xCenter x-coordinate of center of sun
       yCenter y-coordinate of center of sun
    */
    
    private int xCenter;
    private int yCenter;

    /**
     * Constructs a sun with a given center.
     * @param x the x-coordinate of the center.
     * @param y the y-coordinate of the center.
     */
    public Sun(int x, int y)
    {
        this.xCenter = x;
        this.yCenter = y;
    }

    /**
     * Draws the sun.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xCenter, yCenter, 100, 100);
        
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }

}
