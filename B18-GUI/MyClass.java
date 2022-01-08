public class MyClass
{

public static void sample(){  //static method
	System.out.println("Hello");
}

public static void main(String[] args)
{
	MyClass.sample();
	//below line not working need to check
	//System.out.println("Welcome to my class " + MyClass.sample); // invoking static method using the class name
}
}