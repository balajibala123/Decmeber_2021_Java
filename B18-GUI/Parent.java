//javac -d . Parent.java
package hometown; // creating package called hometown

public class Parent
{
	protected String name = "baskar";  // creating protected variable
	public static void main(String[] args)
	{
		
	}
	
	protected void call()  // creating protected method
	{
		System.out.println("Hello " + name);	
	}
	
	void getSweets()
	{
		System.out.println("get sweets");	
	}
}