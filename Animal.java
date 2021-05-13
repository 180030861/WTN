public class Animal 
{
	public void eat()
	{
		System.out.println("This is eat method in Animal class");
	}
	public void sleep()
	{
		System.out.println("This is sleep method in Animal class");
	}
}
class Bird extends Animal
{
	public void eat()
	{
		System.out.println("This is eat method in Bird class");
	}
	public void sleep()
	{
		System.out.println("This is sleep method in Bird class");
	}
	public void fly()
	{
		System.out.println("This is fly method in Bird class");
	}
	public static void main(String args[])
	{
		Animal a = new Animal();
		Animal b = new Bird();
		Bird b1 = new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b1.fly();
	}
}