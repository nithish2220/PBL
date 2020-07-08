package logic_Building_Hour_M1.Day4;

import java.util.Scanner;

public class SumOfLastTwo {
	static int addLastDigits(int num1,int num2)
	{
		if(num1<0)
			num1=-(num1);
		if(num2<0)
			num2=-(num2);
		return ((num1%10)+(num2%10));
	}

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Number:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(addLastDigits(num1,num2));

	}

}
