/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateClass314;

/**
 *
 * @author Paul Christian
 */
public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }    
    
    public String displayDate(){
        System.out.printf("%d/%d/%d", this.month, this.day, this.year);
        return " ";
    }
    
    public void setmonth(){
        this.month = month;
    }
    
    public int getmonth(){
        return month;
    }
    
    public void setday(){
        this.day = day;
    }
    
    public int getday(){
        return day;
    }
    
    public void setyear(){
        this.year = year;
    }
    
    public int getyear(){
        return year;
    }
}
