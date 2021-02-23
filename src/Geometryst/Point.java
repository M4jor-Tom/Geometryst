package Geometryst;
import java.lang.Math; 

public class Point
{
	private double _x, _y;
	
	Point(Point toCopy)
	{
		_x = toCopy._x;
		_y = toCopy._y;
	}
	
	Point(double x, double y)
	{
		_x = x;
		_y = y;
	}
	
	public double getX()
	{
		return _x;
	}
	
	public double getY()
	{
		return _y;
	}
	
	public double distance(Point otherPoint)
	{
		return Math.sqrt(
				Math.pow(
					_x - otherPoint.getX(),
					2
				)
				+ Math.pow(
					_y - otherPoint.getY(),
					2
				)
			);
	}
	
	public String toString()
	{
		return "Point: x: " + _x + " y: " + _y;
	}
}