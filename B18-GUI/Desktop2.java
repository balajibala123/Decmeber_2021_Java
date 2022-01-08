package india.south; // creating a new package called india.south
import korea.south.Samsung; // importing the korea.south.samsung class file 
// because we're calling in new package name

public class Desktop2 extends Samsung  // creating a child class called Desktop2
	// calling parent class samsung with extends keyword
{

	public static void main(String[] args){
	
	Desktop2 dt = new Desktop2();
	dt.makeQuality();  // calling parent class method in new package by importing korea.south.samsung class file
	// if we're not calling the import statement we'll get error 	
	dt.giveWarranty();
	dt.changePin();  // trying to call protected method from parent class, different package works
	System.out.println(dt.pinNo); // trying to call protected variable from parent class, different package it works
	}

}