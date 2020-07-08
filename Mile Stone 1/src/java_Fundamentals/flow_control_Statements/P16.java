package java_Fundamentals.flow_control_Statements;
import java.util.*;
public class P16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0;
		while(num>0)
		{
			rem=(rem*10)+(num%10);
			num/=10;
		}
		System.out.println(rem);

	}

}
