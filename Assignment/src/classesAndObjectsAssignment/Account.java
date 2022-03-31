package classesAndObjectsAssignment;

enum TYPE{
	SB, FD;
}
public class Account {
	
	private static int counter = 100000;
	private int accountNumber;
	private String openingDate;
	private TYPE type;
	private double balance;
	private Customer customer;
	
	//Getters and Setters
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	//Generate Account ID.
	private int generateAccountNumber() {
		return counter++;
	}
	
	//Constructor.
	public Account(String openingDate, TYPE type, double balance, Customer customer) {
		super();
		this.openingDate = openingDate;
		this.type = type;
		this.balance = balance;
		this.customer = customer;
		this.accountNumber = generateAccountNumber();
	}
	
	//Displays Account Info.
	@Override
	public String toString() {
		String accountInfo = String.format("Account Number: %d\nCustomer ID: %d\nAccount Type: %s\nAccount Creation Date: %s\nAccount Balance: %f\n--------------------------------\n", accountNumber, customer.getCustomerID(), type, openingDate, balance);
		return accountInfo;
	}
	
	
}