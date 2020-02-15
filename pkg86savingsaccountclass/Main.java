/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg86savingsaccountclass;

/**
 *
 * @author Paul Christian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount(2000.00);
        SavingsAccount account2 = new SavingsAccount(3000.00);

        System.out.printf("Balance for Account1 = %.2f%n", 
                account1.getSavingsBalance());
        System.out.printf("Balance for Account2 = %.2f%n%n", 
                account2.getSavingsBalance());
        
        SavingsAccount.modifyInterestRate(4);
        System.out.printf("Interest rate is: %.0f%n", SavingsAccount.getAnnualInterestRate());

        System.out.printf("Balance for Account1 = %.2f%n", 
                account1.calculateMonthlyInterest());
        System.out.printf("Balance for Account2 = %.2f%n", 
                account2.calculateMonthlyInterest());
        
        
        SavingsAccount.modifyInterestRate(5);
        System.out.printf("Interest rate is: %.0f%n", SavingsAccount.getAnnualInterestRate());

        System.out.printf("Balance for Account1 = %.2f%n", 
                account1.calculateMonthlyInterest());
        System.out.printf("Balance for Account2 = %.2f%n", 
                account2.calculateMonthlyInterest());       
    }
}
