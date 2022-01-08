package chennai;
import hometown.Parent; //imported parent 

public class Yaro  // created a class called yaro and not extending parent
	// if you execute the program will get error
	
{

	public static void main(String[] args)
	{
		Parent parent = new Parent();
		parent.call();
		System.out.println(parent.name);
	}
	
}