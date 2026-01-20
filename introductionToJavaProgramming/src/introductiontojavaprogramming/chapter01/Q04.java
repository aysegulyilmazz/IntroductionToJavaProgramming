package introductiontojavaprogramming.chapter01;
import  java.util.Scanner;
public class Q04 {
	 public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the amount of water in kilograms: ");
	        double kg = input.nextDouble();
	        
	        System.out.print("Enter the initial temperature: ");
	        double initial_temperature = input.nextDouble();
	        
	        System.out.print("Enter final temperatures: ");
	        double final_temperature = input.nextDouble();
	       
	     
	        // Calculate the energy
	        double Q = kg * (final_temperature - initial_temperature) * 4184;
	        
	        System.out.println("The energy needed is "+ Q);
	        
	    }
}
