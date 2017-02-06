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
public class SampleStatic 
{
    static int deptid=205;
    public void displayDetails()
    {
        int id[]={1,2};
        String name[]={"abc","xyz"};
        for(int i=0;i<2;i++)
        {
            System.out.println(id[i] + " " + name[i] + " " + deptid);
        }
        
        
    }
    
}
