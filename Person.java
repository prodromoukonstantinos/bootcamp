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

    

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirtsName() {
        return FirtsName;
    }

    public void setFirtsName(String FirtsName) {
        this.FirtsName = FirtsName;
    }

    public String getFathersName() {
        return FathersName;
    }

    public void setFathersName(String FathersName) {
        this.FathersName = FathersName;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
    
    
    public  void writeString(int x, Person p) throws FileNotFoundException{
        
       PrintWriter writer = new PrintWriter(p.getLastName()+"."+p.getFirtsName()+".txt");
        for(x=1; x<4; x++){
        
        if(x==1){String S1 = ("Line " + x +":"+p.getLastName()+", "+p.getFirtsName()+", "+p.getFathersName());
        writer.println(S1);}
        if(x==2){String S2 = ("Line " + x +":"+DoB);
        writer.println(S2);}
         if(x==3){String S3 = ("Line " + x +":"+(2017-Integer.parseInt(p.getDoB().substring(6,10))));
        writer.println(S3);}
            
        }
        
            
         
    
    writer.close();
    }
}
