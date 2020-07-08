package inheritance.string_Buffer;

import java.util.*;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)==' ')
				sb.append(s.charAt(i));
		}
		System.out.println(sb);

	}

}
