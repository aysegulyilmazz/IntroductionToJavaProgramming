//Cost of shipping
package introductiontojavaprogramming.chapter02;
import java.util.Scanner; // Scanner is in the java.util package
/**
 *
 * @author ayşegül
 */
public class Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the package: ");
        double weight = input.nextDouble();
        
        if(weight > 50)
            System.out.println(" The package cannot be shipped. ");
        
        else
           {
               double costinpound = 0 ;
               
               if (weight > 0 && weight <= 1 )
                   costinpound = 3.5;
               else if (weight > 1 && weight <= 3 )
                   costinpound = 5.5;
               else if (weight > 3 && weight <= 10) 
                   costinpound = 8.5;
               else if(weight > 10 && weight <= 20 )
                   costinpound = 10.5;
             
               System.out.println("The cost to ship this package is: $" + costinpound * weight ); 
             
           }
    }
}
