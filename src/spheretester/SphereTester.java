/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spheretester;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class SphereTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        double radius = 0;
        Boolean run = true;
        
        while(run){
            try{
                System.out.println("What is the radius of your circle in meters?");
                radius = Double.parseDouble(sc.nextLine());

                if(radius<0){
                    System.out.println("Please input a positive radius!");
                }
                else{
                    run=false;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a valid radius");      
            }
        }
        Sphere circle = new Sphere(radius);
        circle.sphereVolume();
        circle.sphereSurfaceArea();
        System.out.println(circle.toString());
        
    }
    
}
