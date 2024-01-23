import java.util.Scanner;
import java.lang.Math;

class InputScanner{
	int d1, d2, d3;
	Scanner sc = new Scanner(System.in);
	InputScanner(){
		if(this.getClass() == Circle.class){
			System.out.println("Enter d1: ");
			d1 = sc.nextInt();
		}
		else{
			System.out.println("Enter a, b, c: ");
			d1 = sc.nextInt();
			d2 = sc.nextInt();
            d3 = sc.nextInt();
		}
	}
}

abstract class Shape extends InputScanner{
	abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Triangle extends Shape{
	void calculateArea(){
        double s = (d1+d2+d3)/2;
		System.out.println("Area of triangle is: " + (double)Math.sqrt(s*(s-d1)*(s-d2)*(s-d3)));
	}
    void calculatePerimeter(){
        System.out.println("Perimeter of triangle is: " + (double)(d1+d2+d3));
    }
}

class Circle extends Shape{
	void calculateArea(){
		System.out.println("Area of circle: " + (double)(3.14*d1*d1));
	}
    void calculatePerimeter(){
        System.out.println("Perimeter of circle: " + (double)(3.14*2*d1));
    }
}

class ShapeMain{
	public static void main(String args[]){
		System.out.println("Pratham - 1BM22CS206");
		Triangle tr = new Triangle();
		Circle c = new Circle();
		tr.calculateArea(); tr.calculatePerimeter();
		c.calculateArea(); tr.calculatePerimeter();
	}
}
