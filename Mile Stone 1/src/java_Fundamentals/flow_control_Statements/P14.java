package java_Fundamentals.flow_control_Statements;
import java.util.*;
public class P14 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number:");
		int num=sc.nextInt();
		int sum=0;
		String s=String.valueOf(num);
		for(int i=0;i<s.length();i++)
		{
			sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		System.out.println("The sum of all digits of given number is :"+sum);
	}

}
