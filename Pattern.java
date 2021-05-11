import java.util.*;
public class Pattern 
{
	public static void main(String args[])
	{
		int n ,j;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++)
		{
			j = i;
			while(j > 0)
			{
				System.out.print("*\t");
				j -= 1;
			}
			System.out.println("\n");
		}
	}
}
