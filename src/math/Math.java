/*
 * Angus Henry
 * Math.java
 * This program formats a number
 * March 5 2018
 */

package math;

/**
 *
 * @author anhen3335
 */
import java.text.*;
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number = 293.276589;
        DecimalFormat x = new DecimalFormat ("###.##");
        
        System.out.println(x.format(number));
    }
    
   
}




