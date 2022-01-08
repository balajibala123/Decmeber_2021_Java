public class Reader
{
	
	public static void main(String[] args)
	{
		Library librarian = new Library();	// creating object for Library class
		librarian.lendBooks();  // calling Library class method which is lendbooks
		System.out.println(librarian.mFee); // printing Library class nonstatic variable
		
		librarian.getSalary();
		System.out.println(librarian.salary);
	}
	
}