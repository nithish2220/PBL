package abstraction_Packages_ExceptionHandling.interfaces;

import java.util.Scanner;

public class TestEmployee {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		double sal=sc.nextDouble();
		int year=sc.nextInt();
		String ins_no=sc.next();
		Employee e1=new Employee(name,sal,year,ins_no);
		e1.pName();
		e1.disp();

	}

}
