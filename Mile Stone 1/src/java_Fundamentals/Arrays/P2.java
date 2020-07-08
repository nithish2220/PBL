package java_Fundamentals.Arrays;
import java.util.*;
public class P2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the array values:");
		for(int i=0;i<size;i++)
			ar[i]=sc.nextInt();
        int min=ar[0];
        for(int i=1;i<size;i++)
        {
        	if(min>ar[i])
        		min=ar[i];
        }
		System.out.println("The minimum number of array is:"+min);
		int max=ar[0];
		for(int i=1;i<size;i++)
		{
			if(max<ar[i])
				max=ar[i];
		}
		System.out.println("The maximum number of array is:"+max);

	}

}
