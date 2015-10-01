import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A building that can be positioned anywhere on the screen.
 * 
 * @author (Justin Huang) 
 * @version (1 October 2015)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yBottom;

    /**
     * Constructs a building with a given bottom left corner.
     * @param x the x-coordinate of the bottom left corner.
     * @param y the y-coordinate of the bottom left corner.
     */
    public Building(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yBottom = y;
    }

    /**
     * Draws the building.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle bldng = new Rectangle(xLeft+25,yBottom-25,25,50);
        
        g2.draw(bldng);
    }
}
