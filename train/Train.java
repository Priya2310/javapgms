/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

/**
 *
 * @author Student
 */
public class Train 
{
private int tid;
private String tname,source,dest;
private float fare;

public int getId()
{
    return tid;
}
public void setId(int tid)
{
    this.tid=tid;
}
public String getName()
{
    return tname;
}
public void setName(String tname)
{
    this.tname=tname;
}
public String getSource()
{
    return source;
}
public void setSource(String source)
{
    this.source=source;
}
public String getDest()
{
    return dest;
}
public void setDest(String dest)
{
    this.dest=dest;
}
public float setFare()
{
    return fare;
}
public void setFare(float fare)
{
    this.fare=fare;
}

    @Override
    public String toString() {
        return "Train{" + "tid=" + tid + ", tname=" + tname + ", source=" + source + ", dest=" + dest + ", fare=" + fare + '}';
    }


}
