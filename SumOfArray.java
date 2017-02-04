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
public class SumOfArray 
{
   public void add()
   {
    int a[][]= new int[2][2];
    int b[][]= new int[2][2];
    int c[][]= new int[2][2];
    System.out.println("Enter the values for a : ");
    Scanner s = new Scanner(System.in);
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
               a[i][j]=s.nextInt();
       }
    System.out.println("Enter the values for b : ");
      for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
               b[i][j]=s.nextInt();
       }
    System.out.println("Sum of arrays");
       for(int i=0;i<2;i++) {
           for(int j=0;j<2;j++) {
            c[i][j]=a[i][j]+b[i][j];
            System.out.println(c[i][j]);
           }
       }
           
       }
           
          
}
