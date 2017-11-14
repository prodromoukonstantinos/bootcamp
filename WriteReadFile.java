/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Konstantinos
 */
public class WriteReadFile {
    
    
  private Person person;

    public WriteReadFile(Person person) {
        this.person = person;
    }


    
    
  
     public  void writeString(int i, String s) throws FileNotFoundException{
        
       PrintWriter writer = new PrintWriter(person.getString(1)+"."+person.getString(2)+".txt");
       for(int x = 1; x<4; x++){
       writer.println(s);
       
      }
       
       writer.close();
       
       }
     
     
     
     
        }
    