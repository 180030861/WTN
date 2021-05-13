public class Employee extends Person 
{
	public Employee(String name) 
	{
		super(name);
		System.out.println(name);
	}
	double ansal;
	int yr;
	String nin;
	void setAnsal(double ansal)
	{
		this.ansal = ansal;
	}
	void setYr(int yr)
	{
		this.yr=yr;
	}
	void setNin(String nin)
	{
		this.nin =nin;
	}
	double getAnsal()
	{
		return ansal;
	}
	int getYr()
	{
		return yr;
	}
	String getNin()
	{
		return nin;
	}
}
