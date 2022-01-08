public class GroceryShop{
	static String name = "balaji";
	static int doorNo = 9999;
	
public static void main(String[] args)
{

	GroceryShop gs = new GroceryShop();
	float buybalance=gs.buy(100);
	System.out.println("this is from buy method "+ buybalance);
	
	gs.comeback(buybalance,name,doorNo);
	
}
	
	
	public float buy(int no1){
		//System.out.println(i/2);
		float result = no1/2;
		return result;
	}
	
	public void comeback(float no1, String name1, int doorNo1){
		System.out.println("Shop name:" + name1 + " Shop Number " + doorNo1);
	    System.out.println("buybalance divide by 2: " + no1 );
		
	}

}
	
	
	
	
