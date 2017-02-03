/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCallByVal;

import samplecallbyval.SampleNoArgCons;

/**
 *
 * @author Student
 */
public class TestSampleNoArgCons 
{
public static void main(String args[])
    {
        SampleNoArgCons s= new SampleNoArgCons();
        int b = s.i;
        String c = s.x;
        System.out.println(b);
        System.out.println(c);
    }    
}
