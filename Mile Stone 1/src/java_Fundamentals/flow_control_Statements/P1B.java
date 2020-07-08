package java_Fundamentals.flow_control_Statements;

import java.util.Scanner;

public class P1B {
	static boolean lastDigit(int num1,int num2)
	{
		if((num1%10)==(num2%10))
			return true;
		return false;
		
	}
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(lastDigit(num1,num2));
	}

}
