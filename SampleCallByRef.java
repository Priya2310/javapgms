/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplecallbyval;

/**
 *
 * @author Student
 */
public class SampleCallByRef {
    
   public void min(int a[])
           
   {
       int min=a[0];
       for(int i=0;i<10;i++)
       {
           if(a[i]<min)
           {
               min=a[i];
           }
       }
       System.out.println("The minimum value in the array" + min);
   }
    
}
