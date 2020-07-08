package java_Fundamentals.flow_control_Statements;
import java.util.*;
public class P7 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(Character.isUpperCase(ch))
		    System.out.println(Character.toLowerCase(ch));
		else
			System.out.println(Character.toUpperCase(ch));
			
	}
}
