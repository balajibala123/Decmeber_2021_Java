public class Shop
{

static String name = "bala"; // class specific info static variables
static int doorNo = 5; // class specific info static variables

//int price1, price2, price3;
int price;	// object specific , non static variables
public static void main(String[] args)
{

	System.out.println("Welcome to " + Shop.name + " shopping world");  // for calling class specific object we need to call with Classname.static variables
	System.out.println("Door No " + Shop.doorNo);
Shop pencil = new Shop();
	//pencil.price1 = 5;
	pencil.price = 5;
Shop note = new Shop();
	//note.price2 = 10;
	note.price = 10;
Shop paper = new Shop();
	//paper.price3 = 2;
	paper.price = 2;
Shop pen = new Shop();
	//System.out.println(pencil.price);
	System.out.println("Class mate note " + note.price + " Rs");
	
}
	
}


// static and non-static data members
// How to speed up my system