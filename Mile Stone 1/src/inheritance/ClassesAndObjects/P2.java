package inheritance.ClassesAndObjects;

import java.util.Scanner;

class Calculator
{
	static int powerInt(int num1,int num2)
	{
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}
}
public class P2 {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two Integer numbers:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("The powerInt is:"+Calculator.powerInt(num1, num2));
		System.out.println("Enter the two double numbers:");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		System.out.println(Calculator.powerDouble(num1, num2));
		

	}

}
