// interface extends parent interface
//calling child interface in this program
//child interface is INorg

public class Employ implements INOrg
{

	public static void main(String[] args)
	{
	
	}
	
	public void serveNP(){}
	// if we comment below method it'll throw error because we're creating below method in child interface
	// we need to call this one otherwise it'll throw error
	// public void kt(){}
}