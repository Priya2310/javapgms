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
public class Audi 
{
int noOfSeats,speed;
float mileage,cc;
String colour,cost;
public void compare()
{
    String x="A3";
    String b="Q3";
    ModelA3 a = new ModelA3();
    a.getdetails();
    ModelQ3 q = new ModelQ3();
    q.getdetails();
    if(a.noOfSeats<q.noOfSeats)
    {
        System.out.println("Audi Q3 accomodates more no of people");
        x="Q3";
    }
    if(a.mileage>q.mileage && a.speed>q.speed)
    {
        System.out.println("A3 provides better performance than Q3");
        b="A3";
    }
    System.out.println("In case of performance " + b + " is better");
    System.out.println("But " + x + " is much suitable for family use");
}
}
class ModelA3 extends Audi
{
    public void getdetails()
    {
        noOfSeats = 4;
        speed = 200;
        cost = "1.6CR";
        mileage = 120;
        colour = "Black";
    }
}
class ModelQ3 extends Audi
{
   public void getdetails()
    {
        noOfSeats = 8;
        speed = 180;
        cost = "2.1CR";
        mileage = 100;
        colour = "Silver";
    } 
}

