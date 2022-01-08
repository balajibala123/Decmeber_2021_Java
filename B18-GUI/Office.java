// package name 
// if we create package like this we'll have two folders inside
// one folder is tamilnadu // sub folder is chennai
package tamilnadu.chennai;  



public class Office
// trying to compile without public and need to check the employee2 class which is other package
// first compile javac -d . Office.java
// Second compile javac -d . Employee2.java
// we'll get error like Office is not public error
// class Office // default access for class -- we can call inside the same package, not in different package
{

	int travel = 100;  // default access -- package level access -- we can't call in other package
	
	public static void main(String[] args)
	{
		Office oa = new Office();
		oa.provideSnacks();
		//System.out.println("hi");
		System.out.println(oa.travel);
	}
	
	void provideSnacks() // default access -- package level access  --we can't call in other package
	{
		System.out.println("snacks");	
	}
	
	public void provideSalary()
	{
		System.out.println("salary credited");	
	}
	
	
	

}



// compiling package
// bala@bala-Vostro-3491:~/Documents/B18-GUI$ javac -d . Office.java

// Trying to run with the usual way, we're getting err for the package
// bala@bala-Vostro-3491:~/Documents/B18-GUI$ java Office
// Error: Could not find or load main class Office
// Caused by: java.lang.ClassNotFoundException: Office
// bala@bala-Vostro-3491:~/Documents/B18-GUI$ 

// while try to run the package use the below command to do so
// bala@bala-Vostro-3491:~/Documents/B18-GUI$ java tamilnadu.chennai.Office 
// hi
// bala@bala-Vostro-3491:~/Documents/B18-GUI$ 

