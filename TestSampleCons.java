/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCallByVal;

import samplecallbyval.SampleCons;

/**
 *
 * @author Student
 */
public class TestSampleCons {
    public static void main(String args[])
    {
        SampleCons s= new SampleCons();
        int b = s.i;
        String c = s.a;
        System.out.println(b);
        System.out.println(c);
    }
}
