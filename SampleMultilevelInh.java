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
class X
{
    public void display()
    {
        System.out.println("Parent class A");
    }
}
class Y extends X
{
    public void print()
    {
        System.out.println("Child class of A");
    }
}
public class SampleMultilevelInh extends Y
{
    public void msg()
    {
        System.out.println("Child class of B");
    }
}
