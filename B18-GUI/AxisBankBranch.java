package com.bala.jan;

// we're using inhertiance calling main class with extends keyword
public class AxisBankBranch extends AxisBank {

	//public AxisBankBranch(){
	//	this.accountHolderName = accountHolderName;
	//	this.gender = gender;
	//}
	
	public static void main(String[] args){
		//Creating object for AxisBankBranch
		AxisBankBranch abranch1 = new AxisBankBranch();
		//abranch1.accountHolderName = "roy";
		//abranch1.gender = 'M';
		//System.out.println(accountHolderName);
		// we need to create a zero args constructor in AxisBank Class, then only we'll get output
		
		
		abranch1.bankAccountHolder("roy", 'm'); // calling statement we're passing arguments
		abranch1.bankName = "SBI";
		abranch1.bankDetails(); // calling statement for axisbank class method // calling with axisbankbranch object
		abranch1.bankName();  // calling statement for final static variable inside method
		
	
	}
	
	//same method in axisbank class and axisbankbranch class 
	// method overriding
	public void bankAccountHolder(String name, char gender){  
		System.out.println("*****printing from overriding*******");
		System.out.println(name + " " + gender);	
	}
	
	// we're trying to print static final variable from same package other class it'll not work
	public void bankName(){
		System.out.println("cheque: "+ bankName);
	}
	
	// ***********************************************
	// Can't override
	// error: bankDetails() in AxisBankBranch cannot override bankDetails() in AxisBank
	// ************************************************
	//void bankDetails(String bankName){
	//	System.out.println(bankName);	
	//}
	
	
	
}
