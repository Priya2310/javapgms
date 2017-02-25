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
public class SampleAutoboxing {

    public static void main(String[] args) 
    {
    int a=5;
    Integer x =a;
    System.out.println(x);
    int c=x.intValue();
    System.out.println(c);
    }
    
}
