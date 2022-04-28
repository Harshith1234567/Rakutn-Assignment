package com.example.entities;

import java.math.BigInteger;

public class BankDetail {
	
	public enum BankType {
		PRIVATE, PUBLIC
	}
	
	private String bank_name;
	private BigInteger account_number;
	private BankType bank_type;
	
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public BigInteger getAccount_number() {
		return account_number;
	}
	public void setAccount_number(BigInteger account_number) {
		this.account_number = account_number;
	}
	public BankType getBank_type() {
		return bank_type;
	}
	public void setBank_type(BankType bank_type) {
		this.bank_type = bank_type;
	}
	
	
}
