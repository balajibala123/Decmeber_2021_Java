public class Calculator 
{

public static void main(String[] args) 
{

	Calculator cal = new Calculator();
	float output= cal.add();
//	System.out.println(output);
//	cal.add();
//	System.out.println(cal.add());
	float outputsub = cal.subract(output,5);
	//System.out.println(cal.subract(output, 5)); // method - arguments
	System.out.println(outputsub);
}

	public float add(){
		int i=10;
		float j=20;
		float result = i+j;
		//System.out.println(result);
		return result;
		
	}
	//when we can convert float to int we'll get incompatible error
	// we can convert int to float it'll get changed no issues
	public float subract(float i, int j){  // float & int data type in my argument declared using my calling statement data types as declared in line 13
		//System.out.println(i);
		//System.out.println(j);
		float result = i -j;
		//System.out.println(result);
		return result;
	}
}


// void , return assignment