package inheritance.string_Buffer;

import java.util.Scanner;

public class P10 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		int i=n;
		while(i-->0)
			System.out.print(s.substring(s.length()-n));
	}
}
