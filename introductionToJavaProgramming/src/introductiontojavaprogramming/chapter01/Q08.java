package introductiontojavaprogramming.chapter01;
import java.util.Scanner;

public class Q08 {
	
	 public static void main(String[] args){
		    
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter balance and interest rate (e.g., 3 for 3%: ");
	        
	        double balance = input.nextDouble();
	        double interestrate = input.nextDouble();
	        
	        double interest = balance * (interestrate / 1200);
	        
	        System.out.println("The interest is " + interest);
	        
	    }
}
