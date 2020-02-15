/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleArea620;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *
 * @author Paul Christian
 */
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the radius of the circle: ");
        double radius = input.nextInt();
        
        double area = circleArea(radius);
        System.out.printf("%f is the area of a circle with radius %f%n",
                area, radius);
    }
    
    public static double circleArea(double x){
        double area = Math.PI * Math.pow(x, 2);
        return area;
    }
    
}
