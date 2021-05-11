public class Patient 
{
	String pname;
	double weight;
	double height;
	double computeBMI()
	{
		return weight/Math.pow(height,2);
	}
	void setPname(String pname)
	{
		this.pname = pname;
	}
	String getPname()
	{
		return pname;
	}
	void setHeight(double height) 
	{
		this.height = height;
	}
	double getHeight()
	{
		return height;
	}
	void setWeight(double weight) 
	{
		this.weight = weight;
	}
	double getWeight()
	{
		return weight;
	}
	public static void main(String args[])
	{
		Patient p = new Patient();
		p.setPname("Sai");
		p.setHeight(5.8);
		p.setWeight(60);
		System.out.println(p.computeBMI());
	}
}
