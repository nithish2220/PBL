package java_Fundamentals.Arrays;

public class P13 {
	public static void main(String args[])
	{
		if(args.length<4)
			System.out.println("Please enter 4 integer numbers");
		else
		{
			int k=0;
			int a[][]=new int[args.length][args.length];
			for(int i=0;i<args.length/2;i++) {
				for(int j=0;j<args.length/2;j++) {
				
				a[i][j]=Integer.parseInt(args[k]);
				k++;
			}
			}
					
			System.out.println("The given array is:");
			for(int i=0;i<a.length/2;i++) {
				for(int j=0;j<a.length/2;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
		}
			System.out.println("The reverse array is:");
			for(int i=a.length/2-1;i>=0;i--)
			{
				for(int j=a.length/2-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
					
				}
				System.out.println();
			}
	}

}
}
