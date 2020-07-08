package logic_Building_Hour_M1.Day4;

import java.util.Scanner;

public class LastDigit {
	static int lastdig(int num)
	{
		if(num<0)
			num=-(num);
		return num%10;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		System.out.println(lastdig(num));

	}

}
