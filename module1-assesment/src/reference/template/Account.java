package reference.template;


import java.util.*;


public class Account {
	
	private Type accountType;
	private static int counter = 20000;
	private int accountNumber;
	private String ownerName;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String houseNumber;
	private String street;
	private int balance;
	private String createdDate;
	
	private Status accountStatus;
	
	
	
	//getter  for account type like Savings ,Demat and Current
	public Type getAccountType() {
		return accountType;
	}

	
	
	//getter and setter for account number
	public int getAccountNumber() {
		return accountNumber;
	}
	
	

	//getter and setter for ownerName
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	
	public String getDetails() {
		String data = "Name : " + ownerName + "\n" + "Account Number : " + accountNumber + "\n" + "Account Type : " + accountType
				+ "\n" + "Mobile Number :" + phoneNumber + "\n" + "House Number : " + houseNumber + "\n" + "Street : "
				+ street + "\n" + "City : " + city + "\n" + "State : " + state + "\n" + "Zip Code : " + zipCode + "\n";

		return data;
	}
	
	
	
	//getter  for Balance
	public int getBalance() {//
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//getter  setting the credited date
	public String getCreatedDate() {
		return createdDate;
	}

	

	
	//getterfor setting account status as active inactive or closed
	public Status getAccountStatus() {//
		return accountStatus;
	}

	public void setAccountStatus(Status accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	private int generateAccountNumber() {//
		return counter++;
	}
	
	//initiated at the data.java
	public Account(String ownerName, String createdDate, String city, String state, String zipCode, String phoneNumber,
			String houseNumber, String street,  
			String accountType, String accountStatus,int balance) {
		super();
		this.ownerName = ownerName;
		//this.address = address;
		
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.houseNumber = houseNumber;
		this.street = street;
		this.balance = balance;
		this.createdDate = createdDate;
		this.accountType = Type.valueOf(accountType);
		this.accountStatus = Status.valueOf(accountStatus);
		this.accountNumber = generateAccountNumber();
	}
	
	
	
	
	
	// we are making sure that we are only withdrawing the amount which is less than the deposited amount
	public int withdraw(int amount) {
		if(amount > this.getBalance()) {
			throw new IllegalArgumentException("Low Balance, the current balance is " + this.getBalance());
		}
		
		this.setBalance(this.getBalance() - amount);
		return this.getBalance();
	}
	//we are making sure that the amount entered is  not negative
	public int deposit(int amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Amount should not be negative or Zero, the entered amount is " + amount);
		}
		this.setBalance( amount + this.getBalance() );
		return this.getBalance();
	}  
	
}