/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapgms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Student
 */
public class SampleMap {
    public void display()
    {
        Map<Integer,String> m= new HashMap<Integer,String>();
        m.put(23, "Priya");
        m.put(34, "Divya");
        m.put(25, "Madhan");
        m.put(14, "Vedh");
        m.put(5, "Tara");
        System.out.println(m.entrySet());
        boolean n = m.isEmpty();
        System.out.println(n);
        System.out.println(m.get(14));
        System.out.println(m.containsKey(23));
        System.out.println(m.containsValue("Tara"));
        m.remove(34);
        System.out.println(m);
    }
  
    
}
