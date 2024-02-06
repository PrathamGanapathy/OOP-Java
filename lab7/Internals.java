package cie;

import java.util.Scanner;

public class Internals extends Student {
	public int marks[] = new int[5];

	public void inputMarks() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter subject " + (i + 1) + " marks: ");
			marks[i] = sc.nextInt();
		}
	}

	public void displayMarks() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Subject " + (i + 1) + " marks: " + marks[i]);
		}
	}
}
