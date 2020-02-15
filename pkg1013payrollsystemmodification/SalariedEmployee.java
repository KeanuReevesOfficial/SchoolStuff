/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1013payrollsystemmodification;


/**
 *
 * @author Paul Christian
 */
public class SalariedEmployee extends Employee{
   private double weeklySalary;
 
   public SalariedEmployee(String first, String last, String ssn,
           Date DayOfBirth, double salary){
      super( first, last, ssn, DayOfBirth);
      setWeeklySalary(salary);
   }
 

   public final void setWeeklySalary(double salary){
      weeklySalary = salary < 0.0 ? 0.0 : salary;
   }
 
   public double getWeeklySalary(){
      return weeklySalary;
   }
 
   public double earnings(){
      return getWeeklySalary();
   }
 

    @Override
   public String toString(){
      return String.format("Salaried employee: %s\n%s: $%,.2f",
         super.toString(), "Weekly salary", getWeeklySalary());
   }
}