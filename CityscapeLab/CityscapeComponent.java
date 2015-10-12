import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    private int tod;
    
    private Building building11;
    private Building building12;
    private Building building13;
    private Building building14;
    private Building building15;

    private Building building21;
    private Building building22;
    private Building building23;
    private Building building24;
    private Building building25;
    
    private Sun sun;
    
    private Road road;
    
    private Car car;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    public CityscapeComponent(int tod)
    {
        this.tod = tod;
        
        this.building11 = new Building(100,500,Color.BLACK,Color.YELLOW,Color.DARK_GRAY);
        this.building12 = new Building(225,500,Color.BLACK,Color.BLUE,Color.DARK_GRAY);
        this.building13 = new Building(350,500,Color.BLACK,Color.YELLOW,Color.DARK_GRAY);
        this.building14 = new Building(475,500,Color.BLACK,Color.BLUE,Color.DARK_GRAY);
        this.building15 = new Building(600,500,Color.BLACK,Color.YELLOW,Color.DARK_GRAY);
    
        this.building21 = new Building(100,725,Color.BLACK,Color.BLUE,Color.DARK_GRAY);
        this.building22 = new Building(225,725,Color.BLACK,Color.YELLOW,Color.DARK_GRAY);
        this.building23 = new Building(350,725,Color.BLACK,Color.BLUE,Color.DARK_GRAY);
        this.building24 = new Building(475,725,Color.BLACK,Color.YELLOW,Color.DARK_GRAY);
        this.building25 = new Building(600,725,Color.BLACK,Color.BLUE,Color.DARK_GRAY);
        
        this.sun = new Sun(tod);
        
        this.road = new Road(0,750);
        
        this.car = new Car(1000,750);
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...

        this.building11.draw(g2);
        this.building12.draw(g2);
        this.building13.draw(g2);
        this.building14.draw(g2);
        this.building15.draw(g2);
        
        this.building21.draw(g2);
        this.building22.draw(g2);
        this.building23.draw(g2);
        this.building24.draw(g2);
        this.building25.draw(g2);
        
        this.sun.draw(g2);
        
        this.road.draw(g2);
        
        this.car.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated

        this.car.move();
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }
}

