package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountDao;
import com.model.Account;

@Service
public class AccountServicesImpl implements AccountServices {

	@Autowired
	private AccountDao dao;

	@Override
	public void registerAccount(Account a) {

		System.out.println("SErvice layer" + a);

		a.setAccNo(getValidAccountNumber(a));
		a.setAccName(getValidName(a));
		a.setAccAddress(getValidAddress(a));
		a.setAccMobNumber(getValidMobileNumber(a));
		a.setInitialBalance(getValidInitialBalance(a));
//		a.setAccEmail(getValidEmail(a));
//		a.setAccPanNumber(getValidPanNumber(a));

		dao.registerAccountDetails(a);
	}

//	private String getValidPanNumber(Account a) {
//		String panNumber = a.getAccPanNumber();
//		String regex = "[a-z]{5}[0-9]{4}[A-Z]{1}";
//		// String PAN_PATTERN = "[a-z]{5}[0-9]{4}[A-Z]{1}";
//		if (panNumber.matches(regex)) {
//			System.out.println("Invalid PAN");
//			return getValidPanNumber(a);
//		}
//		return panNumber;
//	}

//	private String getValidEmail(Account a) {
//		String email = a.getAccEmail();
//		String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
//		if (email.matches(regex)) {
//			return getValidEmail(a);
//		}
//		return email;
//	}

	private long getValidMobileNumber(Account a) {
		long mobNumber = a.getAccMobNumber();
		String mobNumInString = String.valueOf(mobNumber);
		if (mobNumInString.length() != 10) {
			System.out.println("Invalid Mobile Number, Please try again...");
			return getValidMobileNumber(a);
		}
		return mobNumber;
	}

	private double getValidInitialBalance(Account a) {
		double balance = a.getInitialBalance();
		if (balance < 500) {
			System.out.println("Invalid Balance: Balance cannot be negative.");
			return getValidInitialBalance(a);
		}
		return balance;
	}

	private String getValidAddress(Account a) {
		String address = a.getAccAddress();
		if (address.length() < 3) {
			System.out.println("Invalid Address entered, try again");
			return getValidAddress(a);
		}
		return address;
	}

	private String getValidName(Account a) {
		String name = a.getAccName();
		if (name.length() < 3 || !Character.isUpperCase(name.charAt(0))) {
			System.out.println("Invalid Name entered, try again");
			return getValidName(a);
		}
		return name;
	}

	private String getValidAccountNumber(Account a) {
		String accNumber = a.getAccNo();
		if (accNumber.length() != 5) {
			System.out.println("Invalid Account Number ");
			return getValidAccountNumber(a);
		}
		return accNumber;
	}

	@Override
	public List<Account> getAllAccounts() {

		return dao.getAllUserAccounts();
	}

	@Override
	public List<Account> getUserAccount(String user, String pass) {
		return dao.getSingleAccounts(user, pass);
	}

	@Override
	public Account getSingleUser(int id) {

		return dao.getUser(id);
	}

	@Override
	public void updateData(Account a) {
		dao.updateAccount(a);
	}

	@Override
	public void delAccount(int id) {
		dao.deleteAccount(id);
	}

	@Override
	public void loginAccount() {
		dao.getAllUserAccounts();
	}

	@Override
	public Account displayBalance(long accNo, String user, String pass) {

		return dao.displayBalance(accNo, user, pass);
	}

	@Override
	public Account depositeService(long accNo, String user, String pass, double depositeMoney) {
		return dao.depositeDao(accNo, user, pass, depositeMoney);
	}

	@Override
	public Account withdrawService(long accNo, String user, String pass, double withdrawMoney) {
		return dao.withdrawMoneyDao(accNo, user, pass, withdrawMoney);
	}

}
