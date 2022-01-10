package chennai;
import hometown.Parent; //imported parent 

public class Yaro  // created a class called yaro and not extending parent
	// if you execute the program will get error
	
{

	public static void main(String[] args)
	{
		Parent parent = new Parent();
		parent.call();
		System.out.println(parent.name);
	}
	
}



//…or create a new repository on the command line
//echo "# B18" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/balajibala123/B18.git
//git push -u origin main
//…or push an existing repository from the command line
//git remote add origin https://github.com/balajibala123/B18.git
//git branch -M main
//git push -u origin main