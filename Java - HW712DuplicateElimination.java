/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw712duplicateelimination;
import java.util.Scanner;
/**
 *
 * @author Paul Christian
 */
public class HW712DuplicateElimination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integers[] = new int[5];
        int counter = 0;
        
        while(counter < integers.length){
        System.out.print("Please enter a number between 10-100: ");
        int num = input.nextInt();
    
        if(num >= 10 && num <= 100){    
           boolean duplicate = false;
                 
            for(int count = 0; count < counter; count++){
                if(num == integers[count]){
                    duplicate = true;
                }
            }
            if(duplicate != true){
                integers[counter] = num;
                counter++;                     
            }
            else{
                System.out.printf("%d has already been entered%n", num);
            }
            }
            else{
                System.out.printf("Number must be between 10-100");
            }    
            for(int count = 0; count < integers.length; count++){
                System.out.printf("Unique Numbers : %d%n", integers[count]);
            }
        }
    }
}

