// dynamic binding
public class FEmployee implements Factory
{


	public static void main(String[] args){
		FEmployee fe = new FEmployee();
		fe.sign();
		fe.work();
		fe.listenSongs();
		
		Factory manager = new FEmployee();
		manager.sign();
		manager.work();
	}
	
	public void sign(){}
	public void work(){}
	public void listenSongs(){}
	
}


