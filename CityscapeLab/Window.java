import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A window that can be positioned in a group of three on a story object.
 * 
 * @author (Justin Huang) 
 * @version (2 October 2015)
 */
public class Window
{
    /** description of instance variable x (add comment for each instance variable) */
   
    private int xLeft;
    private int yBottom;

    /**
     * Constructs a window with a given bottom left corner.
     * @param x the x-coordinate of the bottom left corner.
     * @param y the y-coordinate of the bottom left corner.
     */
    public Window(Building bldng, int x, int y)
    {
        this.xLeft = bldng.getXLeft()+x;
        this.yBottom = bldng.getYBottom()+y;
    }

    /**
     * Draws the building.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle wndw = new Rectangle(this.xLeft,this.yBottom,25,25);
        g2.draw(wndw);
    }
}
