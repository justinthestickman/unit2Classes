import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.Color;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_FORTIETHS_OF_A_SECOND = 2400;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(1200 /* x */, 1000 /* y */);
        frame.setTitle("Cityscape");
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Times of Day: Morning(1), Noon(2), Evening(3), and Night(4).");
        System.out.print("What time of day do you want it to be? Enter the number choice: ");
        int tod = scanner.nextInt();
        
        if (tod == 1 || tod == 2)
        {
            frame.getContentPane().setBackground(Color.CYAN);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else if (tod == 3)
        {
            frame.getContentPane().setBackground(Color.GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else if (tod == 4)
        {
            frame.getContentPane().setBackground(Color.BLACK);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(tod);
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_FORTIETHS_OF_A_SECOND; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 25 );
        }
    }
}

