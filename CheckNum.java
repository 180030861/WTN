import java.util.*;
public class CheckNum
{
	public static void main(String args[])
	{
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n > 0) System.out.println("Positive");
		if(n == 0) System.out.println("Zero");
		if(n < 0) System.out.println("Negative");
	}
}
