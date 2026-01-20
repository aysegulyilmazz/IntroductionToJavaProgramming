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
public class ComputeArea {
    public static void main(String[] args){
        double radius;
        double area;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius to calculate area.");        radius = input.nextDouble();
        
        area = radius * radius * 3.14159;
        System.out.println("The area is : " + area);
        
        
    }
}
