package java_Fundamentals.flow_control_Statements;
public class P17 {
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int rev=0,num1=num;
		while(num>0)
		{
			rev=(rev*10)+(num%10);
			num/=10;
		}
		if(rev==num1)
			System.out.println(num1+" is a palindrome");
		else
			System.out.println(num1+" is not a palindrome");
	}

}
