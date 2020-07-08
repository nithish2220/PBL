package abstraction_Packages_ExceptionHandling.AbstractClasses;

import java.util.Scanner;

abstract class Compartment
{
	void notice() {};
}
class FirstClass extends Compartment
{
	void notice()
	{
		System.out.println("This is a First Class Compartment");
	}
}
class Ladies extends Compartment
{
	void notice()
	{
		System.out.println("This is Ladies Compartment");
	}
}
class General extends Compartment
{
	void notice()
	{
		System.out.println("This is General Comaprtment");
	}
	
}
class Luggage extends Compartment
{
	void notice()
	{
		System.out.println("This is Luggage Compartment");
	}
}

public class P1 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Compartment c[]=new Compartment[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			int cnum=sc.nextInt();
			if(cnum==1)
				c[i]=new FirstClass();
			if(cnum==2)
				c[i]=new Ladies();
			if(cnum==3)
				c[i]=new General();
			if(cnum==4)
				c[i]=new Luggage();	
		}
		for(int i=0;i<10;i++)
			c[i].notice();
	}
}