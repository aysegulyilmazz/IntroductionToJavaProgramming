package introductiontojavaprogramming.chapter02;
import java.util.Scanner;

public class computecylinder {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter a radius and length
        System.out.println("Enter the radius and length of a cylinder: ");
                double radius = input.nextDouble();
                double length = input.nextDouble();
                // compute the area and volume
                double area = radius * radius * 3.14159;
                double volume = area* length;
                // Display result 
                
                System.out.println("The area is : " + area);
                System.out.println("The volume is : " + volume);
                
    }
}
