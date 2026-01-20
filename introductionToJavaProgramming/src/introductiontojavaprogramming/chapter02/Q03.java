//Sort three integers
package introductiontojavaprogramming.chapter02;
import java.util.Scanner; // Scanner is in the java.util package
/**
 *
 * @author ayşegül
 */
public class Q03 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers");
     
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
         if (a > b) {
            int temp1 = a;
            a = b;
            b = temp1;

        }

        if (b > c) {
            int temp2 = b;
            b= c;
            c = temp2;
        }

        if (a > b) {
            int temp3 = a;
            a = b;
            b = temp3;
        }
        System.out.println("Numbers in non-decreasing order: " + a + " " + b + " " + c);
        }
               
    }

