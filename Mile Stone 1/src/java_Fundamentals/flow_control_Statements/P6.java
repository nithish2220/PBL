package java_Fundamentals.flow_control_Statements;
public class P6 {
	public static void main(String args[])
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		
		if(gender.equalsIgnoreCase("Male"))
		{
			if(age>=1 && age<=58)
				System.out.println("The percentage is 8.4%");
			else if(age>58 && age<101)
				System.out.println("The percentage is 10.5%");
		}
		else if(gender.equalsIgnoreCase("Female"))
		{
			if(age>=1 && age<=58)
				System.out.println("The percentage is 8.2%");
			else if(age>58 && age<101)
				System.out.println("The percentage is 9.2%");
		}
	}

}
