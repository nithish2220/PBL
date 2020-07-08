package java_Fundamentals.Arrays;
import java.util.*;
public class P11 {
	static boolean only14(int ar[])
	{
		int c=0;
		for(int i=0;i<ar.length;i++)
			if(ar[i]==1 || ar[i]==4)
			{
				c++;
			}
		if(c==ar.length)
				return true;
		return false;
		
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int num=sc.nextInt();
		System.out.println("Enter the Array elements:");
		int a[]=new int[num];
		for(int i=0;i<num;i++)
			a[i]=sc.nextInt();
		System.out.println(only14(a));

	}

}
