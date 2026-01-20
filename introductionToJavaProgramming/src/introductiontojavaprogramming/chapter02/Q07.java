//Financial: compare costs
package introductiontojavaprogramming.chapter02;
import java.util.Scanner;
/**
 *
 * @author ayşegül
 */
public class Q07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
         
        System.out.println(" Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        
       if((weight1 / price1) < (weight2 /price2) ){ 
           System.out.println("Package 1 has a better price. ");
       }  else if((weight1 / price1) > (weight2 / price2)){
               
       }    else {
           System.out.println(" Two packages have the same price. ");
           
                   
       }
    }
}
