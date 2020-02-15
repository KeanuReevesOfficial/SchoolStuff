/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.homework;
import java.util.Scanner;
/**
 *
 * @author Paul Christian
 */
public class Chapter2Homework224 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();
        
        System.out.print("Enter fourth integer: ");
        int number4 = input.nextInt();
        
        System.out.print("Enter fifth integer: ");
        int number5 = input.nextInt();
       
        int small;
        small = number1;
        if (small > number2)
        {
            small = number2;
        }
        if (small > number3)
        {
            small = number3;
        }
        if (small > number4)
        {
            small = number4;
        }
        if (small > number5)
        {
            small = number5;
        }
        
        int large;
        large = number1;
        if (large < number2)
        {
            large = number2;
        }
        if (large < number3)
        {
            large = number3;
        }
        if (large < number4)
        {
            large = number4;
        }
        if (large < number5)
        {
            large = number5;
        }
        
        System.out.printf("%d is the smallest number and %d is the largest", small, large);
    }
}
