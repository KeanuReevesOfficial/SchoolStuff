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
public class Employee {
    private String firstName;
    private String lastName;
    private double mSalary;
    
    public Employee(String firstName, String lastName, double mSalary){
        this.firstName = firstName;
        this.lastName = lastName;

        if(mSalary < 0){
            this.mSalary = 0;
        }
        else {
            this.mSalary = mSalary;
        }
    }
    
    public double getmSalary(){
        return mSalary;
    }
    
    public void setfirstName(){
        this.firstName = firstName;
    }
    
    public void setlastName(){
        this.lastName = lastName;
    }
    
    public String getfistName(){
        return firstName;
    }
    
    public String getlastName(){
        return lastName;
    }
}
