package logic_Building_Hour_M1.Day2;
import java.util.*;
public class Conditional2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2)
			System.out.println(num1+" is grater value");
		else
			System.out.println(num2+" is greater value");

	}

}
