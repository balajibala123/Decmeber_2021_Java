public class Laptop
{
	
static int price; // ref variable declaration
int price2; // nonstatic field
	
public static void main(String[] args)
{
Laptop mouse = new Laptop();
mouse.price2 = 300;  // object.nonstatic variable
Laptop keyboard = new Laptop();
keyboard.price2 = 1000; // object.nonstatic variable
	
Laptop.price = 40000; // classname.static variable
	
Laptop.on(); //static method
mouse.click(); // non-static / instance specific / object specific method
}
	
public void click(){ // non static method
	//Declaration body
	System.out.println("clicking using my mouse");	
}
	
public static void on(){  // static method
	//Declaration body
	System.out.println("ON my laptop");
}

} 


// https://www.youtube.com/watch?v=kRMarTrUzMY  -- html basics
// https://www.youtube.com/watch?v=2bXc2ASkx_Y  -- theoritical understanding of SQL