import java.util.Scanner;

class WrongAge extends Exception{
	int fage;
	int sage;
	
	WrongAge(int age){
		this.fage=age;
	}
	
	WrongAge(int fage,int sage){
		this.fage=fage;
		this.sage=sage;
	}
	
	public String toString(){
		return "Invalid age";
	}
	
}

class Father{
	
	int age_of_father;
	Father(int a) throws WrongAge{		
		age_of_father=a;
		if(age_of_father<=0){
				throw new WrongAge(a);
			}
		System.out.println("Valid father's age.");
	}	
}
	

class Son extends Father{
	
	int age_of_son;
	Son(int fa,int sa)throws WrongAge{
		super(fa);
		age_of_son=sa;
		
		if(sa>=fa){
			throw new WrongAge(fa,sa);
		}
		System.out.println("Valid son's age.");
	}
}

class ExceptionMain{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the details:");
		try{
			System.out.println("Enter the father's age");
			Father f=new Father(input.nextInt());
		}
		catch(WrongAge e){
			System.out.println("For father's data");
			System.out.println("Caught: "+e);
		}
		
		try{
			System.out.println("Enter the father's age(again) and son's age");
			Son s=new Son(input.nextInt(),input.nextInt());
		}
		catch(WrongAge e){
			System.out.println("For son's data");
			System.out.println("Caught: "+e);
		}	
	}
}
