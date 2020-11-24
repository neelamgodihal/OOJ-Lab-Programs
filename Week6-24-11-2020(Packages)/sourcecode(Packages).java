//inside student.java

package cie;
import  java.util.Scanner;

public class student
{
	
	public String usn;
	public String name;
	public int sem;
	public void getdata()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the student usn");
		usn=ss.next();
		System.out.println("enter the name of the student");
		name=ss.next();
		System.out.println("enter the semester");
		sem=ss.nextInt();
	}
	public void printdata()
	{
		System.out.println("usn="+usn);
		System.out.println("name="+name);
		System.out.println("sem="+sem);
	}
}
		
		
 // inside internals.java
 package cie;
import  java.util.Scanner;

public class internals extends student 
{
	
	public double cie_marks[]=new double[5];
	public void get_cie_marks()
	{
		getdata();
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the cie marks of 5 subjects");
		for(int i=0;i<5;i++)
		{
			cie_marks[i]=ss.nextDouble();
		}
	}
	public void print_cie_marks()
	{
		printdata();
		System.out.println("cie marks:");
		for(int i=0;i<5;i++)
		{
			System.out.println(cie_marks[i]);
		}
	}
}
		
		
	//inside externals.java
  package see;
import  java.util.Scanner;
import cie.*;

public class externals extends cie.student
{
	public double see_marks[]=new double[5];
	/*
	public void get_studdata()
	{
		cie.student.getdata();
	}
	public void print_studdata()
	{
		cie.student.printdata();
	}
	*/
		
	public void get_see_marks()
	{
		
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the see marks of 5 subjects");
		for(int i=0;i<5;i++)
		{
			see_marks[i]=ss.nextDouble();
		}
	}
	public void print_see_marks()
	{
		System.out.println("see marks:");
		for(int i=0;i<5;i++)
		{
			System.out.println(see_marks[i]);
		}
	}
}
//inside finalmarks.java
import cie.*;
import see.*;

class finalmarks
{
	public static void main(String args[])
	{
		cie.internals ob1=new cie.internals();
		//cie.student ob3=new cie.student();
		see.externals ob2=new see.externals();
		//ob2.get_studdata();
		//ob2.print_studdata();
	
		//ob3.getdata();
		ob1.get_cie_marks();
		//ob1.print_cie_marks();
		ob2.get_see_marks();
		//ob2.print_see_marks();
		System.out.println("total marks:");
		for(int i=0;i<5;i++)
		{
			System.out.println("subject "+(i+1)+"="+(ob1.cie_marks[i]+ob2.see_marks[i]));
		}
	}
}
