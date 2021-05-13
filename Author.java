public class Author 
{
	String name;
	String mail;
	char gen;
	public Author(String name, String mail, char gen)
	{
		this.name = name;
		this.mail=mail;
		this.gen = gen;
	}
}
class Book
{
	String name;
	String author;
	double price;
	String aname;
	int qty;
	public Book(String name,String aname, double price,int qty)
	{
		System.out.println("Name: "+name+" Author name: "+aname+" Price: "+price+" Quantity: "+qty);
	}
	void setName(String name) 
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setPrice(double price)
	{
		this.price = price;
	}
	double getPrice()
	{
		return price;
	}
	void setQty(int qty)
	{
		this.qty = qty;
	}
	int getQty()
	{
		return qty;
	}
	public static void main(String args[])
	{
		Author a = new Author("Ajay","ajay@gmail.com",'M');
		System.out.println(a.name+" "+ a.mail+" "+a.gen);
		Book b = new Book("You are the best wife",a.name,140,1);
	}
}