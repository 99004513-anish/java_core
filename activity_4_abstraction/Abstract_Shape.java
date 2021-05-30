import java.util.Scanner;

abstract class Shape{
	abstract void calculateArea(int value);
}

class Circle extends Shape{
	
	double pi = 3.14;
	void calculateArea(int value) {
		double area = pi * value * value;
		System.out.println("Area of Circle : " +area);
		
	}
}

class Square extends Shape{
	void calculateArea(int value) {
		double area = value * value;
		System.out.println("Area of Square: "+area);
	}
}

public class Abstract_Shape{
	public static void main(String args[]) {
		int value;
		int shape;
		Scanner s = new Scanner(System.in);
		System.out.println("1.Circle\n2.Square\nEnter the Shape: ");
		shape = s.nextInt();
		
		switch(shape){
			case 1 : System.out.println("Enter the radius :");
						value = s.nextInt();
						Circle c = new Circle();
						c.calculateArea(value);
						break;
			case 2 : System.out.println("Enter the side:");
					    value = s.nextInt();
					    Square sq = new Square();
					    sq.calculateArea(value);
					    break;
						   
			
		}
		s.close();
	}
}

