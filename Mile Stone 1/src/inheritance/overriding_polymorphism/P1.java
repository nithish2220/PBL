package inheritance.overriding_polymorphism;
class Fruit
{
	String name;
	String taste;
	int size;
	Fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("Name of Fruit is:"+name);
		System.out.println("Taste is:"+taste);
		System.out.println("sie is:"+size);
	}
}
class Apple extends Fruit
{
	Apple(String name, String taste, int size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}

	void eat()
	{
		System.out.println("Name of Fruit is:"+name);
		System.out.println("Taste is:"+taste);
		System.out.println("sie is:"+size);
	}
}
class Orange extends Fruit
{

	Orange(String name, String taste, int size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}
	void eat()
	{
		System.out.println("Name of Fruit is:"+name);
		System.out.println("Taste is:"+taste);
		System.out.println("sie is:"+size);
	}
}
public class P1 {
	public static void main(String ar[])
	{
		Apple a=new Apple("Apple","Good",6);
		Orange o=new Orange("Orange","Bitter",7);
		a.eat();
		o.eat();
	}
}