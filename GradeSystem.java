/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradesystem;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class GradeSystem {

    /**
     * @param args the command line arguments
     */
    public void gradeSys()
    {
        String grade;
        String name;
        System.out.println("Enter the name and grade:");
        Scanner s = new Scanner(System.in);
        name=s.nextLine();
        grade=s.nextLine();
        if(grade.equals("A"))
        {
            System.out.println("Excellent");
        }
        else if(grade.equals("B"))
        {
            System.out.println("Good");
        }
        else if(grade.equals("C"))
         {
            System.out.println("Average");
        }
        else if(grade.equals("D"))
        {
            System.out.println("Poor");
        }
        else
        {
           System.out.println("Invalid Grade");  
        }
             
    }
    
}
