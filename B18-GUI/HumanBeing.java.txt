public class HumanBeing
{
	
	int amount;
	
	public static void main(String[] args){
	
		// when we try to print this.amount it'll not work in main method it is due to static method
		// static method we can't use this keyword
		// System.out.println(this.amount);
		
		HumanBeing hb = new HumanBeing();
		hb.amount= 10000;  //local variable inside main method where hb is a object 
		//hb.getVeg(200);
		System.out.println("hb amount " +hb.amount); // printing local variable we'll get 10000
		
		HumanBeing hb2 = new HumanBeing();
		hb2.amount = 200000;  //local variable inside main method where hb2 is a object
		hb2.getVeg(200);   // calling statement // passing arguments 200 as int
	}
	
	public void getVeg(int amount){
		System.out.println("local amount " + amount);
		//System.out.println(this.amount); // it'll check the hb.amount value with the help of this keyword
		System.out.println("global amount " +this.amount); // it'll check the hb2.amount
	}
	
//	public static void paint(){   // using this keyword we can't use it in static method
		// this keyword is only used for non static method
		// if we try to execute the method paint we'll get error 
		
//		System.out.println(this.amount);
//	}
	
}