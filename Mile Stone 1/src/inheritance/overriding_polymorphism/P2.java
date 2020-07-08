package inheritance.overriding_polymorphism;
class Shape
{
	void draw() {};
	void erase() {};
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw Circle");
	}
	void erase()
	{
		System.out.println("Erase Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Draw Triangle");
	}
	void erase()
	{
		System.out.println("Erase Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Draw Square");
	}
	void erase()
	{
		System.out.println("Erase Square");
	}
	
}
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle();
		c.draw();
		c.erase();
		System.out.println();
		Shape t=new Triangle();
		t.draw();
		t.erase();
		System.out.println();
		Shape s=new Square();
		s.draw();
		s.erase();

	}
}
