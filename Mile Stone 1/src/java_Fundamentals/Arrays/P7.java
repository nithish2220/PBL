package java_Fundamentals.Arrays;
import java.util.*;

public class P7 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		System.out.println("Enter the Array values:");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		
		size=removeDuplicate(a,size);
		
		
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
		
	}

	public static int removeDuplicate(int[] a, int size) {
       int j=0;
		
		for(int i=0;i<size-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		}
		
		a[j++]=a[size-1];
		return j;
	}

}
