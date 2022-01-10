package chennai;

public class JuiceShop2 extends JuiceShop
{
	String name = "balaji";
	public static void main(String[] args)
	{
		JuiceShop2 js2 = new JuiceShop2();
		js2.register();
		System.out.println(js2.name);
	}

	public void register() // method overriding 
	// having same method name in juiceshop class, as well as in juiceshop2 class so it is called as
	//overriding
	//if child class has the same method then that method will be called
	{
		System.out.println("sub branch registered");
	}
}