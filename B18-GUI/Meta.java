// calling the interface in FB,Insta,Whatsapp.java files
public interface Meta
{
	// once we declare variable in interface it is said to be static and final value
	//
	int age = 18;

	// abstract method
	// if we declare method in interface, if we're not calling in our class then it will throw error
	// we need to declare the class as abstract
	public void login(); 
	public void signup();
	public void leave();
	
}