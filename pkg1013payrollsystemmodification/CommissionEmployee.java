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
public class CommissionEmployee extends Employee
{
   private double grossSales;
   private double commissionRate;
 
   // five-argument constructor
   public CommissionEmployee(String first, String last, String ssn,
           Date DayOfBirth, double sales, double rate){
      super(first, last, ssn, DayOfBirth);
      setGrossSales(sales);
      setCommissionRate(rate);
   }
 
   public final void setCommissionRate(double rate){
      commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
   }

   public double getCommissionRate(){
      return commissionRate;
   }
 
   public final void setGrossSales(double sales){
      grossSales = (sales < 0.0 ) ? 0.0 : sales;
   }
 
   public double getGrossSales(){
      return grossSales;
   }
 

   public double earnings(){
      return getCommissionRate() * getGrossSales();
   }
 
    @Override
   public String toString(){
      return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
         "Commission employee", super.toString(),
         "Gross sales", getGrossSales(),
         "Commission rate", getCommissionRate());
   }
}