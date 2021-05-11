import java.util.*;
public class ConditionalSum
{
	public static void main(String args[])
	{
		int n,six=0,sum=0,sev=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n ;i++)
		{
			a[i]= sc.nextInt();
		}
		for(int i=0;i<n ;i++)
		{
			if(six == 0 && sev ==0)
			{
				if(a[i]==6) six =1;
				else sum += a[i];
			}
			else if(six == 0 || sev == 0) 
				{
				if(a[i] == 7) sev = 1;
				}
			else sum += a[i];
		}
		System.out.println(sum);
	}
}