package logic_Building_Hour_M1.Day2;

import java.util.Scanner;

public class Looping1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(i+" ");

	}

}
