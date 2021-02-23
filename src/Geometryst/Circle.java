package Geometryst;

public class Circle
{
	private Point _center;
	private double _radius;
	
	Circle(Point center, double radius)
	{
		_center = new Point(center);
		_radius = radius;
	}
	
	public String toString()
	{
		return "Circle: center: " + _center + " radius: " + _radius;
	}
	
	public boolean contains(Point toTest)
	{
		return _center.distance(toTest) < _radius;
	}
}