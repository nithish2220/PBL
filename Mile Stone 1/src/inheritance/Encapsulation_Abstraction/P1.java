package inheritance.Encapsulation_Abstraction;

import java.util.Scanner;

class Author
{
	String authorn;
	String email;
	char gender;
	Author(String authorn,String email,char gender)
	{
		this.authorn=authorn;
		this.email=email;
		this.gender=gender;
	}
}
class Book
{
	String name;
	Author author;
	double price;
	int qtyInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	
}
public class P1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter author name,email,gender:");
		String author=sc.next();
		String email=sc.next();
		char gen=sc.next().charAt(0);
		Author a1=new Author(author, email, gen);
		Book b1=new Book();
		System.out.println("Enter the Details of the book:");
		System.out.println("Enter Book name:");
		String name=sc.next();
		System.out.println("Enter Book Price:");
		double price=sc.nextDouble();
		System.out.println("Enter Book qtyInStock:");
		int qtyInStock=sc.nextInt();
		b1.setName(name);
		b1.setAuthor(a1);
		b1.setPrice(price);
		b1.setQtyInStock(qtyInStock);
		System.out.println("Book Details:");
		System.out.println("Book Name:"+b1.getName());
		System.out.println("Book Author:"+b1.getAuthor().authorn);
		System.out.println("Book Price:"+b1.getPrice());
		System.out.println("Book qtyInStock:"+b1.getQtyInStock());
		// TODO Auto-generated method stub

	}

}
