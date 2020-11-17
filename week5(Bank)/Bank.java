import java.util.Scanner;
import java.lang.Math;

class Account{
	
	private String customer_name;
	private long account_num;
	private int account_type;
	boolean cheque;
    double balance;
	
	Account(String name,long accnum,int type){
		customer_name=name;
		account_num=accnum;
		account_type=type;
		balance=500;
	}
	
	void displayData(){
		System.out.println("\n----------DETAILS----------");
		System.out.println("\nName:"+customer_name+"\nAccount number:"+account_num+"\nAccount type:"+account_type+"\nBalance:"+balance);
	}

}

class Savings extends Account{
	
	double interest_rate;
	double final_amt;
	double compound_interest;
	
	Savings(String x,long y,int z){
		super(x,y,z);
		interest_rate=0.03;
		cheque=false;
	}
	
	void calAndDepCompoundInt(int n,int t){
		final_amt=balance*Math.pow((1 + (double)(interest_rate/n)),n*t);
		compound_interest = final_amt - balance;
		System.out.println("The compound interest is as follows:"+compound_interest);
		balance = final_amt;
		System.out.println("The updated balance is as follows: "+final_amt);
		
	}
	
	void withdraw(double amt){
		if(amt>balance){
			System.out.println("Your balance is : "+balance+"\n Please enter amount lesser than the balance amount");
		}
		else {
			balance=balance-amt;
			System.out.println("Updated balance is as follows: "+balance);
	    }
	}
	
	void Deposit(double amt2){
		balance+=amt2;
		System.out.println("Updated balance is as follows: "+balance);
	}
	
	void balance(){
		System.out.println("The balance is as follows: "+balance);
	}
	
}

class Current extends Account{
	Current(String x,long y,int z){
		super(x,y,z);
		cheque=false;
	}
	
	void balance(){
		System.out.println("The balance is as follows: "+balance);
	}
	
	void withdraw(double amt){
		double min_balance=300.0;
		
		if((balance-amt)<min_balance){
			System.out.println("Your balance is : "+balance+" Minimum balance of: "+min_balance+" has to be maintained in the account.Rs.30 will be deducted.");
			balance=balance-amt-30.0;
			System.out.println("Updated balance is as follows: "+balance);
		}
		else {
			balance=balance-amt;
			System.out.println("Updated balance is as follows: "+balance);
	    }
	}
	
	void Deposit(double amt3){
		balance+=amt3;
		System.out.println("Updated balance is as follows: "+balance);
	}
	
	
}

class Bank {
	
	public static void main(String args[]){
		
		String a;
		long b;
		int c;
		
		System.out.println("*****WELCOME*****");
		System.out.println("Enter the details");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of the account holder:");
		a=input.nextLine();
		System.out.println("Enter the account number of the account holder:");
		b=input.nextLong();
		System.out.println("Enter the account type:\nEnter 1 for savings account or 2 for current savings\n");
		c=input.nextInt();
		
		if(c==1){
			Savings s1=new Savings(a,b,c);
			s1.displayData();
			int num,i=0;
			int n,t;
			double amount;
			double deposit_amt;
			
			while(i!=1){
				
			System.out.println("\nEnter your choice:\n 1.Compute Compound Interest and deposit\n 2.Withdrawal\n 3.Balance \n 4.Deposit \n 5.Exit");
			num=input.nextInt();
			
			switch(num){
				case 1:System.out.println("Enter n(Number of times interest applied per time period)\n");
					   n=input.nextInt();
					   System.out.println("Enter the time period t\n");
					   t=input.nextInt();
					   s1.calAndDepCompoundInt(n,t);
					   break;
				
				case 2:System.out.println("Enter the amount to be withdrawn:\n");
					   amount=input.nextDouble();
					   s1.withdraw(amount);
					   break;
					   
				case 3:s1.balance();
					   break;
					  
				case 4:System.out.println("Enter the amount to be deposited:\n");
				       deposit_amt=input.nextDouble();
					   s1.Deposit(deposit_amt);
					   break;
				
				case 5:i=1;
					   break;
				
				default: System.out.println("Please enter a valid input.\n");
			}
				
			}
			
		}
		
		if(c==2){
			Current c1=new Current(a,b,c);
			int choice,j=0;
			char option;
			double amount2;
			double deposit_amt2;
			
			while(j!=1){
				
				System.out.println("Enter your choice:\n1.Cheque Facility \n2.Display Balance \n3.Withdrawal\n4.Deposit\n5.Exit ");
				choice=input.nextInt();
				
				switch(choice){
					
					case 1: System.out.println("Do you want cheque book facility?\n Enter y(yes) or n(no)");
							option=input.next().charAt(0);
							if(option=='y'){
								c1.cheque=true;
								System.out.println("Cheque Book facility has been availed\n");
							}
							break;
							
					case 2: c1.balance();
						    break;
							
					case 3: System.out.println("Enter the amount to be withdrawn:\n");
							amount2=input.nextDouble();
							c1.withdraw(amount2);
							break;
					
					case 4:System.out.println("Enter the amount to be deposited:\n");
						   deposit_amt2=input.nextDouble();
					       c1.Deposit(deposit_amt2);
					       break;
					
					case 5: j=1;
							break;
 
					default: System.out.println("Please enter a valid input.\n");
					
				}
	
			}
	
		}

	}	
}
