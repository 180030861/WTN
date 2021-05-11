import java.util.Scanner;

public class Prime 
{
	public static void main(String args[])
	{
		int  n , ctr =0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 2 ; i <= n-1 ;i++)
		{
			if(n % i == 0) ctr += 1;
		}
		if(ctr == 0) System.out.println("Prime");
		else System.out.println("Not Prime");
	}
}
