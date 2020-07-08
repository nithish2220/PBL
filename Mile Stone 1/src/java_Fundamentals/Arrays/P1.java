package java_Fundamentals.Arrays;
import java.util.*;
public class P1 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size=sc.nextInt();
		int ar[]=new int[size];
		int sum=0;
		float avg;
		System.out.println("Enter the Array values:");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
			sum+=ar[i];
		}
		avg=sum/size;
		System.out.println("The sum and Average is:"+sum +" "+avg);
	}

}
