import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

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
    
    Building building11 = new Building(100,500);
    Building building12 = new Building(225,500);
    Building building13 = new Building(350,500);
    Building building14 = new Building(475,500);
    Building building15 = new Building(600,500);
    
    Building building21 = new Building(100,725);
    Building building22 = new Building(225,725);
    Building building23 = new Building(350,725);
    Building building24 = new Building(475,725);
    Building building25 = new Building(600,725);
    
    Sun sun = new Sun(1000,125);
    
    Road road = new Road(0,800);
    
    Car car = new Car(1000,800);
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    public CityscapeComponent()
    {
        //
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
        
        building11.draw(g2);
        building12.draw(g2);
        building13.draw(g2);
        building14.draw(g2);
        building15.draw(g2);
        
        building21.draw(g2);
        building22.draw(g2);
        building23.draw(g2);
        building24.draw(g2);
        building25.draw(g2);
        
        sun.draw(g2);
        
        road.draw(g2);
        
        car.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
