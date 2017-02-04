/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapgms;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class TaskProgram4 implements Hotel
{
     int id[] = new int[3];
     String name[]= new String[3];

    @Override
    public void add() 
    {
        System.out.println("Enter the id of item");
        Scanner s= new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            id[i]=s.nextInt();
            
        }
        System.out.println("Enter the name of item");
        for(int i=0;i<3;i++)
        {
            name[i]=s.nextLine();
        }
    }

    @Override
    public void edit() 
    {
    int a;
    System.out.println("Enter the id of item to be edited");
    Scanner s= new Scanner(System.in);
    a=s.nextInt();
    for(int i=0;i<3;i++)
    {
        if(id[i]==a)
        {
            System.out.println("Enter the name");
            Scanner sc= new Scanner(System.in);
            name[i]= sc.nextLine();
        }
    }
    }

    @Override
    public void delete() 
    {
        int a;
        System.out.println("Enter the id of item to be deleted");
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Item has been deleted");
       
    }

    @Override
    public void display() {
        for (int i=0;i<3;i++) {
            System.out.println(id[i] + "  " + name[i]);
        }
        
    }
    
}
