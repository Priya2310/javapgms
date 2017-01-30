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
public class SampleArray {

    public void getNumbers()
    {
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            arr[i] = s.nextInt();
        }
    System.out.println("The entered nos are");
        for(int i=0;i<10;i++)
    {
        System.out.println(arr[i]);
    }
    }
    
}
