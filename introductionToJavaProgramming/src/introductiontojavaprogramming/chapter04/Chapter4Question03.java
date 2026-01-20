//Convert letter grade to number
package introductiontojavaprogramming.chapter04;
import java.util.Scanner;
/**
 *
 * @author ayşegül
 */
public class Chapter4Question03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String grade = scanner.next();
        char letter = grade.charAt(0);
        
        switch (letter) {
        case 'A':
            System.out.println("The numeric value for grade A is 4");
            break;
        case 'B':    
            System.out.println("The numeric value for grade B is 3");
            break;
        case 'C':
            System.out.println("The numeric value for grade C is 2");
            break;
        case 'D':
            System.out.println("The numeric value for grade D is 1");
            break;
        case 'F':
            System.out.println("The numeric value for grade F is 0"); break;
        default:
            System.out.println(grade+" is an invalid grade.");

}
    }
}
