package logic_Building_Hour_M1.Day2;
import java.util.*;
public class Conditional3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println(num+" is a even number");
		else
			System.out.println(num+" is a odd number");

	}

}
