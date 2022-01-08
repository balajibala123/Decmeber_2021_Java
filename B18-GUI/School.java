public class School
{
	
	
public static void main(String[] args)
{
	//byte b = 130;  // bye we can give only upto 128
	//System.out.println(b); // while trying to print we'll get incompatible error
					   
	School st1 = new School(); // object memory can expand and shrink it is dynamic 
	School st2 = new School();
	st2.buySnacks(10); // calling statement// passing values as arguments
	// calling statement // passing objects as arguments// st2 is a object reference 
	// we need to pass School object inside the method takingAnswerSheet
	st1.takingAnswerSheet(st2);
}
	
	public void buySnacks(int cash){
		System.out.println("Buying snacks");
	}
	
	public void takingAnswerSheet(School student)
	{  // passing school object as argument in this method
		System.out.println("taking all answer sheet "+ student);
	}
	
	
}




// datatype is a container -- true
// class is a container
// datatype is a class
// class is datatype
// classes which we're creating, predefined classes are called as non-primitive datatypes

// primitive data type only 8 , basic, primary datatypes, fixed size, fixed Range
// byte, short, int, long
// float, double
// char, boolean

// Non-primitive datatype
// no fixed size and non fixed range, it'll vary 
// Non-primitive datatype is what we create is called class
// object can expand and shrink its memory so it is dynamic

