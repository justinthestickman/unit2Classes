import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A building that can be positioned anywhere on the screen.
 * 
 * @author Justin Huang
 * @version 1 October 2015
 */
public class Building
{
    /** 
       xLeft x-coordinate of left side of building
       yBottom y-coordinate of bottom of building
       width width of building (difference in x)
       height height of building (difference in y)
       xRight x-coordinate of right side of building
       yTop y-coordinate of top of building
       wWidth width of window
       wHeight height of window
    */
    
    private int xLeft;
    private int yBottom;
    private final int width;
    private final int height;
    private int xRight;
    private int yTop;
    private final int wWidth;
    private final int wHeight;

    /**
     * Constructs a building with a given bottom left corner.
     * @param x the x-coordinate of the bottom left corner.
     * @param y the y-coordinate of the bottom left corner.
     */
    public Building(int x, int y)
    {
        this.xLeft = x;
        this.yBottom = y;
        this.width = 100;
        this.height = 200;
        this.xRight = xLeft+width;
        this.yTop = yBottom-height;
        this.wWidth = 80;
        this.wHeight = 20;
    }

    /**
     * Draws the building.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle frame = new Rectangle(this.xLeft,this.yTop,width,height);
        Rectangle story1 = new Rectangle(this.xLeft+10,this.yTop+15,wWidth,wHeight);
        Rectangle story2 = new Rectangle(this.xLeft+10,this.yTop+45,wWidth,wHeight);
        Rectangle story3 = new Rectangle(this.xLeft+10,this.yTop+75,wWidth,wHeight);
        Rectangle story4 = new Rectangle(this.xLeft+10,this.yTop+105,wWidth,wHeight);
        Rectangle story5 = new Rectangle(this.xLeft+10,this.yTop+135,wWidth,wHeight);
        Rectangle door = new Rectangle(this.xLeft+35,this.yBottom-20,30,20);
        
        g2.draw(frame);
        g2.draw(story1);
        g2.draw(story2);
        g2.draw(story3);
        g2.draw(story4);
        g2.draw(story5);
        g2.draw(door);
    }
    
    /**
     * Returns the x-coordinate of the bottom-left corner of the building.
     * @return  xLeft x-coordinate of the bottom-left corner of the building.
     */
    public int getXLeft()
    {
        return this.xLeft;
    }
    
    /**
     * Returns the y-coordinate of the bottom-left corner of the building.
     * @return  yBottom y-coordinate of the bottom-left corner of the building.
     */
    public int getYBottom()
    {
        return this.yBottom;
    }
}
