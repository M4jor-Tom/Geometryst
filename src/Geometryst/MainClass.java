package Geometryst;

public class MainClass
{
	public static void main(String[] args)
	{
		Point
			p = new Point(1, 2),
			p2 = new Point(1, 4);
		
		Circle c = new Circle(p, 3);
		
		Triangle t = new Triangle(
				new Point(15, 0),
				new Point(0, 2),
				new Point(0, -2)
		);
		
		System.out.println(p + " distance with " + p2 + ": " + p.distance(p2));
		
		System.out.println(c + " contains " + p2 + ": " + c.contains(p2));
		
		System.out.println(t + " is isoscele: " + t.isoscele());
	}
}