//Algebra: solve quadratic equations
package introductiontojavaprogramming.chapter02;
import java.util.Scanner;//Scanner is in the java.util package
/**
 *
 * @author ayşegül
 */
public class Q01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c: ");
        
        //prompts the user to enter values for a, b, and c
        double a , b , c ;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        // Compute the discriminant of the quadriatic equation
        double discriminant = Math.pow(b,2) - (4 * a * c) ;
         
      
        // Compute the real roots of the quadriatic equation if any.
        System.out.println("The equation has: ");
        
        if(discriminant > 0){
            double r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = ((-1 * b) - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println(" two roots " + r1 +  " and " + r2);
            
        }  
            else if (discriminant == 0){
            double r = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println(" one root " + r);
        }
            else
            System.out.println(" no real roots ");
        }
        
  
    }

