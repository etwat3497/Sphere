/*
 * Created by Ethan Watt
 * On October 26, 2016
 * Created to make a fully functioning sphere class
 */

package spheretester;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class SphereTester {

   /**
    * pre: String array
    * post: void
    * Main method to have the sphere tester communicate with the sphere class
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create new scanner object
        Scanner sc = new Scanner(System.in);
        //Declare variables
        double radius = 0;
        Boolean run = true;
        
        //Run while run is true to ensure no bad user input
        while(run){
            try{
                //Get user input for radius
                System.out.println("What is the radius of your circle in meters?");
                radius = Double.parseDouble(sc.nextLine());

                if(radius<0){
                    //Catch bad user input
                    System.out.println("Please input a positive radius!");
                }
                else{
                    //End while loop
                    run=false;
                }
            }
            //Catch bad user input
            catch(NumberFormatException e){
                System.out.println("Please enter a valid radius");      
            }
        }
        //Create a new object with the given radius
        Sphere circle = new Sphere(radius);
        //Run sphere class method to deterime the circles volume and surface area
        circle.sphereVolume();
        circle.sphereSurfaceArea();
        
        //Display the circles characteristics to console
        System.out.println(circle.toString());
        
    }
    
}
