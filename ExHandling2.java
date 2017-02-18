package sourcecode;

public class ExHandling2 
{
public void getvalue()
{
	int arr[]={10,20,31,45,36};
	try
	{
		System.out.println("The element value is" + arr[6]);
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("Array out of bounds" + a.getMessage());
	}
}

/*public void getvalue1() {
	System.out.println("Hi");
	
}*/
}
