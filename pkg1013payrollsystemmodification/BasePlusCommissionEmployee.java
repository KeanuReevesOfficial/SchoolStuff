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
public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary;
 
   // six-argument constructor
   public BasePlusCommissionEmployee(String first, String last,
      String ssn, Date DayOfBirth,double sales, double rate, double salary){
      super(first, last, ssn, DayOfBirth,sales, rate);
      setBaseSalary(salary);
   }
 
   public final void setBaseSalary(double salary){
      baseSalary = (salary < 0.0) ? 0.0 : salary;
   }
 
   public double getBaseSalary(){
      return baseSalary;
   }
 
    @Override
   public double earnings(){
      return getBaseSalary() + super.earnings();
   }
 
    @Override
   public String toString(){
      return String.format("%s %s; %s: $%,.2f",
         "Base-salaried", super.toString(),
         "Base salary", getBaseSalary());
   }
}