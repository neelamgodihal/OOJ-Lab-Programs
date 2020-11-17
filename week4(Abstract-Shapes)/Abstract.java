import java.util.Scanner;

abstract class Shape{
	double dim1,dim2;
	
	Shape(double a,double b){
		dim1=a;
		dim2=b;
	}
	
	abstract void printArea();
}

class Rectangle extends Shape{
	{System.out.println("Inside Rectangle class");}
	Rectangle(double x,double y){
		super(x,y);
	}
	
	void printArea(){
		System.out.println("The area of rectangle is: "+(dim1*dim2));
	}
}

class Triangle extends Shape{
	{System.out.println("Inside Triangle class");}
	
	Triangle(double a,double b){
		super(a,b);
	}
	
	void printArea(){
		System.out.println("The area of triangle is: "+(dim1*dim2/2));
	}

}

class Circle extends Shape{
	{System.out.println("Inside Circle class");}
	
	Circle(double r){
		super(r,r);
	}
	
	void printArea(){
		System.out.println("The area of Circle is:"+(Math.PI*dim1*dim2));
	}
	
}

class Abstract{
	
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		int i=0,n;
		
		while(i!=1){
			System.out.println("Enter your choice:\n 1.Rectangle\n 2.Triangle\n 3.Circle\n 4.Exit");
			n=input.nextInt();
			
			switch(n){
				case 1: double b,l;
						System.out.println("Enter the length and breadth:");
						b=input.nextDouble();
						l=input.nextDouble();
						Rectangle r=new Rectangle(b,l);
						r.printArea();
						break;
				
				case 2: double base,height;
						System.out.println("Enter the base and height:");
						base=input.nextDouble();
						height=input.nextDouble();
						Triangle t=new Triangle(base,height);
						t.printArea();
						break;
						
				case 3: double radius;
						System.out.println("Enter the radius:");
						radius=input.nextDouble();
						Circle c=new Circle(radius);
						c.printArea();
						break;
						
				case 4: i=1;
						
			}
		}
	}
}
