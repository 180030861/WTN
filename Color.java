import java.util.*;
public class Color 
{
	public static void main(String args[])
	{
		char a;
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		switch(a)
		{
		case 'R': System.out.println("Red");
		break;
		case 'B' : System.out.println("Blue");
		break;
		case 'O':System.out.println("Orange");
		break;
		case 'W':System.out.println("White");
		break;
		case 'G':System.out.println("Green");
		break;
		case 'Y':System.out.println("Yellow");
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
