import java.lang.*;
public class Five 
{
	public static void main(String args[])		
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			System.out.println((int)(Math.pow(2,i)*Math.pow(3,i)*Math.pow(5,i)));
		}
	}
}