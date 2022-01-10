//child class for abstract classes

package chennai;

public class Childs extends Parents
{
	public static void main(String[] args)
	{
		Childs ch = new Childs();
		ch.grow();
		ch.study();
		//ch.chat();
		//ch.play();
		
		Parents pa = new Childs();
		pa.grow();
		pa.work();
	}
	
	public void work()
	{
		System.out.println("callig from child class working");
	}
	
	public void chat()
	{
		System.out.println("chatting with friends");
	}
	
	public void play()
	{
		System.out.println("playing with friends");
	}
	
	public void study()  //overriden method already present in parents class
	{
		System.out.println("I'm studying IT related");
	}
}