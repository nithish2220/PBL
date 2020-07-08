//1)	Write a program to accept a number N and print whether it is positive, negative or zero
package logic_Building_Hour_M1.Day2;
import java.util.*;
public class Conditional1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num>0)
			System.out.println("Given number is POSITIVE");
		else if(num==0)
			System.out.println("GIven number is ZERO");
		else
			System.out.println("Given number is NEGATIVE");
		

	}

}
