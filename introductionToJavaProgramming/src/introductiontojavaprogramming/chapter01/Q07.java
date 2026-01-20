package introductiontojavaprogramming.chapter01;

import java.util.Scanner;

public class Q07 {
	 public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter three points for a triangle: ");
	        
	        double pointx1 = input.nextDouble();
	        double pointy1 = input.nextDouble();
	        
	        double pointx2 = input.nextDouble();
	        double pointy2 = input.nextDouble();
	        
	        double pointx3 = input.nextDouble();
	        double pointy3 = input.nextDouble();
	        
	        // Compute the area of a triangle
	        double side1 = Math.pow(Math.pow(pointx2 - pointx1, 2) + Math.pow(pointy2 - pointy1, 2), 0.5);
	        double side2 = Math.pow(Math.pow(pointx3 - pointx2, 2) + Math.pow(pointy3 - pointy2, 2), 0.5);
	        double side3 = Math.pow(Math.pow(pointx1 - pointx3, 2) + Math.pow(pointy1 - pointy3, 2), 0.5);
	        
	        double s = ( side1 + side2 + side3 ) / 2;
	        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	        
	        System.out.println("The area of the triangle is: " + area);
	                
	        }
}
