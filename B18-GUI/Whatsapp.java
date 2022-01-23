public class Whatsapp implements Meta
{
	//methods from this class
	public void share(){}
	public void like(){}

	//methods from interface we need to declare here
	public void login(){}
	public void signup(){}
	public void leave(){}

	public static void main(String[] args){
		System.out.println(Meta.age);
		System.out.println(Whatsapp.age);
		
		// we can't change the value if we provide that in interface because it is static and final
		//Meta.age=15;
	}

}