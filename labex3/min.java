/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labex3;

/**
 *
 * @author Desktop Pc
 */
import java.util.*;
public class min {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // variable declaration 
      // variable declaration 
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of a");
     int a = obj.nextInt();
     System.out.println("Enter the value of b");
     int b = obj.nextInt();
     System.out.println("Enter the value of c");
     int c = obj.nextInt(); 
     System.out.println("Enter the value of d");
     int d = obj.nextInt();
     int min;
      
//minimum number among a,b,c,d
    min = (a < b && a < c && a < d) ?  
               a : ((b < c && b < d) ?  
               b : (c < d ? c : d)); 
      
   
    System.out.println("Minimum number among " +  a + ", " + b + ", "+ c +  
             " and " + d + " is " + min + ". " );  
}  
} 