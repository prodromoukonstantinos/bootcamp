/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Konstantinos
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        
        int i  = in.nextInt();
        System.out.println("Enter a string:");
        
        String j = in.next();
        System.out.println(i + j);
                
    }
    
}
