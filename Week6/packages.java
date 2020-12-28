/*Create a package CIE which has two classes- Student and Internals. The class Personal(should be internals) has
members like usn, name, sem. The class internals has an array that stores the internal marks
scored in five courses of the current semester of the student. Create another package SEE
which has the class External which is a derived class of Student. This class has an array that
stores the SEE marks scored in five courses of the current semester of the student. Import the
two packages in a file that declares the final marks of n students in all five courses.
Missing info: Internals is subclass of student class. (n internal and n external objects)*/

//inside Student.java
package CIE;
import java.util.Scanner;

public class Student{
	public String usn;
	public String name;
	public int sem;
	
	/*Student(){
		usn="";
		name="";
		sem=0;
	}
	
	Student(String u,String n,int s){
		usn=u; 
		name=n;
		sem=s;
	}*/ 
	
	public void getData(){
		System.out.println("Enter the USN");
		Scanner input=new Scanner(System.in);
		usn=input.nextLine();
		System.out.println("Enter the Name");
		name=input.nextLine();
		System.out.println("Enter the Semester");
		sem=input.nextInt();
	}
	
	public void putData(){
		System.out.println("The USN is:"+usn);
		System.out.println("The Name is:"+name);
		System.out.println("The Semester is:"+sem);
	}
	
}

//inside Internals.java
package CIE;
import java.util.Scanner;

public class Internals extends Student{
	public int a[]=new int[5];
	
	{System.out.println("Enter the internal marks");}
	Scanner in=new Scanner(System.in);
	
	public void getDataInt(){
		for(int i=0;i<5;i++){
		System.out.println("Enter the marks in subject "+(i+1));
		a[i]=in.nextInt();		
		}
	}
}

//inside Externals.java
package SEE;
import java.util.Scanner;
import CIE.*;

public class Externals extends CIE.Student{
	public int e[]=new int[5];
	{System.out.println("Enter the external marks");}
	Scanner in=new Scanner(System.in);
	
	public void getDataExt(){
		for(int i=0;i<5;i++){
		System.out.println("Enter the marks in subject "+(i+1));
		e[i]=in.nextInt();		
		}
	}
}

//inside driver file
import CIE.*;
import SEE.*;

class FinalMarks{
	
	public static void main(String args[]){
	CIE.Student s=new CIE.Student();
	System.out.println("Enter your details:");
	s.getData();
	s.putData();
	
	CIE.Internals i=new CIE.Internals();
	//i.Internals();
	i.getDataInt();
	
	SEE.Externals e=new SEE.Externals();
	e.getDataExt();
	
	System.out.println("Final Marks:");
	for(int j=0;j<5;j++){
		System.out.println("Subject "+(j+1)+"="+(i.a[j]+e.e[j]));
	}
	}
}

