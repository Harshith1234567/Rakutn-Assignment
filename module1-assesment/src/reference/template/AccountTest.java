package reference.template;
import java.util.*;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account account;
	String s;

	@Before
	public void init() {
		String name = "Harshith";
		String createdDate = "04/04/22";
		String city = "windsor";
		String state = "ontaria";
		String zipCode = "65451";
		String phoneNumber = "9876543210";
		String houseNumber = "453";
		String street = "Park Lane";
		String type = "SAVINGS";
		String status = "ACTIVE";
		int balance=500;
		account = new Account(name, createdDate, city, state, zipCode, phoneNumber, houseNumber, street, type, status,balance);
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeDeposit() {
		account.deposit(-350);
	}
		
		
		@Test
		public void testDeposit() {
			account.deposit(350);
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void testOverWithdrawal() {
			account.withdraw(3500);
			
		}
		
		@Test
		public void testWithdrawal() {
			account.withdraw(350);
		}

	
		

}
