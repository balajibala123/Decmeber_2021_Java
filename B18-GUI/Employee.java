package tamilnadu.chennai;


public class Employee
{

	public static void main(String[] args)
	{
	Office off = new Office();  // calling office class and creating a object for it
	System.out.println(off.travel); // printing office class non static variable
	off.provideSnacks(); // printing office class method
	
	}

}
