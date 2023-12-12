import java.util.*;
public class quadratic
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Pratham Ganapathy	1BM22CS206");
		int a,b,c;
		double r1,r2,d;

		System.out.println("Ënter coefficients of a,b,c");
		a=SC.nextInt();
		b=SC.nextInt();
		c=SC.nextInt();


		while(a==0)
		{
				System.out.println("Not a quadratic equation");
				System.out.println("Enter a non zero value for a");
				a=SC.nextInt();
		}
		d=(b*b)-(4*a*c);
		if(d==0)
		{
			r1=(-b)/(2*a);
			System.out.println("Roots äre real and equal");
			System.out.println("Root1 = Root2 = "+r1);
		}
		else if(d>0)
		{
			r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
			r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
			System.out.println("Roots are real and distinct");
			System.out.println("Root1 = "+r1+"  Root2= "+r2);
		}
		else if(d<0)
		{
			System.out.println("Roots are imaginary");
			r1 = (-b)/(2*a);
			r2 = Math.sqrt(-d)/(2*a);
			System.out.println("Root1 = "+r1+" Root2 = "+r2);
		}
	}
}
