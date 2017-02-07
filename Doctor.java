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
public class Doctor 
{
int regid1,regid2,ano1,ano2;
String name1,name2,time,hname,hname1,time1,dept;
public void getDetails()
    {
        regid1=104;
        name1="Abc";
        ano1=3142;
        hname="X";time="12PM to 4PM";
        regid2=201;
        name2="Xyz";
        ano2=6542;
        hname1="Y";time1="10AM to 6PM";
    }
}
class Pediatrician extends Doctor
{
  public void dis(int id)
    {
        dept="Pediatrician";
        System.out.println("Doctor details");
    
            if(regid1==id)
            {
                System.out.println("Reg id : " + regid1);
                System.out.println("Doctor name : " + name1);
                System.out.println("aadhar id : " + ano1);
                System.out.println("Specialization : " + dept);
                System.out.println("Hospital name : " + hname);
                System.out.println("Available timings : " + time);
            
            }
        }
}
class Neuro extends Doctor
{
    public void dis1(int id)
    {
        dept = "Neurologist";
        System.out.println("Doctor details");
        if(regid2==id)
            {
                System.out.println("Reg id : " + regid2);
                System.out.println("Doctor name : " + name2);
                System.out.println("aadhar id : " + ano2);
                System.out.println("Specializtion : " + dept);
                System.out.println("Hospital name : " + hname1);
                System.out.println("Available timings : " + time1);
            }
    }
}

    
