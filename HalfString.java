import java.util.*;
public class HalfString 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()%2==0) System.out.println(s.substring(0, s.length()/2));
		else System.out.printf("null");
	}
}
