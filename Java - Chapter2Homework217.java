/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.homework.pkg2.pkg17;
import java.util.Scanner;
/**
 *
 * @author Paul Christian
 */
public class Chapter2Homework217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //CHAPTER 2 EXERCISE 2.17
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        int number3 = input.nextInt();
        
        //SUM
        int sum = number1 + number2 + number3;
        System.out.printf("%s%d%n", "Sum is ", sum);
        
        //AVERAGE
        int average = (number1 + number2 + number3) / 3;
        System.out.printf("%s%d%n", "Average is ", average);
        
        //PRODUCT
        int product = number1 * number2 * number3;
        System.out.printf("%s%d%n", "Product is ", product);
        
        //LARGEST
        if (number1 > number3 && number1 > number2)
        {
            System.out.printf("%d%s%n", number1, " is the largest number");
        }
        if (number2 > number1 && number2 > number3)
        {
            System.out.printf("%d%s%n", number2, " is the largest number");
        }
        if (number3 > number1 && number3 > number2)
        {
            System.out.printf("%d%s%n", number3, " is the largest number");
        }
        
        //SMALLEST;
         if (number1 < number3 && number1 < number2)
        {
            System.out.printf("%d%s%n", number1, " is the smallest number");
        }
        if (number2 < number1 && number2 < number3)
        {
            System.out.printf("%d%s%n", number2, " is the smallest number");
        }
        if (number3 < number1 && number3 < number2)
        {
            System.out.printf("%d%s%n", number3, " is the smallest number");
        }
    }
}
