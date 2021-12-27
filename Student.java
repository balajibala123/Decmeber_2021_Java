public class Student
{
	static int standard = 5; //global variables/ static member
	int mark1, mark2;  // global variables /non static member / field 
	
public static void main(String[] args)
{
	Student s1 = new Student();  // creating object for class
	s1.calculateTotal();  // method calling statement
	System.out.println(Student.standard);  // calling static variable using the class name


}
	
	public calculateTotal() // non static method
	{
		// delcaration body
		int m1 = 90, m2 =100;  // local variables/ method local variables
		int result = m1 + m2 ;
		System.out.println(result);
	}

}


// https://www.thoughtco.com/error-message-cannot-find-symbol-2034060  -- to check the errors in java
// field, variables, local variables and global variables