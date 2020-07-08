package java_Fundamentals.Arrays;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<9)
			System.out.println("Please enter 9 integer numbers");
		else
		{
			int k=0;
			int a[][]=new int[args.length][args.length];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The given array is :");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
		}
			int max=a[0][0];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(a[i][i]>max)
					{
						max=a[i][j];
					}
				}
			}
			System.out.println("The biggest number in the given rray is "+max);

	}

}
}
