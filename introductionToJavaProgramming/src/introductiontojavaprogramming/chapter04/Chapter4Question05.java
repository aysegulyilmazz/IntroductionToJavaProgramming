/* Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid. Here are sample runs
*/
package introductiontojavaprogramming.chapter04;

import java.util.Scanner;
/**
 *
 * @author ayşegül
 */
public class Chapter4Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String ssn = input.nextLine();
        
        if(ssn.length() == 11){
            //check the 3rd and sixth index must be dash
            if(ssn.charAt(3) == '-' && ssn.charAt(6) == '-'){
                //check the character is digit or not
                if(Character.isDigit(ssn.charAt(0))&&
                        Character.isDigit(ssn.charAt(1))&&
                        Character.isDigit(ssn.charAt(2))&&
                        Character.isDigit(ssn.charAt(3))&&
                        Character.isDigit(ssn.charAt(4))&&
                        Character.isDigit(ssn.charAt(5))&&
                        Character.isDigit(ssn.charAt(6))&&
                        Character.isDigit(ssn.charAt(7))&&
                        Character.isDigit(ssn.charAt(8))&&
                        Character.isDigit(ssn.charAt(9))&&
                        Character.isDigit(ssn.charAt(10))){
                        System.out.println(ssn + " is a valid social security number. ");
                }else {
                    System.out.println(ssn + " is an invalid social security number.");
                }
            }else {
                 System.out.println(ssn + " is an invalid social security number.");
                 
            }
        
           }else {
                 System.out.println(ssn + " is an invalid social security number.");
        }
    
        
        
    }
}
