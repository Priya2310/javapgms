/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplearray;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class SumofNos {
   
    public void add()
    {
        int a[] = new int[10];
        int sum=0;
        System.out.println("Enter the numbers");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
       for(int i=0;i<10;i++)
       {
         sum = sum + a[i];  
       }
       System.out.println("Sum of Nos in array : " +sum);
    }
    
}
