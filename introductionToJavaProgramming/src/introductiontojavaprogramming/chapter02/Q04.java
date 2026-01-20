//Palindrome number
package introductiontojavaprogramming.chapter02;
import java.util.Scanner; //Scanner is in the java.util package

/**
 *
 * @author ayşegül
 */
public class Q04 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter a three-digit integer
      System.out.println("Enter a three-digit integer: ");
      int number = input.nextInt();
      int firstdigit = number / 100;
      int lastdigit = number % 10;
      
      if(firstdigit == lastdigit){
        System.out.println("This number is a Palindrome ");
        } else
        System.out.println("This number is not a Palindrome ");


      }
      
    }
           
   

