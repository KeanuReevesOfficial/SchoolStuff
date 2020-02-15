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
public class HourlyEmployee extends Employee{
   private double wage;
   private double hours;
 
   public HourlyEmployee(String first, String last, String ssn, Date DayOfBirth,
           double hourlyWage, double hoursWorked){
      super(first, last, ssn, DayOfBirth);
      setWage(hourlyWage);
      setHours(hoursWorked);
   }
 

   public final void setWage(double hourlyWage){
      wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
   }
 
   // return wage
   public double getWage(){
      return wage;
   }
 
   public final void setHours(double hoursWorked){
      hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ?
         hoursWorked : 0.0;
   }
 
   // return hours worked
   public double getHours(){
      return hours;
   }
 

   public double earnings(){
      if (getHours() <= 40)
         return getWage() * getHours();
      else
         return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
   }
 
    @Override
   public String toString()
   {
      return String.format("Hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
         super.toString(), "Hourly wage", getWage(),
         "Hours worked", getHours());
   }
}