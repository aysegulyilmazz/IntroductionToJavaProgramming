/*  (Order three cities) Write a program that prompts the user to enter three cities and
displays them in ascending order. Here is a sample run:
  */
package introductiontojavaprogramming.chapter04;

import java.util.Scanner;
/**
 *
 * @author ayşegül
 */
public class Chapter4Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter three cities
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();
        
        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();
        
        System.out.println("Enter the third city: ");
        String city3 = input.nextLine();
        
        // Sort cities in  alphabetical order 
        String temp;
        if(city1.compareTo(city2) > 0 ){ // swap if city1 is greater than city2
           temp = city1;
           city1 = city2;
           city2 = temp;
        }
        if(city2.compareTo(city3) > 0 ){ // swap if city2 is greater than city3
           temp = city2;
           city2 = city3;
           city3 = temp;
        }
        if(city1.compareTo(city2) > 0 ){ // check city1 and city2 again
           temp = city1;
           city1 = city2;
           city2 = temp;
        }  
         //Display the cities in ascending order
          System.out.println("The cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
           
           
        
    }
}
