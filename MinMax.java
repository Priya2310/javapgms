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
public class MinMax {
    public void compare()
    {
        int a[][]= new int[2][2];
        int min,max;
        System.out.println("Enter the values for array");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
                a[i][j] = s.nextInt();
        }
        min=a[0][0];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(min>a[i][j])
                {
                    min=a[i][j];
                }
            }
        }
        max=a[0][0];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
        }
        System.out.println("Minimum Value is : "+ min);
        System.out.println("Maximum Value is : "+ max);
    }
}
