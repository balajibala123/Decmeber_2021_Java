// getter setter methods

public class Library1
{

	private int annualFee = 10;
	
	public void lendBooks(){}
	
	public int getAnnualFee(){
		return this.annualFee;	
	}
	
	public void setAnnualFee(int Fee){
		if(Fee>10){
			this.annualFee = Fee;
		}
	}

}