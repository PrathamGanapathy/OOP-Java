import java.util.Scanner;

class InputScanner{
	int d1, d2;
	Scanner sc = new Scanner(System.in);
	InputScanner(){
		if(this.getClass() == Circle.class){
			System.out.println("Enter d1: ");
			d1 = sc.nextInt();
		}
		else{
			System.out.println("Enter d1 and d2: ");
			d1 = sc.nextInt();
			d2 = sc.nextInt();
		}
	}
}

abstract class Shape extends InputScanner{
	abstract void printArea();
}

class Triangle extends Shape{
	void printArea(){
		System.out.println("Area of triangle is: " + (double)(d1*d2)/2);
	}
}

class Rectangle extends Shape{
	void printArea(){
		System.out.println("Area of rectangle is: " + (double)(d1*d2));
	}	
}


class Circle extends Shape{
	void printArea(){
		System.out.println("Area of circle: " + (double)(3.14*d1*d1));
	}
}

class AreaMain{
	public static void main(String args[]){
		System.out.println("Pranav Y - 1BM22CS204");
		Rectangle r = new Rectangle();
		Triangle tr = new Triangle();
		Circle c = new Circle();
		r.printArea();
		tr.printArea();
		c.printArea();
	}
}
