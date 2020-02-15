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
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date myBirthday = new Date(02, 02, 1987);
        Date anniversary = new Date(05, 28, 2016);
    
    System.out.printf("%sis my birthday!%n", myBirthday.displayDate());
    System.out.printf("%sis my anniversary!%n", anniversary.displayDate());
    }
    
}
