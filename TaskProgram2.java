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
public class TaskProgram2 
{
public int displayCube()
{
   int n, cube;
   System.out.println("Enter the number");
   Scanner s = new Scanner(System.in);
   n = s.nextInt();
   for(int i=1;i<=n;i++)
   {
       cube = i*i*i;
       System.out.println("Cube value of " + i + " is " + cube);
   }
   return 0;
}
}
