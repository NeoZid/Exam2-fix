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
        temperatures.add(10.5);
        temperatures.add(12.5);
        temperatures.add(9.5);
        temperatures.add(3.6);
        temperatures.add(38.1);
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
        if (name==name2) {
            System.out.println("Your name is" + name);
        } else { 
            System.out.println("Your name isnt here");
        } //  (c)
    }
    
    // question 25
    
     public void tempCheck(double temperature) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(37.2);
        temperatures.add(32.5);
        temperatures.add(37.9);
        temperatures.add(47.0);
        temperatures.add(7.1);
        
        double high = 37.5;
        
        for (double i = 0; i < temperatures.size(); i++) {
            if ( i > high) {
            System.out.println(i);   
        }
        double maxNumber = Collections.max(temperatures);
        
        }
    }
    
    // question 26
    public void tempCheck2 (int temperature) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(37.2);
        temperatures.add(32.5);
        temperatures.add(37.9);
        temperatures.add(47.0);
        temperatures.add(7.1);
        
        double high = 37.5;
        for (int i = 0; i < temperatures.size(); i++) {
            double maxNumber = Collections.max(temperatures);
            System.out.println(maxNumber);
        }
    }
    
    // question 27
    public void tempCheck3(int temperature) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(37.2);
        temperatures.add(32.5);
        temperatures.add(37.9);
        temperatures.add(47.0);
        temperatures.add(7.1);
        
        Collections.sort(temperatures);
        
        
        for (double i : temperatures) {
            System.out.print(i);
        }
    }
}



