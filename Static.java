/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapgms;

/**
 *
 * @author Student
 */
public class Static 
{
    static int a=5;
public void display()
{
    a=10;
    final int b=10;
    //b=5;              Displays an error that value cannot be assigned to variable
    System.out.println(a);
}
public static void add(int a, int b)
{
    int c=a+b;
    System.out.println("Sum : " +c);
}
}
