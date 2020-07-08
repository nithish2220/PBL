package java_Fundamentals.Arrays;
import java.util.*;
public class P8 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array elements:");
		int i6=0,i7=0;
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			if(a[i]==6)
				i6=i;
			if(a[i]==7)
				i7=i;
		}
		int sum=0;
		if(i6>i7)
		{
			for(int i=0;i<size;i++)
				sum+=a[i];
			System.out.println("Sum is:"+sum);
		}
		else if(i6<i7)
		{
			for(int i=0;i<i6;i++)
				sum+=a[i];
			if(size>i7)
			{
				for(int i=i7+1;i<size;i++)
					sum+=a[i];
			}
			System.out.println("Sum is:"+sum);
		}
		
	}

}
