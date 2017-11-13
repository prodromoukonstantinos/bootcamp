/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_java_application1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Konstantinos
 */
public class Simple_Java_Application1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
            String S1 = "";
            String S2 = "";
            String S3 = "";
            
           
            Scanner in =  new Scanner(System.in);
            System.out.println("Enter your Last Name: ");
            String lastName = in.next();
            System.out.println("Enter your First Name: ");
            String firstName = in.next();
            System.out.println("Enter your Father's Name: ");
            String fathersName = in.next();
            System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
            String DoB = in.next();
            String dateOfBirth = DoB.substring(6,10);
            int Dob = Integer.parseInt(dateOfBirth);
            
            PrintWriter writer = new PrintWriter(lastName+"."+firstName+".txt");
    for(int i=1; i<4; i++){
        if(i==1){S1 = ("Line " + i +":"+lastName+", "+firstName+", "+fathersName);
        writer.println(S1);}
        if(i==2){S2 = ("Line " + i +":"+DoB);
        writer.println(S2);}
         if(i==3){S3 = ("Line " + i +":"+(2017-Dob));
        writer.println(S3);}
            
         }
    
    writer.close();
    }
    
}
