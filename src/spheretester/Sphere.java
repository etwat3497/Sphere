/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spheretester;

import java.text.DecimalFormat;

/**
 *
 * @author etwat3497
 */
public class Sphere {
    private double r, volume, surfaceArea;
    private static final double PI = 3.14;
    
    Sphere(){
        r = 1; //Default radius
    }
    
    Sphere(double radius){
        r = radius; //Set radius
    }
    
    public void sphereVolume(){
        volume = (4*PI*(Math.pow(r,3)))/3;
        volume = rounder(volume);
    }
    
    public void sphereSurfaceArea(){
        surfaceArea = 4*PI*(Math.pow(r,2));
        surfaceArea = rounder(surfaceArea);
        r = rounder(r);
    }
    
    public static double rounder(double input){
        DecimalFormat x = new DecimalFormat("##.##");
        double roundedVal = Double.parseDouble(x.format(input));
        return roundedVal;
    }
    
    public String toString(){
        String output = "The radius of the circle is "+r+" m. The volume of the circle is "
                +volume+" m^3. The surface area of the circle is "+surfaceArea+" m^2.";
        return output;
    }
}
