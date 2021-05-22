import java.util.Scanner;
public class Ncopies {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int l = str.length();
		String res="";
		for(int i = 0 ; i<l;i++)
		{
			res+=str.substring(0,2);
		}
		System.out.println(res);
	}
}