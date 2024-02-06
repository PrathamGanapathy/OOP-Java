import cie.Student;
import cie.Internals;
import see.Externals;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int no = 2;
		Externals finalmarks[] = new Externals[no];
		Internals intmarks[] = new Internals[no];
		for (int i = 0; i < no; i++){
			finalmarks[i] = new Externals();
			intmarks[i] = new Internals();
			finalmarks[i].inputMarks();
			intmarks[i].inputMarks();
		}
		
		for(int i = 0; i < no; i++){
			System.out.println("CIE: ");
			intmarks[i].displayMarks();
			System.out.println("SEE: ");
			finalmarks[i].displayMarks();
		}
	}
}
