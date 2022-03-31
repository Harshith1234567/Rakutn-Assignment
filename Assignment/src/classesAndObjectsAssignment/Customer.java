
package classesAndObjectsAssignment;

public class Customer {
	private int customerID;
	private String customerName, customerAddress, customerPhone, customerEmail;
	private static int counter=1000;
	
	//Getters and Setters.
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	//Constructor.
	public Customer(String customerName, String customerAddress, String customerPhone, String customerEmail) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.customerID = generateID();
	}
	
	//ID Generation.
	private int generateID() {
		return counter++;
	}
	
	//Display Customer Info.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String customerInfo = String.format("Customer ID: %d\nCustomer Name: %s\nCustomer Address: %s\nCustomer Email: %s\nCustomer Phone: %s\n--------------------------------\n", customerID, customerName, customerAddress, customerEmail, customerPhone);
		return customerInfo;
	}
	
	
	
	
}