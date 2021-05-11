public class Reverse2D 
{
	public static void main(String args[])
	{
		int[][] a = new int[2][2];
		int i=0,j=0,k=0;
		for(i =0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				if(k <4 ) a[i][j]= Integer.parseInt(args[k]);
				k++;
			}
		}
		for(i=1;i>=0;i--)
			{
			for(j=1;j>=0;j--)
				System.out.print(a[i][j]+" ");
			System.out.println(" ");
			}
	}
}
