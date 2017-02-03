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
public abstract class SampleAbstract 
{
public int deposit(int bal,int amt)
{
    int newbal = bal+amt;
    System.out.println("Balance is" + newbal);
    return 0;
}
public abstract void getrate();
}
