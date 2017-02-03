/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCallByVal;

import java.util.Scanner;
import samplecallbyval.SampleCallByRef;

/**
 *
 * @author Student
 */
public class TestCallByRef 
{
public static void main(String args[])
{
    int a[]= new int[10];
    SampleCallByRef sc = new SampleCallByRef();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the numbers");
    for(int i=0;i<10;i++)
    {
      a[i] = s.nextInt();
    }
    sc.min(a);
}
}
