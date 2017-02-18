package sourcecode;

public class ExHandling1 
{
public void display()
{
	try
	{
		int a=20,b=0;
		int res = a/b;
		System.out.println(res);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae.getMessage());
	}
}
}
