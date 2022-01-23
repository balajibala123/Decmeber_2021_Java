// getter setter methods
public class Member
{
	
	public static void main(String[] args){
	
		Library1 lb1 = new Library1();
		int fee = lb1.getAnnualFee();
		
		System.out.println(fee);
		
		// private varaible we'll get error while compiling
		//System.out.println(lb1.annualFee);
		lb1.lendBooks();
		
		lb1.setAnnualFee(50);
	}
	
}