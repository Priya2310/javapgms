/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapgms;

import java.util.HashSet;

/**
 *
 * @author Student
 */
public class SampleHashSet 
{
public void dis()
{
    HashSet h = new HashSet();
    h.add(5);
    h.add(16);
    h.add(47);
    h.add(67);
    h.add(29);
    System.out.println("Set elements :");
    for (Object i : h) {
        System.out.println(i);
    }
    boolean a = h.contains(14);
    System.out.println(a);
    int size = h.size();
    System.out.println("Size of set : " + size);
    boolean b = h.isEmpty();
    System.out.println(b);
    h.remove(47);
    System.out.println("Set elements :");
    for (Object i : h) {
        System.out.println(i);
    }

}
}
