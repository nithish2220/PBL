package java_Fundamentals.Arrays;
import java.util.*;
public class P9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		System.out.println("Enter the values of Array:");
		int a[]=new int[size];
		int b[]=new int[size];
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		int j=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]==10)
				continue;
			b[j++]=a[i];
		}
		for(int i=0;i<size;i++)
			System.out.print(b[i]+" ");

	}

}
