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

public class SampleOverride 
{
int roi=5;
}
class Axis extends SampleOverride
{
    public void calcFD()
    {
        int rate= roi*7;
        System.out.println("The rate for FD is" + rate);
    }
}
class Icici extends SampleOverride
{
    public void calcFD()
    {
        int rate= roi*5;
        System.out.println("The rate for FD is" + rate);
    }
    
}
