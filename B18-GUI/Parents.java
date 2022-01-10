// Abstract class

package chennai;

public abstract class Parents
{

	public static void main(String[] args)
	{
		// we can't create object in abstract class. it'll throw an error
		// when we try to call abstract method it'll not work
		// so that is the reason we can't create object
		// Parents pa = new Parents();
		
		
	}
	
	public void grow()
	{
		System.out.println("good environment");
	}
	public void study()
	{
		System.out.println("law");
	}
	public abstract void work();  // abstract method so we need to call the class as abstract
	
}
