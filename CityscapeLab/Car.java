import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A car that can be positioned anywhere on the screen.
 * 
 * @author Justin Huang
 * @version 1 October 2015
 */
public class Car
{
    /** 
       xCenter x-coordinate of center of car
       yCenter y-coordinate of center of car
    */
    
    private int xCenter;
    private int yCenter;

    /**
     * Constructs a car with a given center.
     * @param x the x-coordinate of the center.
     * @param y the y-coordinate of the center.
     */
    public Car(int x, int y)
    {
        this.xCenter = x;
        this.yCenter = y;
    }

    /**
     * Draws the car.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(this.xCenter-16,this.yCenter-4,32,8);
        
        g2.draw(body);
    }

}
