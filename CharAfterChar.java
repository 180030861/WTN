import java.util.*;
public class CharAfterChar {
public static void main(String args[])
{
	String a ,b,res="";
	Scanner sc = new Scanner(System.in);
	a = sc.next();
	b= sc.next();
	for(int i=0;i<a.length();i++)
	{
		res+=a.charAt(i);
		for(int j=i;j<b.length();j++)
		{
			res+=b.charAt(j);
			break;
		}
	}
	System.out.println(res);
}
}
