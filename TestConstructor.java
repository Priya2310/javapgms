/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testcase;

import javapgms.Constructor;

/**
 *
 * @author Student
 */
public class TestConstructor 
{
public static void main(String args[])
{
    Constructor c = new Constructor();
    int a = c.i;
    char b = c.c;
    System.out.println(a);
    System.out.println(b);
}
}
