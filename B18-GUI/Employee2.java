package tamilnadu.madurai; // created a package name called madurai
import tamilnadu.chennai.Office; // importing package and class name

public class Employee2  // created a class called Employee2 // canonical
{

	// javac -d . Employee2.java  // java tamilnadu.madurai.Employee2
	public static void main(String[] args)
	{
	Employee2 emp = new Employee2(); // created a object for employee2
	emp.wfh(); // created a calling method wfh
	
	Office off = new Office();  // calling office class and creating a object for it
	//System.out.println(off.travel); // printing office class non static variable
	//off.provideSnacks();
	off.provideSalary();

	}
	
	public void wfh()  // creating method and defintion inside
	{
		System.out.println("Connected through online");
	}
}


// when constructor is said to be private it follows singleton class, 
// when we've created a object in other class it'll not work if we've private constructor