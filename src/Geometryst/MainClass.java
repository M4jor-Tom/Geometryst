package Geometryst;

public class MainClass
{
	public static void main(String[] args)
	{
		Point p = new Point(1, 2);
		
		Circle c = new Circle(p, 3);
		
		Triangle t = new Triangle(
				new Point(15, 0),
				new Point(0, 2),
				new Point(0, -2)
		);
		
		System.out.println(p);
		
		System.out.println(c);
		
		System.out.println(t + " is isoscele: " + t.isoscele());
	}
}