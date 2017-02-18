package sourcecode;

public class ExHandling3 
{
public void get()
{
	String str = "Hi!Hello!!";
	try
	{
		char a = str.charAt(6);
		System.out.println(a);
		char c= str.charAt(30);
		System.out.println(c);
	}
	catch(StringIndexOutOfBoundsException s)
	{
		System.out.println("String Index out of bounds");
	}
}
}
