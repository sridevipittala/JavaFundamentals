/*
Abstract Classes — Payment Processing
Payment (Abstract Superclass): Include amount (double) and payerName (String).
Create an abstract method: processPayment().
Create a concrete method: displayReceipt() that prints the payer, amount, and payment status.
CashPayment (Subclass): Override processPayment() to print "Cash payment of Rs.[amount] received."
CardPayment (Subclass): Add cardNumber (store/show only the last 4 digits) and bankName. Override processPayment().
UPIPayment (Subclass): Add upiId. Override processPayment() to simulate processing (print "Processing..." followed by "Success").
EMIPayment (Subclass): Add months (int). Override processPayment() to calculate and print the monthly installment amount.

Testing (in main): * Create a Payment[] array containing one of 
each concrete payment type. Loop through,
calling processPayment() and displayReceipt() for each.

Question: Try typing Payment p = new Payment(); in your code. It will give a compile error. Add a comment in your code explaining exactly why this error occurs.*
*/
abstract class Payment{
	String payerName;
	double amount;

	Payment(String payerName,double amount){
		this.payerName=payerName;
		this.amount=amount;
	}
	abstract public void processPayment();

	public void displayReceipt(){
		//prints the payer, amount, and payment statu
		System.out.println("Payer: "+payerName);
		System.out.println("Amount: "+amount);		
	}

}
class CashPayment extends Payment{
	CashPayment(String payerName,double amount){
		super(payerName,amount);
	}
	public void processPayment(){
		System.out.println("Cash payment of Rs."+amount +"received.");
	}
}

//CardPayment (Subclass): Add cardNumber (store/show only the last 4 digits) and bankName. Override processPayment().

class CardPayment extends Payment{
	String cardNumber;
	String bankName;
	CardPayment(String payerName,double amount,String cardNumber,String bankName){
		super(payerName,amount);
		this.cardNumber=cardNumber;
		this.bankName=bankName;
	}
	public void processPayment(){
		//System.out.println("Card:"+cardNumber);
		System.out.println(amount + " received from the credit Card xxxx xxxx xxxx "+cardNumber.substring(12));
	}
}

//UPIPayment (Subclass): Add upiId. Override processPayment() to simulate processing (print "Processing..." followed by "Success").

class UPIPayment extends Payment{
	String upiId;
	UPIPayment(String payerName,double amount){
		super(payerName,amount);
	}
	
	public void processPayment(){
		System.out.println("Processing...\nSuccess");
	}
}
//EMIPayment (Subclass): Add months (int). Override processPayment() to //calculate and print the monthly installment amount.
class EMIPayment extends Payment{
	int months;
	EMIPayment (String payerName,double amount,int months){
		super(payerName,amount);
		this.months=months;
	}
	public void processPayment(){
		System.out.println("the monthly installment amount:Rs."+(amount/months));
	}
}

class PaymentTesting{
	public static void main(String args[]){
	
	Payment[] payments=new Payment[4];
	payments[0]=new CashPayment("Sridevi",250000);
	payments[1]=new CardPayment("Sridevi",250000,"ASDE123443215678","UCOBank");
	payments[2]=new UPIPayment("Sridevi",250000);
	payments[3]=new EMIPayment("Sridevi",250000,10);

	for(Payment payment:payments){
		payment.displayReceipt();
		payment.processPayment();
		System.out.println("");
	}

	}
}