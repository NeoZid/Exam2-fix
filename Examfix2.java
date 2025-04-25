import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class Examfix2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Examfix2
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Examfix2
     */
    public Examfix2()
    {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(37.2);
        temperatures.add(32.5);
        temperatures.add(37.9);
        temperatures.add(47.0);
        temperatures.add(7.1);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void stringEqual(String name, String name2) // (a)
    {
        // #24
        
        // (b)
        if (name.equals(name2)) {
            System.out.println("Your name is" + name);
        } else { 
            System.out.println("Your name isnt here");
        } //  (c)
    }
    
    // question 25
    
     public void tempCheck(ArrayList<Double> temperatures) {
        
        double fever = 37.5;
        int count = 0;
        double max = 0.0;
        
        
        for (double temp : temperatures) {
            if ( temp > fever) {
                count++; 
            }
            if ( temp > max ) {
                max = temp;
            }
        }
        
        System.out.println("amount of fever: " + count);
        System.out.println("highest fever: " + max);
        
        // question 26
        
        System.out.println("Max element" + Collections.max(temperatures));
        
        // question 27
        
        Collections.sort(temperatures);
        System.out.println("Max element (sorted list)" + temperatures.get(temperatures.size()-1));
        
    }
}



