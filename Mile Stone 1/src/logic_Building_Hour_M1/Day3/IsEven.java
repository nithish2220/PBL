package logic_Building_Hour_M1.Day3;

import java.util.Scanner;

public class IsEven {
	static int iseven(int num)
	{
		if(num%2==0)
			return 2;
		else
			return 1;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	      int n=sc.nextInt();
	      System.out.println(iseven(n));
	      

	}

}
