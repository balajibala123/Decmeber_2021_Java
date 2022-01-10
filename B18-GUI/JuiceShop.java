package chennai;
public final class JuiceShop // declaring final class, so it can't inherit 
{
	//finalString name = "muruga"; 
	// if we declare final for a variable, we can reuse the variable in the same class 
	// we can use the variable in different class variable package with the same name 
	String name = "muruga";
	public static void main(String[] args)
	{
		JuiceShop js = new JuiceShop();
		// same method name with different arguments is called method overloading 
		// In same class is called as method overlodaing
		//js.prepareJuice(20); 
		//js.prepareJuice();
		//js.prepareJuice(false);
		js.register();
		js.name= "newton";
		System.out.println(js.name);
	}
	
	//public void prepareJuice(int sugar)
	//{
	//	System.out.println(sugar);
	//}
	
	//public void prepareJuice()
	//{
	//	System.out.println("without sugar");
	//}
	
	//public void prepareJuice(boolean milk)
	//{
	//	System.out.println("milk " + milk);	
	//}
	
	public final void register()   // can't override if we declare final
		//if we create the same method in the child class it'll not override
	{
		System.out.println("head branch registered");
	}
}


//method overriding 