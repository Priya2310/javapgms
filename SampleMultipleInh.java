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
class A
{
    public void display()
    {
        System.out.println("Parent Class A");
    }
}
class B
{
  public void display()
    {
        System.out.println("Parent Class B");
    }  
}
public class SampleMultipleInh extends A,B
{
   public void sum()
{
}
