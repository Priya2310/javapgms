/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplearray;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class SampleArrayClass {
    public void arrayfns()
    {
        char a[]={'g','w','j','s','r'};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int b = Arrays.binarySearch(a, 'g');
        System.out.println(b);
        char c[] = Arrays.copyOf(a, 8);
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        c[5]='d';
        c[6]='e';
        c[7]='a';
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    Arrays.fill(a, 'p');
    for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
