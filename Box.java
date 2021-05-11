import java.util.*;
public class Box 
{
	public Box(int width ,int height, int depth)
	{
		int h,d,w;
		h = height;
		d = depth;
		w = width;
		double v =volume(h,d,w);
		System.out.println(v);
	}
	double volume(int h,int d,int w)
	{
		return h*d*w;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int d = sc.nextInt();
		int w = sc.nextInt();
		Box b = new Box(w,h,d);
	}
}