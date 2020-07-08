package inheritance.string_Buffer;

import java.util.Scanner;

public class P7 {
	@SuppressWarnings({"resource" })
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x')
			System.out.println(s.substring(1,s.length()-1));
		else
		System.out.println(s);
	}

}
