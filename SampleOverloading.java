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
public class SampleOverloading 
{
public int add(int a, int b)
{
    int sum= a + b;
    System.out.println("Sum of 2 nos" + sum);
    return sum;
}
public int add(int a, int b,int c)
{
    int sum= a + b + c;
    System.out.println("Sum of 3 nos" + sum);
    return sum;
}
    

}
