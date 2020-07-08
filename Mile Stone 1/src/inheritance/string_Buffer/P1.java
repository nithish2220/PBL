package inheritance.string_Buffer;
import java.util.*;
public class P1 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String in=s;
		StringBuffer sb=new StringBuffer(s);
		if(sb.reverse().toString().equalsIgnoreCase(in))
			System.out.println("Is a palindrome");
		else
			System.out.println("Is not a palindrome");
	}

}
