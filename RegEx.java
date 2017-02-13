/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapgms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
public class RegEx 
{
public void display()
{
    String str="Hi I am from chennai";
    String s = "jkyghnbjkntjk";
    Pattern p = Pattern.compile("chennai");
    Matcher m = p.matcher(str);
    if(m.find())
    {
     System.out.println("Found");
    }
    else
    {
        System.out.println("Not Found");
    }
    Pattern p1 = Pattern.compile("jk");
    Matcher m1= p1.matcher(s);
    while(m1.find())
    {
        System.out.println(m1.start());
        System.out.println(m1.end());
        System.out.println(m1.group());
    }
    String s1="Hello",s2="484",s3="  ";
    String x = ".*";
    System.out.println(s1.matches(x));
    System.out.println(s3.matches(x));
    String a = "er74hba8e7bvj79ffbr3";
    System.out.println(a.replaceAll("\\D", ""));
    String b = "Apple      Microsoft     IBM";
    System.out.println(b.replaceAll("\\s", ""));
    //System.out.println(a.replaceAll("\\^[0-9]", ""));
}
}
