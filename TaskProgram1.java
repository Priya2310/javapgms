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
public class TaskProgram1 
{
public void display()
{
    float a;
    System.out.println("Enter the value");
    Scanner s = new Scanner(System.in);
    a = s.nextFloat();
    if(a==0)
    {
        System.out.println("Zero");
    }
    else if(a<0)
    {
        System.out.println("Value is negative");
    }
    else
    {
        System.out.println("Value is positive");
    }
    if(a<1)
    {
        System.out.println("Small");
    }
    if(a>1000000)
    {
        System.out.println("Large");
    }
}
}
