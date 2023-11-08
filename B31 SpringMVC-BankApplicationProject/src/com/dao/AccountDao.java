package com.dao;

import java.util.List;

import com.model.Account;

public interface AccountDao {
	
	void registerAccountDetails(Account a);
	
	List<Account> getAllUserAccounts();
	
	List<Account> getSingleAccounts(String user, String pass);
	
	Account getUser(int id);
	
	void updateAccount(Account a);

	void deleteAccount(int id);
	
	Account displayBalance(long accNo, String user, String pass);

	Account depositeDao(long accNo, String user, String pass, double depositeMoney);
	
	Account withdrawMoneyDao(long accNo, String user,String pass, double withdrawMoney);


}
