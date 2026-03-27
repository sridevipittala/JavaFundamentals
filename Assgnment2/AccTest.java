/*
 Object-Oriented Basics — Bank Account
Design a banking system with the following specifications:
Create a BankAccount class with the following fields: accountNumber (String), holderName (String), balance (double), and accountType (String: Savings/Current).
Add a transactionCount field (int) that increments every time a deposit, withdrawal, or transfer occurs.
Constructor: Must be parameterized to accept all fields. Validation: The initial balance cannot be negative.
Methods:
deposit(double amt)
withdraw(double amt) — Validation: Prevent overdrafts (cannot withdraw more than the balance).
transfer(BankAccount target, double amt)
displayStatement()
Testing (in main): Create 2 accounts. Perform a series of at least 5 transactions between them. Print the final statements for both accounts.
*/
class BankAccount{
 	String accountNumber;
	String holderName;
	double balance;
	String accountType;
	int transactionCount;

	BankAccount(String accountNumber,String holderName,double balance,String accountType){
		this.accountNumber=accountNumber;
	    this.holderName=holderName;
		this.balance=balance;
	    this.accountType=accountType;
		this.transactionCount=0;

	}

	void deposit(double amt){
		this.balance+=amt;
		this.transactionCount++;
	}

	void withdraw(double amt){
		if(balance>=amt){
			this.balance-=amt;
			transactionCount++;
		}
		else{
			System.out.println("Can't withdraw  due to low balance");
		}

	}

	void transfer(BankAccount target, double amt){
		if(amt>0){
			target.balance+=amt;
			transactionCount++;
		}
	} 

	void displayStatement(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("A/C Holder Name: "+holderName);
		System.out.println("Balance: "+balance);
		System.out.println("A/C Type: "+accountType);
		System.out.println("TransactionCount: "+transactionCount);
	}
	
}
class AccTest{
	public static  void main(String args[]){
		BankAccount ac1=new BankAccount("SS1001SS","Saranya",3000,"Savings");
		ac1.withdraw(1000);

		BankAccount ac2=new BankAccount("PP20022AA","Sai",1000,"Savings");
		ac2.deposit(500);

		ac1.transfer(ac2,100);

		ac1.displayStatement();
		ac2.displayStatement();
	}
}