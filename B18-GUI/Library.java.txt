public class Library  
//private class Library  // class private is against code reusabilty// so we can't used private class
{
	private int salary = 10000;  // creating private variables
	public int mFee = 10; // will call in reader class
	
	public void lendBooks()  // will call in reader class by creating a object
	{
		System.out.println("Lending books");	
	}
	
	private void getSalary()   // creating private method
	{
		System.out.println(salary);	
	}
	
	
	public static void main(String[] args)
	{
		Library librarian = new Library();
		librarian.getSalary();
		System.out.println(librarian.salary);
	}
	
}


// private constructor to be discussed

// what is encapsulation
// private 
// code reusability
// packages 

//encapsulation -- binding data

// access modifiers
// private
// default
// protected
// public