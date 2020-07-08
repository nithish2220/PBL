package java_Fundamentals.Arrays;
import java.util.*;
public class P3 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size=sc.nextInt();
		System.out.println("Enter the Array values:");
		int ar[]=new int[size];
		for(int i=0;i<size;i++)
			ar[i]=sc.nextInt();
		System.out.println("Enter the element to Search:");
		int ele=sc.nextInt();
		int ans=Arrays.binarySearch(ar, ele);
		if(ans<0)
			System.out.println("-1");
		else
		System.out.println("The element found at:"+ans);
	}

}
