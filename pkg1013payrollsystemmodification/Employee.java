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
public abstract class Employee
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date birthday;
 

   public Employee(String first, String last, String ssn , Date DayOfBirth)
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
      birthday = DayOfBirth;
   }
 

   public void setFirstName(String first){
      firstName = first;
   }
 
   // return first name
   public String getFirstName(){
      return firstName;
   }
 
   public void setLastName(String last){
      lastName = last;
   }
 
   public String getLastName(){
      return lastName;
   }
 
   public void setSocialSecurityNumber(String ssn){
      socialSecurityNumber = ssn;
   }
 
   public String getSocialSecurityNumber(){
      return socialSecurityNumber;
   }
 
   public void setBirthday(Date DayOfBirth){
       birthday = DayOfBirth;
   }
 
   public Date getBirthday(){
       return birthday;
   }
 
    @Override
   public String toString(){
      return String.format("%s %s\nSocial security number: %s\nBirthday: %s\n",
         getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthday());
   }
 

   public abstract double earnings();
}
