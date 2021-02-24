package Geometryst;

public class Triangle
{
	private Point _a, _b, _c;
	
	Triangle(Point a, Point b, Point c)
	{
		_a = a;
		_b = b;
		_c = c;
	}
	
	public boolean isoscele()
	{
		double
			ab = _a.distance(_b),
			bc = _b.distance(_c),
			ca = _c.distance(_a);
		
		if(
			ab == bc
			|| bc == ca
			|| ca == ab
		)
			return true;
		
		return false;
	}
	
	public String toString()
	{
		return "Triangle: a: " + _a + " b: " + _b + " c: " + _c;
	}
}