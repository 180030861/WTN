public class Calculator 
{
	public static int powerInt(int n1,int n2)
	{
		return (int)Math.pow(n2,n1);
	}
	public static double powerDouble(double n1,double n2)
	{
		return Math.pow(n2, n1);
	}
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		System.out.println(c.powerInt(5, 10));
		System.out.println(c.powerDouble(3, 12));
	}
}
