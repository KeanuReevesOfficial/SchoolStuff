/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateelimination;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        
        for(int i = 0; i < names.length; i++){
            System.out.print("Enter First Name: ");
            names[i] = input.nextLine();
        }  
        List<String> list = Arrays.asList(names);

        printList(list);
        searchList(list);
    }
    
    private static void printList(Collection<String> values){
                Set<String> set = new HashSet<>(values);
        
        System.out.printf("%nList of first names excluding duplicates: ");
        
        for (String value : set){
            System.out.printf("%s, ", value);
        }
        
        System.out.println();
    }
    
    private static void searchList(Collection<String> name){
        String fName = null;
        
        Set<String> set = new HashSet<>(name);
        Scanner input = new Scanner(System.in);
        
            System.out.print("First name to search?: ");
            fName = input.nextLine();
   
                if(set.contains(fName)){
                    System.out.println("Name found in set!");
                }
                else{
                System.out.println("Name is not found in set.");
                }
        }  
    }