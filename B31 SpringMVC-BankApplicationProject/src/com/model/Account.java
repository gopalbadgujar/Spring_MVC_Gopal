package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private int id;
	private String username;
	private String password;
	private String accNo;
	private String accName;
	private String accAddress;
	private String accEmail;
	private String accPanNumber;
	private long accMobNumber;
	private double initialBalance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccAddress() {
		return accAddress;
	}

	public void setAccAddress(String accAddress) {
		this.accAddress = accAddress;
	}

	public String getAccEmail() {
		return accEmail;
	}

	public void setAccEmail(String accEmail) {
		this.accEmail = accEmail;
	}

	public String getAccPanNumber() {
		return accPanNumber;
	}

	public void setAccPanNumber(String accPanNumber) {
		this.accPanNumber = accPanNumber;
	}

	public long getAccMobNumber() {
		return accMobNumber;
	}

	public void setAccMobNumber(long accMobNumber) {
		this.accMobNumber = accMobNumber;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password + ", accNo=" + accNo
				+ ", accName=" + accName + ", accAddress=" + accAddress + ", accEmail=" + accEmail + ", accPanNumber="
				+ accPanNumber + ", accMobNumber=" + accMobNumber + ", initialBalance=" + initialBalance + "]";
	}

}
