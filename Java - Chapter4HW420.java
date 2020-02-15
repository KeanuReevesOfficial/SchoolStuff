/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg4.hw.pkg4.pkg20;
import java.util.Scanner;
/**
 *
 * @author Paul Christian
 */
public class Chapter4HW420 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String firstName;
        String lastName;
        int employeesEntered;
        double hoursWorked;
        double hourlyWage;
        double otPay;
        double combinedPay;
    
    for(employeesEntered = 0; employeesEntered < 3; employeesEntered++)
    {       
        
        System.out.print("Please Enter First Name: ");
        firstName = input.nextLine();
        
        System.out.print("Please Enter Last Name: ");
        lastName = input.nextLine();
        
        System.out.print("Please Enter Hours Worked: ");
        hoursWorked = input.nextInt();
        
        System.out.print("Please Enter Hourly Wage: ");
        hourlyWage = input.nextInt();
        input.nextLine();
        if(hoursWorked > 40)
        {
        otPay = (hoursWorked - 40) * (hourlyWage * 1.5);
        combinedPay = (hourlyWage * 40) + otPay;
        
        System.out.printf("First Name: %s%n Last Name: %s%n Hours Worked %s%n Pay: %s%n",
                firstName, lastName, hoursWorked, combinedPay);
        }
        else
        {
        combinedPay = (hourlyWage * hoursWorked);
        System.out.printf("First Name: %s%n Last Name: %s%n Hours Worked %s%n Pay: %s%n",
                firstName, lastName, hoursWorked, combinedPay);
        }
    }
  }
}
