package korea.south;

// we're using extends when we use parent class
// child class is calling parent class so we're using extend keyword
public class Desktop extends Samsung  //samsung is the parent class
{

	public static void main(String[] args)
	{
		Desktop dt = new Desktop();
		dt.makeQuality(); // we're calling parent class method with the help of child class object creation
		dt.giveWarranty();
		//dt.research(); // trying to call parent class private method and getting error
		//if we try to call private variable from parent we'll get error
		dt.changePin(); // trying to call protected method from parent class
		System.out.println(dt.pinNo); // trying to call protected variable from parent 
	}
	
}