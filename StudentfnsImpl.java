/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplearray;

/**
 *
 * @author Student
 */
public class StudentfnsImpl implements Studentfns
{

    @Override
    public void add(String name,int year) 
    {
     if(year==2017)
     {
         System.out.println("Student" + name +" added to first year");
     }
    }

    @Override
    public void edit(int year) 
    {
    if(year==2016)
    {
        System.out.println("Student moved to 2nd year");
    }
    }
    
}
