import java.util.Scanner;

class Book{
	private String name,author;
	private double price;
	private int num_pages;
	
	Book(){
		this.name="";
		this.author="";
		this.price=0.0;
		this.num_pages=0;
	}
	
	Book(String n,String a,double p,int np){
		this.name=n;
		this.author=a;
		this.price=p;
		this.num_pages=np;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAuthor(String author){
		this.author=author;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public void setNumPages(int num_pages){
		this.num_pages=num_pages;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public int getNumPages(){
		return this.num_pages;
	}
	
	
	public String toString(){
		return("Details:\n"+"Name of the book:"+this.name+"\nName of the author:"+this.author+"\nPrice of the book:"+this.price+"\nNumber of pages:"+this.num_pages);
	}
}

class Main{
	public static void main(String[] args){
		int  n;
		System.out.print("Enter the number of books\t");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		Book[] b=new Book[n];
		
		for(int i=0;i<n;i++){
			b[i] = new Book();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the name of the book");
			b[i].setName(input.nextLine());
			System.out.println("Enter the name of the author of the book");
			b[i].setAuthor(input.nextLine());
			System.out.println("Enter the price of the book");
			b[i].setPrice(input.nextDouble());
			System.out.println("Enter the number of pages of the book");
			b[i].setNumPages(input.nextInt());
	
		}
		
		for(int j=0;j<n;j++){
			System.out.println("The details of book "+(j+1)+" are as follows:");
			System.out.println(b[j].toString());
		}
	}
}
