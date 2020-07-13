/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;


/**
 *
 * @author CCSDuser
 */
public class JavaApplication3 
{

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double newpopulation;
        double growthRate;
        double P = 0;
        while(P < 2)
        {
            System.out.println("Please enter a value of atleast two for the population");
         P = console.nextInt();
        }
        double B = -1;
        double D = -1;
        while(B < 0)
        {
            System.out.println("Please enter a positive number for the Birth Rate");
            B = console.nextDouble();
        }
        while(D < 0)
        {
            System.out.println("Please enter a positive number for the Death Rate");
            D = console.nextDouble();
        }
        int n = -1;
        while(n < 0)
        {
            System.out.println("Please enter a positive number for the number of years");
            n = console.nextInt();
        }
          growthRate = (B - D);
          System.out.println("The growth rate is: " + growthRate);
          newpopulation = (P *(Math.pow((1 + (B-D)/100), n)));// //The basic equation for growth is Yt = Y0(1+r)t;
             //e.g. $1000(1 + .04)10 = $1480.24.
            //http://arnoldkling.com/econ/GMU/growthArith.htm
           //I converted to Java myself
          System.out.println("The new population should be: " + newpopulation);
    }
}   
       

        
        
       /*
    /**
     *
     */
           
                    
                   
                    
                
             //
                
          
              
                        
        
        
        
    
    



    
