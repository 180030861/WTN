public class Cmd
{
	public static void main(String args[])
	{
		if(args.length == 0) 
		{
			System.out.println("No Values");
			System.exit(0);
		}
		else System.out.println(args[0]);
	}
}