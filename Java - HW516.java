/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg5.pkg16;
import java.util.Scanner;
/**
 *
 * @author Paul Christian
 */
public class HW516 {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    
    String bar1 = "*";
    String bar2 = "*";
    String bar3 = "*";
    String bar4 = "*";
    String bar5 = "*";
    
        System.out.print("Please enter a number between 1 - 30: ");
        int num1 = input.nextInt();
        
        System.out.print("Please enter a number between 1 - 30: ");
        int num2 = input.nextInt();
        
        System.out.print("Please enter a number between 1 - 30: ");
        int num3 = input.nextInt();
        
        System.out.print("Please enter a number between 1 - 30: ");
        int num4 = input.nextInt();
        
        System.out.print("Please enter a number between 1 - 30: ");
        int num5 = input.nextInt();

        
    for(int x = 1; x <= num1; x++)
    {
    System.out.print("*");
    }
    System.out.println();
    for(int x = 1; x <= num2; x++)
    {
    System.out.print("*"); 
    }
    System.out.println();
    for(int x = 1; x <= num3 ; x++)
    {
    System.out.print("*");
    }
    System.out.println();
    for(int x = 1; x <= num4; x++)
    {
    System.out.print("*");  
    }
    System.out.println();
    for(int x = 1; x <= num5; x++)
    {
    System.out.print("*");  
    }
    System.out.println();
  }
}