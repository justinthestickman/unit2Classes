import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

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
    private Color frameColor;
    private Color windowColor;
    private Color doorColor;
    
    private Rectangle frame;
    private Rectangle story1;
    private Rectangle story2;
    private Rectangle story3;
    private Rectangle story4;
    private Rectangle story5;
    private Rectangle door;

    /**
     * Constructs a building with a given bottom left corner.
     * @param x the x-coordinate of the bottom left corner.
     * @param y the y-coordinate of the bottom left corner.
     */
    public Building(int x, int y, Color color1, Color color2, Color color3)
    {
        this.xLeft = x;
        this.yBottom = y;
        this.width = 100;
        this.height = 200;
        this.xRight = xLeft+width;
        this.yTop = yBottom-height;
        this.wWidth = 80;
        this.wHeight = 20;
        this.frameColor = color1;
        this.windowColor = color2;
        this.doorColor = color3;
        this.frame = new Rectangle(this.xLeft,this.yTop,width,height);
        this.story1 = new Rectangle(this.xLeft+10,this.yTop+15,wWidth,wHeight);
        this.story2 = new Rectangle(this.xLeft+10,this.yTop+45,wWidth,wHeight);
        this.story3 = new Rectangle(this.xLeft+10,this.yTop+75,wWidth,wHeight);
        this.story4 = new Rectangle(this.xLeft+10,this.yTop+105,wWidth,wHeight);
        this.story5 = new Rectangle(this.xLeft+10,this.yTop+135,wWidth,wHeight);
        this.door = new Rectangle(this.xLeft+35,this.yBottom-20,30,20);
    }

    /**
     * Draws the building.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(frameColor);
        g2.fill(this.frame);
        g2.draw(this.frame);
        g2.setColor(windowColor);
        g2.fill(this.story1);
        g2.draw(this.story1);
        g2.fill(this.story2);
        g2.draw(this.story2);
        g2.fill(this.story3);
        g2.draw(this.story3);
        g2.fill(this.story4);
        g2.draw(this.story4);
        g2.fill(this.story5);
        g2.draw(this.story5);
        g2.setColor(doorColor);
        g2.fill(this.door);
        g2.draw(this.door);
    }
}

