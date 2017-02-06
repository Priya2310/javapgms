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
public class SampleWrapperCls 
{
 public void display()
 {
     int a=10;
     int b=5;
     Integer x= a;      //Autoboxing
     Integer y = Integer.valueOf(b);   //Autoboxing
     System.out.println(x);
     System.out.println(y);
     int c= x.intValue();          //Unboxing
     System.out.println(c);
 }
}
