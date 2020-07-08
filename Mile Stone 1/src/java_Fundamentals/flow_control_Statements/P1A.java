package java_Fundamentals.flow_control_Statements;
import java.util.*;
public class P1A {
	@SuppressWarnings("resource")
	public static void main(String args[])
	  {
	       Scanner sc=new Scanner(System.in);
	       int num=sc.nextInt();
	        if(num>0)
	         System.out.println(num+" is a positive number");
	       else if(num<0)
	          System.out.println(num+" is a negative number");
	      else
	           System.out.println(num+" is a niether negative or positive number");
	  }

}
