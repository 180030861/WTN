import java.util.*;
public class Palindrome 
{
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		String res ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res+= s.charAt(i);
		}
		if(s.equals(res)) System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
	}
}
