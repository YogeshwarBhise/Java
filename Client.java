import Fabulous.Marvellous;
import Fabulous.Infosystems;

class Client
{
	public static void main(String args[])
	{
		System.out.println("Inside Main Functon of Client");
		Marvellous mobj = new Marvellous();
		Infosystems iobj = new Infosystems();
		
		mobj.fun();
		iobj.gun();
	}
}