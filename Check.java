public class Check
{
	public static void main(String args[])
	{
		char a = 'b';
		if(Character.isDigit(a)) System.out.println("Digit");
		else if(Character.isLetter(a)) System.out.println("Alphabet");
		else System.out.println("Special Symbol");
	}
}