//(Decimal to hex
package aysegulyılmaz.hw3;
import java.util.Scanner; //Scanner is in the java.util package
/**
 *
 * @author ayşegül
 */
public class Chapter4Question02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter an integer between 0 and 15
        System.out.println("Enter a decimal value between (0 to 15): ");
        int decimal = input.nextInt();
        
        //displays its corresponding hex numbe
        if( decimal>= 0 && decimal <= 9)
            System.out.println("The hex value is " + decimal);
        else if (decimal >= 10 && decimal <= 15)
            System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
        else
            System.out.println(decimal + " is an invalid input ");
            
        
        
    }
}
