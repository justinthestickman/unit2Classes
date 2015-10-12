import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A sun and/or moon that appear(s) in different positions on the screen depending on the user specified time of day.
 * 
 * @author Justin Huang
 * @version 1 October 2015
 */
public class Sun
{
    /** 
       tod Time Of Day
    */
   
    private int tod;
   
    private Ellipse2D.Double sun;
    private Ellipse2D.Double moon;

    /**
     * Constructs a sun (and/or moon) with a given center.
     * @param tod the time of day
     */
    public Sun(int tod)
    {
        this.tod = tod;
        if (tod == 1)
        {
            this.sun = new Ellipse2D.Double(25, 25, 100, 100);
        }
        else if (tod == 2)
        {
            this.sun = new Ellipse2D.Double(500, 25, 100, 100);
        }
        else if (tod == 3)
        {
            this.sun = new Ellipse2D.Double(1000, 250, 100, 100);
            this.moon = new Ellipse2D.Double(25, 25, 75, 75);
        }
        else if (tod == 4)
        {
            this.moon = new Ellipse2D.Double(25, 25, 75, 75);
        }
    }

    /**
     * Draws the sun and/or moon.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        if (tod == 1)
        {
            g2.setColor(Color.YELLOW);
            g2.fill(this.sun);
            g2.draw(this.sun);
        }
        else if (tod == 2)
        {
            g2.setColor(Color.YELLOW);
            g2.fill(this.sun);
            g2.draw(this.sun);
        }
        else if (tod == 3)
        {
            g2.setColor(Color.YELLOW);
            g2.fill(this.sun);
            g2.draw(this.sun);
            g2.setColor(Color.LIGHT_GRAY);
            g2.fill(this.moon);
            g2.draw(this.moon);
        }
        else if (tod == 4)
        {
            g2.setColor(Color.LIGHT_GRAY);
            g2.fill(this.moon);
            g2.draw(this.moon);
        }
    }
}

