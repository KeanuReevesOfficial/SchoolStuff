/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw710salescommision;
import java.util.Scanner;
/**
 *
 * @author Paul Christian
 */
public class HW710SalesCommision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int total[] = new int[9];
      
    System.out.print("Please enter sales amount or type -1 to end: ");
    double sales = input.nextDouble();
    
    while (sales >= 0 && sales != -1){
        double commission = sales * .09 + 200;
        int range = (int) (commission / 100);
        
        if(range > 10)
            range = 10;
        
        ++total[range - 2];
   
         System.out.print("Please enter sales amount or type -1 to end: ");
         sales = input.nextDouble();
    }
    
    System.out.printf("Range\t\tAmount%n");
    
    for(int range = 0; range < total.length - 1; range++){
        System.out.printf("$%d-$%d\t%d%n", (200 + 100 * range), (299 + 100 * range),
                total[range]);
    }
        System.out.printf( "$1000 and over\t%d%n",
         total[total.length - 1]); 
    } 
}
