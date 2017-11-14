/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.FileNotFoundException;
import java.util.Scanner;
import static javax.swing.UIManager.getString;

/**
 *
 * @author Konstantinos
 */
public class Simple_Java_Application2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter your first Name:");
        person.setString(1, in.next());
        System.out.println("Enter your last Name:");
        person.setString(2, in.next());
        System.out.println("Enter your Fathers Name:");
        person.setString(3, in.next());
        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
        person.setString(4, in.next());
       
       WriteReadFile write = new WriteReadFile(person);
       for( int i=1; i<4; i++){
           switch (i){
           
               
               case 1 : 
                   String s = "Line " + i +":"+person.getString(i)+", "+person.getString(i+1)+", "+person.getString(i+2);
                write.writeString(i,s);
                break;
           
           
               case 2:
                
                String p = "Line " + i +":"+ person.getString(i+2);
                write.writeString(i,p);
                break;
           
               case 3:
                String k = "Line " + i +":"+(2017-Integer.parseInt(person.getString(i+1).substring(6,10)));
                write.writeString(i,k);
                break;
           
           }
           
      
        
    }
    
}}
