//javac -d . Parent.java
//javac -d . Neighbour.java
//javac -d . Child.java
//java chennai.Child
package chennai; // creating package name chennai which is new one for child
import hometown.Parent;  // importing parent package name and class

public class Child extends Parent
{

	public static void main(String[] args)
	{
		Child child =new Child(); // creating child class object
		System.out.println(child.name); // calling protected variable from parent with the child class object
		child.call(); // calling protected method from parent with child class object 
		child.getSweets();// calling default method from differenet package getting error while compiling
	}

}


// single inheritance
// multilevel inheritance
// multiple inheritance  need to do task on above three