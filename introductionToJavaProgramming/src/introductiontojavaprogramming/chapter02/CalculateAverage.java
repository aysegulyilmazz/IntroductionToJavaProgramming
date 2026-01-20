/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introductiontojavaprogramming.chapter02;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class CalculateAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three number to calculate average");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        double average= (number1 + number2 + number3) / 3;
        System.out.println("The average is : " + average);
    }
}
