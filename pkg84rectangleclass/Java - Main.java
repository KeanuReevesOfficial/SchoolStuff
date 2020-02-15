/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg84rectangleclass;

/**
 *
 * @author Paul Christian
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6.6f, 7.2f);
        
    System.out.printf("Width of the rectangle: %.2f%n", r1.getWidth());
   
    System.out.printf("Length of the rectangle: %.2f%n", r1.getLength());
    
    System.out.printf("Perimeter of the rectangle: %.2f%n", r1.getPerimeter());
    
    System.out.printf("Area of the rectangle: %.2f%n", r1.getArea());
    }   
}

