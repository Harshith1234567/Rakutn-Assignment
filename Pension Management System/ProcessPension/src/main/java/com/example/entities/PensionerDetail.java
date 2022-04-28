package com.example.entities;

import java.math.BigInteger;
import java.util.Date;

public class PensionerDetail {
	
	public enum PensionClassification {
		SELF, FAMILY
	}
	
	private String name, pan;
	private Date date_of_birth;
	private BigInteger salary_earned, allowances, aadhar_number;
	private PensionClassification pension_type;
	private BankDetail bank_detail;
	
	private PensionDetail pension_detail;
	public PensionDetail getPension_detail() {
		return pension_detail;
	}
	public void setPension_detail(PensionDetail pension_detail) {
		this.pension_detail = pension_detail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public BigInteger getSalary_earned() {
		return salary_earned;
	}
	public void setSalary_earned(BigInteger salary_earned) {
		this.salary_earned = salary_earned;
	}
	public BigInteger getAllowances() {
		return allowances;
	}
	public void setAllowances(BigInteger allowances) {
		this.allowances = allowances;
	}
	public BigInteger getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(BigInteger aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public PensionClassification getPension_type() {
		return pension_type;
	}
	public void setPension_type(PensionClassification pension_type) {
		this.pension_type = pension_type;
	}
	public BankDetail getBank_detail() {
		return bank_detail;
	}
	public void setBank_detail(BankDetail bank_detail) {
		this.bank_detail = bank_detail;
	}
	
	
}
