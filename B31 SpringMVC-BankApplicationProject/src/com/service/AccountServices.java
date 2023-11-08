package com.service;

import java.util.List;

import com.model.Account;

public interface AccountServices {

	void registerAccount(Account a);

	List<Account> getAllAccounts();
	
	List<Account> getUserAccount(String user, String pass);
	
	Account getSingleUser(int id);
	
	void updateData(Account a);
	
	void delAccount(int id);

	
	
	void loginAccount();

//	void displayAccountDetails();

	Account displayBalance(long accNo, String user, String pass);
	Account depositeService(long accNo, String user,String pass, double depositeMoney);
	Account withdrawService(long accNo, String user,String pass, double withdrawMoney);

//	void updateAccount();
//	
//	void deleteAccount();
}
