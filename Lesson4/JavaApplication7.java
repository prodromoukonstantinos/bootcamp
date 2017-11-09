/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Konstantinos
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean repeat = true;
        do{  
            
            System.out.println("Enter first number:");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        
        System.out.println("Enter second number:");
        
        int j = in.nextInt();
        
        System.out.println("Enter third number:");
       ;
        int k = in.nextInt();
        int sum = (i + j);
        
        
        if( j >= 2*i && k > sum){
            repeat = false;
        }
        }
        
        
      
        while( repeat );
        
    }
    
}
