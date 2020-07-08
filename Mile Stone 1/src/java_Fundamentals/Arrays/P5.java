package java_Fundamentals.Arrays;
import java.util.*;
public class P5 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		System.out.println("Enter the Array values:");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		System.out.println("The smallest 2 numbers in Array is:"+a[0]+" "+a[1]);
		System.out.println("The largest 2 numbers in Array is:"+a[size-2]+" "+a[size-1]);
	}

}
