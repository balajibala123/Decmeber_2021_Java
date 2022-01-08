public class SuperMarket
{

	static String name = "bala";
	static int doorNo = 1234;
	int price, discount;
	String brand;

	//Special nature
	//Constructor should have the same name as the class name
	//constructor wont have any return type or void
	//Constructor will be called automatically
	//Constructor outside of main method, inside the class
	//Constructor is used for non-static field 
	
	public SuperMarket(int price, int discount, String brand ){  //naming conventions changed from i, j and s to price, discount, brand
		this.price = price;  // to differentiate non static variables and local variables this keyword is used in front of the non static variables
		this.discount = discount;
		this.brand = brand;
		
	}
	
	public SuperMarket(int price, String brand)
	{
		this.price = price; 
		this.brand = brand; 
	}
	public SuperMarket(String brand, int price)
	{
		this.price = price;
		this.brand = brand;
	}
	public SuperMarket()
	{
	System.out.println("Zero Arguments Constructor"); 	
	}

	
public static void main(String[] args){

	SuperMarket prod1 = new SuperMarket(100, 20, "ABCD");
	//prod1.price= 100;
	//prod1.discount = 20;
	//prod1.brand =  "ABCD";

	SuperMarket prod2 = new SuperMarket(200, 30, "BCD");
	//prod2.price = 200;
	//prod2.discount = 30;
	//prod2.brand = "BCD";
	
	SuperMarket prod3 = new SuperMarket(10, "PQR"); 
	SuperMarket prod4 = new SuperMarket("XYZ", 20);
	SuperMarket prod5 = new SuperMarket();

	prod1.buy(); // creating calling statement for prod1
	prod2.buy(); // creating calling statement for prod2
	prod4.buy();
	
	//SuperMarket prod3 = new SuperMarket(); 
	//prod3.buy();
	//System.out.println(prod1);
	//System.out.println(prod2);
	//System.out.println(prod3);
	

	
}
	//toString to print the object value memory location ID
	//public String toString()
	//{
	//	return "hi";
	//}
	
	public void buy(){
		System.out.println(price);
		System.out.println(discount);
		System.out.println(brand);
	}


}



// constructor need to go through and write a blog