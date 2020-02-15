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
public class PayrollSystemTest
{
   public static void main(String args[]){
      Date currentDate = new Date(6,20,2010);
      System.out.printf("Current Date is: %s\n", currentDate.toString());
      System.out.println("###################################");
      SalariedEmployee salariedEmployee =
         new SalariedEmployee("John", "Smith", "111-11-1111",
                 new Date(5, 11, 1984), 800.00);
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee("Karen", "Price", "222-22-2222",
                 new Date(6, 15, 1988), 16.75, 40);
      CommissionEmployee commissionEmployee =
         new CommissionEmployee("Sue", "Jones", "333-33-3333",
                 new Date(8, 25, 1974), 10000, .06);
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                 new Date(9, 27, 1978), 5000, .04, 300);
      PieceWorker pieceWorker =
                 new PieceWorker("Paul", "Christian", "555-55-5555",
              new Date(2, 2, 1987), 492, 04);
 
      System.out.println("Employees processed individually:\n");
 
      System.out.printf("%s\n%s: $%,.2f\n\n",
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s\n%s: $%,.2f\n\n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         basePlusCommissionEmployee,
         "earned", basePlusCommissionEmployee.earnings());
      System.out.printf("%s\n%s: $%,.2f\n\n",
              pieceWorker, "earned", pieceWorker.earnings());
 
      Employee employees[] = new Employee[5];

      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = basePlusCommissionEmployee;
      employees[4] = pieceWorker;
 
      System.out.println("###################################");
      System.out.println("Employees processed polymorphically:\n");
 
      for (Employee currentEmployee : employees){
         System.out.println( currentEmployee );
 
         if (currentEmployee instanceof BasePlusCommissionEmployee){
            BasePlusCommissionEmployee employee =
               (BasePlusCommissionEmployee) currentEmployee;
 
            double oldBaseSalary = employee.getBaseSalary();
            employee.setBaseSalary(1.10 * oldBaseSalary);
            System.out.printf("New base salary with 10%% increase is: $%,.2f\n",
               employee.getBaseSalary());
         }
 
         if(currentDate.getMonth() == currentEmployee.getBirthday().getMonth()){
             System.out.printf("Earned $%,.2f. %s\n\n",
                     currentEmployee.earnings() + 100.00,
                     "Note: added a $100 bonus to your payroll amount for birthday.");
         }
         else{
             System.out.printf("Earned $%,.2f\n\n", currentEmployee.earnings());
         }
      }
 
      for ( int i = 0; i < employees.length; i++ )
         System.out.printf("Employee %d is a %s\n", i,
            employees[i].getClass().getSimpleName());
   }
}