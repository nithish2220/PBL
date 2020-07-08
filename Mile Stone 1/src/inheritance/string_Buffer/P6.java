package inheritance.string_Buffer;

import java.util.Scanner;

public class P6 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		if(a.length()>b.length())
			System.out.println(b+a+b);
		else
			System.out.println(a+b+a);
	}

}
