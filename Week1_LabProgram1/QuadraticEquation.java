import java.util.Scanner;

public class QuadraticEquation {

       public static void main(String[] args){
	    Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		double a=input.nextDouble();
		System.out.println("Enter the value of b");
		double b=input.nextDouble();
		System.out.println("Enter the value of c");
		double c=input.nextDouble();
		
		double root1=0;
		double root2=0;
		double discriminant= b*b-(4*a*c);
		
		if(discriminant<0){
			System.out.println("The quadratic equation has imaginary roots.");
		}
		
		if(discriminant==0){
			System.out.println("The quadratic equation has real and equal roots.");
			
			root1=-b/(2*a);
			root2=-b/(2*a);
			
			System.out.println("The roots are: "+root1+" and "+root2);
		}
		
		if(discriminant>0){
			System.out.println("The quadratic equation has real and distinct roots.");
			
			root1=(-b+Math.sqrt(discriminant))/(2*a);
			root2=(-b-Math.sqrt(discriminant))/(2*a);
			
			System.out.println("The roots are:\n Root1:"+root1+"\n Root2:"+root2);
		}

	   }

}
