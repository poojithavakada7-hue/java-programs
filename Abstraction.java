<<<<<<< HEAD
abstract class Shape
{
	abstract double CalculateArea();
}
class Circle extends Shape
{
	double radious;
	Circle (double r)
	{
		radious = r;
	}
	double CalculateArea()
	{
		return 3.14*radious*radious;
	}
}
class Rectangle extends Shape
{
	double length;
	double width;
	Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	double CalculateArea()
	{
		return length*width;
	}
}
class Abstraction
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(5);
		Rectangle R1 = new Rectangle(4,8);
		System.out.println("Area of circle :"+c1.CalculateArea());
		System.out.println("Area of Rectangle :"+R1.CalculateArea());

	}
=======
abstract class Shape
{
	abstract double CalculateArea();
}
class Circle extends Shape
{
	double radious;
	Circle (double r)
	{
		radious = r;
	}
	double CalculateArea()
	{
		return 3.14*radious*radious;
	}
}
class Rectangle extends Shape
{
	double length;
	double width;
	Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	double CalculateArea()
	{
		return length*width;
	}
}
class Abstraction
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(5);
		Rectangle R1 = new Rectangle(4,8);
		System.out.println("Area of circle :"+c1.CalculateArea());
		System.out.println("Area of Rectangle :"+R1.CalculateArea());

	}
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}