package java_Fundamentals.Arrays;
import java.util.*;
public class P10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of the array:");
		int a[]=new int[size];
		int b[]=new int[size];
		
		int j=0,k=0;
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
				a[j++]=a[i];
			else
				b[k++]=a[i];
		}
			for(int i=0;i<k;i++)
			{
				a[j++]=b[i];
			}
			for(int i=0;i<size;i++)
				System.out.print(a[i]+" ");
			
	}
}
