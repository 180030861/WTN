import java.util.*;
public class RemoveChar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String sub="";
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				sub = s.substring(i-1,i+2);
			}
		}
		System.out.println(s.replace(sub, ""));
	}
}