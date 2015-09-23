import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A target shape that can be positioned anywhere on the screen.
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Constructs a target with a given top left corner.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the target.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft + 100, yTop + 100, 500, 500);
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft + 162.5, yTop + 162.5, 375, 375);
        Ellipse2D.Double ring3 = new Ellipse2D.Double(xLeft + 225, yTop + 225, 250, 250);
        Ellipse2D.Double ring4 = new Ellipse2D.Double(xLeft + 287.5, yTop + 287.5, 125, 125);
        g2.draw(ring1);
        g2.draw(ring2);
        g2.draw(ring3);
        g2.draw(ring4);
    }

}
