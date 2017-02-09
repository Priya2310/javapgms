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
public class SampleEncaps 
{
private int sid;
private String sname;
private int syear;
public int getId()
{
    return sid;
}
public void setId(int sid)
{
    this.sid=sid;
}
public String getName()
{
    return sname;
}
public int getYear()
{
    return syear;
}
public void setName(String sname)
{
    this.sname=sname;
}
public void setYear(int syear)
{
    this.syear=syear;
}
}
