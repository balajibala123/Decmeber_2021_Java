package chennai;
import us.CTS;

public class CTSC extends CTS
{
	public String head;
	public CTSC(){ // constructor with arguments
		super();
		this(500);
		
		System.out.println("CTSC constructor");
	}

	public CTSC(int i){  // constructor with arguments
		
		super(i); // calling constructor explictily
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		CTSC emp = new CTSC(); //constructor without loading 
		//CTSC emp = new CTSC(5); //constructor with overloading
		//emp.head= "PQRS";
		//emp.recruit();
	}
	
	public void recruit()
	{
		
		System.out.println(super.head);
		System.out.println(head);
		super.recruit();
	}
}