package inheritance.string_Buffer;

import java.util.Scanner;

public class P4 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		if(n%2==0)
			System.out.println(s.substring(0,n/2));
		else
			System.out.println("null");
	}

}
