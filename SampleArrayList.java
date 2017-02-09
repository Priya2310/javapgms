/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapgms;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class SampleArrayList 
{
public void display()
{
    ArrayList<Integer> id = new ArrayList<Integer>();
    id.add(36);
    id.add(24);
    id.add(74);
    id.add(19);
    id.add(43);
    System.out.println("Array elements");
    for (Integer i : id) {
        System.out.println(i);
    }
    boolean a = id.contains(19);
    System.out.println(a);
    id.add(3, 62);
    System.out.println("Array elements");
     for (Integer i : id) {
        System.out.println(i);
    }
    boolean b = id.isEmpty();
     System.out.println(b);
     int c = id.indexOf(19);
     System.out.println(c);
     int d = id.get(3);
     System.out.println(d);
     id.remove(2);
     System.out.println("Array elements");
     for (Integer i : id) {
        System.out.println(i);
    }
}
}
