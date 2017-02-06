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
class Abc
{
    public void display()
    {
        System.out.println("Parent class");
    }
}
class Xyz extends Abc
{
    public void display1()
    {
        System.out.println("Child class of Abc");
    }
}
public class SampleHierarchicalInh extends Abc
{
public void display2()
    {
        System.out.println("Child class of Abc");
    }    
}
