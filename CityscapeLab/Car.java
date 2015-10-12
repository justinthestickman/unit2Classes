import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

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
   
    private Rectangle body;
    private Rectangle roof;
    private Rectangle frontwheel;
    private Rectangle backwheel;
    private Rectangle headlight;

    /**
     * Constructs a car with a given center.
     * @param x the x-coordinate of the center.
     * @param y the y-coordinate of the center.
     */
    public Car(int x, int y)
    {
        this.xCenter = x;
        this.yCenter = y;
        this.body = new Rectangle(this.xCenter-32,this.yCenter-8,64,16);
        this.roof = new Rectangle(this.xCenter-16,this.yCenter-20,40,12);
        this.frontwheel = new Rectangle(this.xCenter-28,this.yCenter+8,12,12);
        this.backwheel = new Rectangle(this.xCenter+20,this.yCenter+8,12,12);
        this.headlight = new Rectangle(this.xCenter-32,this.yCenter-6,8,8);
    }

    /**
     * Draws the car.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {        
        g2.setColor(Color.RED);
        g2.fill(this.body);
        g2.draw(this.body);
        g2.fill(this.roof);
        g2.draw(this.roof);
        g2.setColor(Color.BLACK);
        g2.fill(this.frontwheel);
        g2.draw(this.frontwheel);
        g2.fill(this.backwheel);
        g2.draw(this.backwheel);
        g2.setColor(Color.YELLOW);
        g2.fill(this.headlight);
        g2.draw(this.headlight);
    }
    
    /**
     * Moves the car.
     */
    public void move()
    {
        this.body.translate(-1,0);
        this.roof.translate(-1,0);
        this.frontwheel.translate(-1,0);
        this.backwheel.translate(-1,0);
        this.headlight.translate(-1,0);
    }
}

