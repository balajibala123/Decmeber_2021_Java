// multiple inheritance with use case of interface
class AbcBike extends Bikes implements Mahindra, Hero 
{

	public static void main(String[] args)
	{
		
	}
	//we're defining buildBody and focusMileage from interface so we're using the implements
	public void buildBody(){}
	public void focusMileage(){}
	// we're defining design from parent class bikes
	public void design(){}
	
}
