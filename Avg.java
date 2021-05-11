public class Avg 
{
	public static void main(String args[])
	{
		int a[] = {5,8,7,6,4,1};
		int sum = 0;
		double avg = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			sum += a[i];
		}
		avg = sum/(a.length);
		System.out.println(avg);
	}
}
