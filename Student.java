import java.util.*;
class Subject
{
	int SubjectMarks, credits, grade;
}
public class Student
{
	Scanner SC=new Scanner(System.in);
	Subject subject[];
	String usn, name;
	double SGPA;

	Student()
	{
		int i;
		subject=new Subject[9];
		for(i=0;i<8;i++)
			subject[i]=new Subject();
	}

	public void getStudentDetails()
	{
		System.out.println("Enter name and USN");
		name=SC.nextLine();
		usn=SC.nextLine();
	}

	public void getMarks()
	{
		for(int i=0; i<9; i++)
		{
			System.out.println("Enter marks and credits");
			subject[i].SubjectMarks=SC.nextInt();
			subject[i].credits=SC.nextInt();
			int k=subject[i].SubjectMarks;
			if(k<40)
			{
				subject[i].grade=0;
			}
			else if(k>=40 && k<=49)
			{
				subject[i].grade=4;
			}
			else if(k>=50 && k<=54)
			{
				subject[i].grade=5;
			}
			else if(k>=55 && k<=59)
			{
				subject[i].grade=6;
			}
			else if(k>=60 && k<=69)
			{
				subject[i].grade=7;
			}
			else if(k>=70 && k<=79)
			{
				subject[i].grade=8;
			}
			else if(k>=80 && k<=89)
			{
				subject[i].grade=9;
			}
			else if(k>=80 && k<=89)
			{
				subject[i].grade=10;
			}
			else if(k>100)
			{
				System.out.println("Enter valid marks");
				subject[i].SubjectMarks=SC.nextInt();
			}
		}
	}
	double computeSGPA()
	{
		double count=0.0;
		int c=0;

		for(int i=0;i<9;i++)
		{
			count+=subject[i].grade * subject[i].credits;
		}

		for(int i=0;i<9;i++)
			c+=subject[i].credits;

		count/=c;

		return count;
	}
}

class StudentMain
{
	public static void main(String args[])
	{
		System.out.println("Pratham Ganapathy 1BM22CS206");
		Student s1=new Student();
		s1.getStudentDetails();
		s1.getMarks();
		double SGPA=s1.computeSGPA();
		System.out.println("Name: "+s1.name+"\tUSN: "+s1.usn);
		System.out.println("SGPA= "+SGPA);
	}
}
