package java_Fundamentals.Arrays;
import java.util.*;
public class P4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		System.out.println("Enter the ASCII values:");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			char ch=(char)a[i];
			System.out.print(ch+" ");
		}
	}

}
