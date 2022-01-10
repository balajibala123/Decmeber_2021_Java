package us;

public class CTS
{
	public String head;
	public CTS(){ // constructor without arguments
		System.out.println("CTS constructor");	
	}
	
	public CTS(int i){
		System.out.println("parent class constructor "+ i);
	}
	
	public static void main(String[] args)
	{
		CTS emp =new CTS();
		emp.head= "ABCB";
		System.out.println(emp.head);
	}
	
	public void recruit() // public method in CTS and CTSC class so we need to use Super keyword 
	{
		System.out.println("us recruitment");	
	}
	
}