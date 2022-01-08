package korea.south;  

public class Samsung  // parent class we're going to call in deskop class by extends keyword
{

	protected int pinNo = 1234;
	protected void changePin()
	{
		System.out.println("change pin");
	}
	private void research()
	{
		System.out.println("Research");	
	}
	public void makeQuality()  // creating a method in parent class, calling in child class
	{
		System.out.println("Samsung");
	}

	public void giveWarranty() // creating a method in parent class, calling in child class
	{
		System.out.println("warranty");
	}

}