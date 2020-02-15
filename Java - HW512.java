/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg5.pkg12;

/**
 *
 * @author Paul Christian
 */
public class HW512 {
    public static void main(String[] args) {
        int total = 1;
        int x;
    
        for(x = 1; x <=15; x += 2)
        {
            total *= x;
        }
        System.out.printf("%s%d%n", "Product is ", total);
    }
}
