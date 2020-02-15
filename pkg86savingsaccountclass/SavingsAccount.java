/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg86savingsaccountclass;

public class SavingsAccount {

    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance)
    {
        this.savingsBalance = balance;
    }

    public double calculateMonthlyInterest()
    {
        return ((savingsBalance * (annualInterestRate * .01) / 12) + savingsBalance);
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }

    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
}
