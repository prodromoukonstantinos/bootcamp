/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Konstantinos
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println(factorial(in.nextInt()));
        
    }
    
     static long factorial (int n) {

  int i;
  long result=1;
  
  for (i=1; i <= n; i++) {
   result *= i;
  }
  
  return result;

}
    
}
