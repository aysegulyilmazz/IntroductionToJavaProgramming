//Phone key pads
package introductiontojavaprogramming.chapter04;
import java.util.Scanner;
/**
 *
 * @author ayşegül
 */
public class Chapter4Question04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a letter: ");
        // Convert the letter to uppercase
        char letter = input.next().charAt(0);
         
        //Check the entered letter and determine the corresponding number
        if (letter > 96 && letter < 100 || letter > 64 && letter < 68){ //
            System.out.println("The corresponding number is " + 2);
        }    
         if (letter > 99 && letter < 103 || letter > 67 && letter < 71){ //
            System.out.println("The corresponding number is " + 2);
        }
         
           
         if (letter > 102 && letter < 106 || letter > 70 && letter < 74){ //
            System.out.println("The corresponding number is " + 2);
        } 
                    
         if (letter > 105 && letter < 109 || letter > 73 && letter < 77){ //
            System.out.println("The corresponding number is " + 2);
        } 
                
         if (letter > 108 && letter < 112 || letter > 76 && letter < 80){ //
            System.out.println("The corresponding number is " + 2);
        } 
                 
         if (letter > 111 && letter < 116 || letter > 79 && letter < 84){ //
            System.out.println("The corresponding number is " + 2);
        } 
            
         if (letter > 115 && letter < 119 || letter > 83 && letter < 87){ //d
            System.out.println("The corresponding number is " + 2);
        } 
           
         if (letter > 118 && letter < 123 || letter > 86 && letter < 91){ //
            System.out.println("The corresponding number is " + 2);
        } 
                
                
                        
                
               
                
    }
}
