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
public class Foreach {
    public void add()
    {
        int a[][]={{2,1},{6,4}};
        int b[][]={{5,4},{7,3}};
        int c[][]= new int[2][2];
        System.out.println("Sum of arrays");
        for(int i=0;i<2;i++) {
           for(int j=0;j<2;j++) {
            c[i][j]=a[i][j]+b[i][j];
           }
        }
        for (int[] i : c)  {
            for (int j : i) {
            System.out.println(j);
           }
       }
    
    }
    
}
