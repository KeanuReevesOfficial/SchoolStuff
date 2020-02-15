/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee313;

/**
 *
 * @author Paul Christian
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ySalary1;
        double ySalary2;
        double raiseSalary1;
        double raiseSalary2;
        
        Employee employee1 = new Employee("Paul", "Christian", 6000.00);
        Employee employee2 = new Employee("Kristina", "Conrad", 7000.00);
        
        
        ySalary1 = employee1.getmSalary() * 12;
        ySalary2 = employee2.getmSalary() * 12;
        
        
        System.out.printf("%s %s's yearly salary is $%.2f", 
                employee1.getfistName(), employee1.getlastName(),
                ySalary1);
        System.out.printf("%n%s %s's yearly salary is $%.2f", 
                employee2.getfistName(), employee2.getlastName(),
                ySalary2);
        
        raiseSalary1 = ySalary1 + (ySalary1 * 0.1);
        raiseSalary2 = ySalary2 + (ySalary2 * 0.1);
        
        System.out.printf("%n%s %s's new salary is $%.2f", 
                employee1.getfistName(), employee1.getlastName(),
                raiseSalary1);
        System.out.printf("%n%s %s's new salary is $%.2f", 
                employee2.getfistName(), employee2.getlastName(),
                raiseSalary2);
    } 
}
