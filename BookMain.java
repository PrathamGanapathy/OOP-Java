import java.util.*;
class Book
{
	String name, author;
	int price, numPages;
	Book(String name, String author, int price, int numPages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.numPages=numPages;
	}
	public String toString()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Author: "+this.author);
		System.out.println("Price: "+this.price);
		System.out.println("Number of pages: "+this.numPages);
		return this.name + this.author + this.price + this.numPages;
	}
}//end of class

public class BookMain
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Pratham Ganapathy\t1BM22CS206");
		int i,n,price,numPages;
		String name, author;
		System.out.println("Enter number of bookd");
		n=SC.nextInt();
		Book b[]=new Book[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter name of the book");
			name=SC.next();
			System.out.println("Enter name of the author");
			author=SC.next();
			System.out.println("Enter the price");
			price=SC.nextInt();
			System.out.println("Enter number of pages");
			numPages=SC.nextInt();
			b[i]=new Book(name,author,price,numPages);
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Book"+(i+1)+" details");
			b[i].toString();
			System.out.println();
		}
	}
}