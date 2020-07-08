package inheritance.inheritance;
class Animal
{
	void eat()
	{
		System.out.println("Animal Eats");
	}
	void sleep()
	{
		System.out.println("Animal Sleeps");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Animal Bird Eats");
	}
	void sleep()
	{
		System.out.println("Animal Bird Sleeps");
	}
	void fly()
	{
		System.out.println("Birds Fly");
	}
}

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.fly();
		b.sleep();

	}

}
