package introductiontojavaprogramming.chapter03;
import java.util.Scanner;

public class Q03 {
	  public static void main(String[] args){
	        
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of minutes: ");
	        
	        int x = input.nextInt();
	        int year = x / 60 / 24 / 365;
	        int day = x / 60 / 24 - (year * 365);
	        
	        System.out.println(x+ " minutes is approximately " + year + " years and " + day + "days");
	             
	        
	        
	    }
	    
	}