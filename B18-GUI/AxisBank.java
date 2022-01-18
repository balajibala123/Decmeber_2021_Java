package com.bala.jan;

// **********************************************
// when we set final to a class we can't make a call to same package other class 
// error: cannot inherit from final AxisBank public class AxisBankBranch extends AxisBank 
// **********************************************
//public final class AxisBank{
public class AxisBank{

	int balance = 2000;
	
	//assigning bankname, address, doorno as static
	// *******************************
	// declaring final for variable 
	// if we assign a different value in our calling statement it'll work in same class ab.bankDetails("SBI");
	// if we declare final it can't be called in other class by assigning a different value 
	// if we assign different value it'll not work
	// **************************************************
	//static final String bankName = "AXIS"; 
	static String bankName = "AXIS";
	static String bankAddress = "vellore main branch near raja theatre";
	static int doorNo = 23;
	
	//account holdername and gender we're using here without passing values
	String accountHolderName;
	char gender;
	
	// ****************************************
	// constructor with multiple args is called as constructor overloading
	// also having different data types in it
	// also we can have data types orders changed
	// ****************************************
	//creating constructor with two arguments
	public AxisBank(String accountHolderName, char gender){
		this.accountHolderName = accountHolderName;
		this.gender = gender;
	}
	
	//Creating constructor with data types changed
	//calling gender first and account holder name second
	public AxisBank(char gender, String accountHolderName){
		this.gender = gender;
		this.accountHolderName = accountHolderName;
	}
	
	// creating constructor with single arguments
	public AxisBank(char gender){
		this.gender=gender;
	}
	
	// creating xonstructor with zero args or default
	public AxisBank(){
		
	}
	
	public static void main(String[] args)
	{	
		//creating object for AxisBank 
		//object for 2 args constructor

		AxisBank ab = new AxisBank("Kumar", 'M');
		ab.bankDetails();
//		ab.bankDetails("SBI");  // changing the static final value here in calling statement will works
		//creating value for accountHolderName in static method and calling it in bankAccountHolder method
		//ab.accountHolderName = "bala";
		System.out.println("********Constructor overloading******");
		ab.bankAccountHolder();
		
		// object for single argument constructor
		AxisBank ab1 = new AxisBank('F');
		ab1.bankAccountHolderGender();
		
		// creating object for constructor
		AxisBank abConstructor = new AxisBank('M', "dina");
		abConstructor.bankAccountHolderTypeChange();
		
		System.out.println("******there is no constructor overriding**********");
		
		AxisBank abargs = new AxisBank();
		// calling statement with args 
		abargs.bankAccountHolder("peter", 'M');


	}
	
	// creating a method to get bankDetails here we've called static fields with class name 
	// not called using objects
	// *************************************
	// Final Method 
	// when we set final to a method, it can't be accessed from same package other class
	// *************************************
	//	final void bankDetails(){
	public void bankDetails(){
		System.out.println("Bank Name: " + AxisBank.bankName);
		System.out.println("Bank Address: " + AxisBank.bankAddress);
		System.out.println("Bank Door No: " + AxisBank.doorNo);
	}
	
	// static final will work in same class method we can call, but different call it'll not work
	// we'll get error
	public void bankDetails(String bankName){
		System.out.println("*********static final in same class changing the bankname from axis to sbi*******");
		System.out.println(bankName);
	}
	
	
	// we're defining the account holder name and gender
	public void bankAccountHolder(){
		//System.out.println(accountHolderName);
		System.out.println("mulitple args constructor");
		System.out.println(accountHolderName);
		System.out.println(gender);
	}
	
	// we're defining for method with args
	// method with same name as above, but with parameters

	public void bankAccountHolder(String name, char gender){
		System.out.println("*********method overloading**************");
		System.out.println(name + gender);	
	}
	
	//we're defining for the accountholder gender
	public void bankAccountHolderGender(){
		System.out.println("printed from single arg constructor ");
		System.out.println(gender);	
	}
	
	// we're defining for gender and account holder name with datatypes changed
	public void bankAccountHolderTypeChange(){
		System.out.println("printing from data types order changed constructor");
		System.out.println(gender);
		System.out.println(accountHolderName);
	}
	
	
	
	

	
}

