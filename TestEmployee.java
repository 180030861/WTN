public class TestEmployee 
{
	public static void main(String args[])
	{
		Person p = new Person("Ravi");
		Employee e1 = new Employee("Swati");
		e1.setAnsal(50000);
		e1.setYr(2);
		e1.setNin("Ab 12 34 48 C");
		System.out.println(e1.getAnsal()+" "+e1.getYr()+" "+e1.getNin());
	}
}
