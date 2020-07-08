package inheritance.inheritance;

public class Employee extends Person{
	double annual_sal;
	int year;
	String  ins_no;
	Employee(String name,double annual_sal,int year,String ins_no)
	{
		super(name);
		this.annual_sal=annual_sal;
		this.year=year;
		this.ins_no=ins_no;
	}
	void disp()
	{
		System.out.println("sal:"+annual_sal);
		System.out.println("year:"+year);
		System.out.println("ins_no:"+ins_no);
	}
	

}
