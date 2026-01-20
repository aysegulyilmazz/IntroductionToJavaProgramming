//(Geometry: point in a circle?
package introductiontojavaprogramming.chapter02;
import java.util.Scanner; 
/**
 *
 * @author ayşegül
 */
public class Q06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: "); //Prompt the user to enter a point with two coordinates
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        //Define the circle's center and radius
        double centerX = 0;

        double centerY = 0;

        double radius = 10;

       //Calculate the distance from the point to the center of the circle
        double distance = Math.pow(Math.pow((centerX - x), 2) + Math.pow((centerY - y), 2), 0.5);
        if (distance <= radius) {

        System.out.println("Point (" + x + " , " + y + ") is in the circle");

        } else {

        System.out.println("Point ("+ x +" , "+ y + ") is not in the circle");

        }
        
        
    }
    
}
