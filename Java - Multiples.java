/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiples616;
import java.util.Scanner;
/**
 *
 * @author Paul Christian
 */
public class Multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.print("Please enter first integer: ");
        int int1 = input.nextInt();
        
        System.out.print("Please enter second integer: ");
        int int2 = input.nextInt();
        
        boolean answer = isMultiple(int1, int2);
                if(answer == true){
                    System.out.printf(
                            "%d is a multiple of the first integer %d%n",
                            int2, int1);
                }
                else{
                    System.out.printf(
                            "%d is not a multiple of the first integer %d%n",
                            int2, int1);
                }
    }
    
    public static boolean isMultiple(int x, int y){
        if(0 == y % x){
            return true;
        }
        else{
            return false;
        }
    }  
}
