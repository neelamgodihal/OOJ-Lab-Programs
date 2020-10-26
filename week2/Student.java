class Student {
   String usn,name;
   int n;
   int marks[];
   int credits[];
   int grade[];
   double Sgpa;
  
    void input() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Name of the student:");
	  name = sc.nextLine();
	  System.out.println("Enter the USN of the student:");
	  usn = sc.nextLine();
	  System.out.println("Enter the number of subjects:");
	  n = sc.nextInt();
	  marks = new int[n];
      credits = new int[n];
      grade = new int[n];
	  
	  for(int i=1;i<=n;i++){
	   System.out.println("Enter marks in Subject "+i+": ");
	   marks[i-1]=sc.nextInt();
	  }
	  
	  for(int i=1;i<=n;i++){
	   System.out.println("Enter credits in Subject "+i+": ");
	   credits[i-1]=sc.nextInt();
	  }
	 }
	 
	void display(){
	  System.out.println("The details of the student are as folloows:\n"+"Name: "+name+"\nUSN: "+usn);
	  for(int i=0;i<n;i++){
	     System.out.println("\n Marks in subject "+(i+1)+":"+marks[i]+"\n Credits in subject "+(i+1)+credits[i]);
	  }
	  
	 }
	  
    void gradeCalculate() {
		  for(int i=0;i<n;i++){
			  if(marks[i]>= 90)
				  grade[i]=10;
			  else if (marks[i]>=80 && marks[i]<90)
				  grade[i]=9;
			  else if (marks[i]>=70 && marks[i]<80)
				  grade[i]=8;
			  else if (marks[i]>=60 && marks[i]<70)
				  grade[i]=7;
			  else if (marks[i]>=50 && marks[i]<60)
				  grade[i]=6;
			  else if (marks[i]>=40 && marks[i]<50)
				  grade[i]=4;
			  else
				  grade[i]=0;
		  }
	 }
	  
	double sgpa(){
		 double sum=0;
		 double totalCredits=0;
		 gradeCalculate();
		 
		 for(int i=0;i<n;i++){
			 sum += grade[i]*credits[i];
			 totalCredits += credits[i];
		 }
		 return (sum/totalCredits);
	 }


public static void main(String args[]){
   Student stu = new Student();
   stu.input();
   stu.display();
   stu.Sgpa=stu.sgpa();
   System.out.println("The SGPA of the student is:"+stu.Sgpa);
}
}
