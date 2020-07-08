package inheritance.string_Buffer;

import java.util.Scanner;

public class P9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String res="";
		for(int i=0;i<a.length()+b.length();i++)
		{
			if(i<a.length() && (i)<b.length())
				res=res+a.charAt(i)+b.charAt(i);
		}
		System.out.println(res);
	}

}
