package introductiontojavaprogramming.chapter03;
import java.util.Scanner;

public class Q02 {
	 public static void main(String[] args){
	        
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number between 0 and 1000: ");
	        
	        int x = input.nextInt();
	        int a = x / 100;
	        int b = x % 100 / 10;
	        int c = x % 100 % 10;
	        
	        System.out.println("The sum of the digits is " + (a+b+c));
}
}