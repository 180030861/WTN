public class Max 
{
	public static void main(String args[])
	{
		int[][] a = new int[3][3];
		int i =0,j=0,k=0,max=-56;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(k<9) a[i][j] = Integer.parseInt(args[k]);
				k++;
			}
			if(k < 9) System.out.println("Enter 9 values");
		}
		for(i =0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j] > max) max = a[i][j];
			}
		}
		System.out.println(max);
	}
}