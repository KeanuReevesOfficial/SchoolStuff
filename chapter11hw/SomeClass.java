/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11hw;
import java.util.Scanner;
/**
 *
 * @author Paul Christian
 */

public class SomeClass {
public int parents;
public int kids;
public int pets;

public SomeClass(int parents, int kids, int pets) throws Exception{
    this.parents = parents;
    this.kids = kids;
    this.pets = pets;
    
    if(parents <= 0)
        throw new IllegalArgumentException("Enter Number Above 0!");
    if(kids < 0)
        throw new IllegalArgumentException("Enter Number Above 0!");
    if(pets < 0)
        throw new IllegalArgumentException("Enter Number Above 0!");
    }

public void setParents(int parents){
    this.parents = parents;
}

public int getParents(){
    return parents;
}

public void setKids(int kids){
    this.kids = kids;
}

public int getKids(){
    return kids;
}

public void setPets(int pets){
    this.pets = pets;
}

public int getPets(){
    return pets;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        SomeClass myFamily = new SomeClass(0, 1, 1);
        
        System.out.printf("Parents: %d%nKids: %d%nPets: %d%n",
                myFamily.getParents(), myFamily.getKids(), myFamily.getPets());
            
        }
        catch(Exception exception){
            System.err.println("Illegal Argument Exception");
        }
    }
}