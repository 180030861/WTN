import java.util.*;
public class ShortConcat {
public static void main(String args[])
{
	String a ,b ;
	Scanner sc = new Scanner(System.in);
	a = sc.next();
	b=sc.next();
	if(a.length()>b.length()) System.out.println(b+a+b);
	else System.out.println(a+b+a);
}
}