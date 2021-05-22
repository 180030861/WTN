import java.util.*;
public class LastnN {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String res="";
	String s = sc.next();
	int n = sc.nextInt();
	for(int i=0;i<n ;i++)
		res += s.substring(s.length()-n);
	System.out.println(res);
}
}
