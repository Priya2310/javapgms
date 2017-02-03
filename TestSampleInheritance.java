/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testcase;

import javapgms.SampleInheritance;

/**
 *
 * @author Student
 */
public class TestSampleInheritance extends SampleInheritance
{
    public int mult(int a, int b)
    {
        int c=a*b;
        System.out.println("Product of 2 nos " + c);
        return c;
    }
    public static void main(String args[])
    {
       TestSampleInheritance t = new TestSampleInheritance();
       t.add(5, 6);
       t.mult(6, 7);
       t.sub(12, 7);
    }
    
}
