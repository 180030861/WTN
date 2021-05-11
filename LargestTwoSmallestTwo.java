import java.util.*;
public class LargestTwoSmallestTwo 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i< n ;i++)
		{
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Smallest 2 Values "+a[0]+" "+a[1]);
		System.out.println("Largest 2 Values "+a[n-1]+" "+a[n-2]);
	}
}
