/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.FileNotFoundException;
import java.util.Scanner;

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
        person.setFirtsName(in.next());
        System.out.println("Enter your last Name:");
        person.setLastName(in.next());
        System.out.println("Enter your Fathers Name:");
        person.setFathersName(in.next());
        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
        person.setDoB(in.next());
       for(int i=1; i<4; i++){
       person.writeString(i, person);
       }
        
        
    }
    
}
