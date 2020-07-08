package inheritance.string_Buffer;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		for(int i=0;i<n;i++)
			System.out.print(s.substring(0,2));
	}

}
