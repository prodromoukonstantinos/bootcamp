/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Konstantinos
 */
public class Person {
    
    private String LastName;
    private String FirtsName;
    private String FathersName;
    private String DoB;

   
    public void setString(int x, String S) {
       
      
        
       switch(x){
               case 1   :
                   this.LastName = S;
                   break;
                   
                case 2  :
                   this.FirtsName = S;
                   break;
                   
                   case 3   :
                   this.FathersName = S;
                   break;
                   
                   case 4   :
                   this.DoB = S;
                   break;
       
       }
    }
        
    

    public String getString(int x) {
        
         String temp = "";
          switch(x){
               case 1   :
                     temp = this.LastName;
                     break;
                
                   
                   
                case 2   :
                    temp = this.FirtsName;
                    break;
                   
                   case 3   :
                   temp =  this.FathersName;
                   break;
                   
                   case 4   :
                   temp = this.DoB;
                   break;
       
       }
       
        return temp;
    }
   
            
        
        
    }

