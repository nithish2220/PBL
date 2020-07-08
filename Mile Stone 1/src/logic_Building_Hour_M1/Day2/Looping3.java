package logic_Building_Hour_M1.Day2;

import java.util.Scanner;

public class Looping3 {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int num=sc.nextInt();
		for(int i=0;i<=num;i+=2)
			System.out.print(i+" ");

	}

}
