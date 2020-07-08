package logic_Building_Hour_M1.Day2;
import java.util.*;
public class Conditional4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if((num1+num2)%2==0)
				System.out.println("Their sum is EVEN");
		else
			System.out.println("Their sum is ODD");

	}

}
