/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapgms;

import java.util.Scanner;


/**
 *
 * @author Student
 */
public class TestDoctor 
{
public static void main(String args[])
{
  
   int id;
   System.out.println("Enter the id of doctor :");
   Scanner s = new Scanner(System.in);
   id=s.nextInt();
   Pediatrician p = new Pediatrician();
   p.getDetails();
   Neuro n = new Neuro();
    if(id>100 && id<200)
        p.dis(id);
   if(id>200)
       n.dis1(id);
    
}
}
