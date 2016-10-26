/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spheretester;

//Add imports
import java.text.DecimalFormat;

/**
 *
 * @author etwat3497
 */
public class Sphere {
    //Declare global variables
    private double r, volume, surfaceArea;
    private static final double PI = 3.14;
    
    
  /**
   * pre: none
   * post: none
   * Default constructor to assign base values to variables
   */
    Sphere(){
        r = 1; //Default radius
    }
    
    
  /**
   * pre: sphere radius
   * post: none
   * Constructor to look for radius value in sphere tester and assign value to r variable
   */
    Sphere(double radius){
        r = radius; //Set radius
    }
    
    
  /**
   * pre: void
   * post: void
   * Method to determine the spheres volume and round it
   */
    public void sphereVolume(){
        //Calculate the volume of the sphere
        volume = (4*PI*(Math.pow(r,3)))/3;
        
        //Run rounder method in class to round the volume to 2 decimal places
        volume = rounder(volume);
    }
    
    
  /**
   * pre: void
   * post: void
   * Method to calculate the spheres surface area and round both the surface area and the radius
   */
    public void sphereSurfaceArea(){
        //Calculate the surface area of the sphere
        surfaceArea = 4*PI*(Math.pow(r,2));
        
        //Run rounder method in class to round the surface area and radius to 2 decimal places
        surfaceArea = rounder(surfaceArea);
        r = rounder(r);
    }
    
    
  /**
   * pre: double input value
   * post: rounded double value
   * Method to round the input value to 2 decimal places
   */
    public static double rounder(double input){
        DecimalFormat x = new DecimalFormat("##.##");
        //Round the parameter and return the new rounded value
        double roundedVal = Double.parseDouble(x.format(input));
        return roundedVal;
    }
    
    
  /**
   * pre: void
   * post: output String
   * Method to create an output string
   */
    public String toString(){
        String output = "The radius of the circle is "+r+" m. The volume of the circle is "
                +volume+" m^3. The surface area of the circle is "+surfaceArea+" m^2.";
        return output;
    }
}
