/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11hw;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Paul Christian
 */
public class OrderOfCatchBlocks1118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
        System.out.print("Please enter a number between 0-10: ");
        int number = input.nextInt();
        
        System.out.printf("You've entered %d%n", number);
    }
        catch(RuntimeException runtimeException){
            System.err.printf("%nException: %s%n", runtimeException);
            System.out.printf("You've created a Runtime Exception.&n");
        }
        catch(InputMismatchException inputMismatchException){
            System.err.printf("%nException: %s%n", inputMismatchException);
            input.nextLine();
            System.out.printf(
            "You've entered an non integer.%n");
        }
    }
}
