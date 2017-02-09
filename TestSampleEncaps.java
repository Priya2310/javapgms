/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testcase;

import javapgms.SampleEncaps;

/**
 *
 * @author Student
 */
public class TestSampleEncaps 
{
public static void main(String args[])
{
    SampleEncaps s = new SampleEncaps();
    s.setId(21);
    s.setName("abc");
    s.setYear(2017);
    System.out.println("Student Id : " + s.getId());
    System.out.println("Student Name : " + s.getName());
    System.out.println("Student Year :  " + s.getYear());
}
}
