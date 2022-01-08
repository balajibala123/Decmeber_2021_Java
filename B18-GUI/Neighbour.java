//javac -d Neighbour.java
//java hometown.Neighbour
package hometown;  // creating inside hometown package

public class Neighbour  
{
	
	public static void main(String[] args)
	{
		Parent pt = new Parent(); // creating parent class object
		pt.call(); // calling protected method from parent class
		System.out.println(pt.name); // calling protected variable from parent class
		pt.getSweets(); // calling default method same package name different class it works
	}
	
}


// parent  /base //superclass
// child / derived /sub class