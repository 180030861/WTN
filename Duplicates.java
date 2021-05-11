public class Duplicates 
{
	public static void main(String args[])
	{
		int[] a = {12,34,12,45,67,89};
		for(int i =0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i] == a[j]) a[i]=0;
			}
		}
		for(int i=0;i<a.length;i++) System.out.println(a[i]);
	}
}
