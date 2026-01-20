package introductiontojavaprogramming.chapter03;
import java.util.Scanner;

public class Q05 {
	 public static void main(String[] args){
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter the montly saving amount:  ");
		     
		    double x = input.nextDouble();
		    double y = (1 + 0.00417);
		    
		    double month1 = x * y ;
		    double month2 = ( x + month1 )* y;
		    double month3 = ( x + month2 )* y;
		    double month4 = ( x + month3 )* y;
		    double month5 = ( x + month4 )* y;
		    double month6 = ( x + month5 )* y;
		    
		    System.out.print("After the six month , the account value is  $"  + month6);
		    
		    } 
}
