package java_Fundamentals.Arrays;
import java.util.*;
public class P12 {
	static int[] middleWay(int[] a,int b[])
	{
		int c[]=new int[2];
		c[0]=a[((a.length)/2)];
		c[1]=b[((b.length)/2)];
		return c;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array only Odd numbers grater than or equal to one:");
		int size=sc.nextInt();
		System.out.println("Enter the firsr array elements:");
		int a[]=new int[size];
		int b[]=new int[size];
		
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the secound array elements:");
		for(int i=0;i<size;i++)
			b[i]=sc.nextInt();
		int c[]=middleWay(a,b);
		System.out.print(c[0]+","+c[1]);

	}

}
