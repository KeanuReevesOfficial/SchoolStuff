/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg4.hw.pkg4.pkg22;

/**
 *
 * @author Paul Christian
 */
public class Chapter4HW422 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
  
        System.out.printf("N\t10*N\t100*N\t1000*N%n%n");
        for(e = 1; e <= 5; e++) 
        {
        System.out.printf("%d\t", e );
        a = e * 10;
        System.out.printf("%d\t", a );
        b = e * 100;
        System.out.printf("%d\t", b );
        c = e * 1000;
        System.out.printf("%d\t\n", c );
        }
    }
}
