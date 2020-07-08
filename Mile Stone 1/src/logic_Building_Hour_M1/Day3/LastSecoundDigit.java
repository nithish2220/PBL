package logic_Building_Hour_M1.Day3;

import java.util.Scanner;

public class LastSecoundDigit {
	static int lastsecDig(int num)
	{
		if(num<0)
			num=-(num);
		num=num/10;
		return num%10;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		System.out.println(lastsecDig(num));

	}

}
