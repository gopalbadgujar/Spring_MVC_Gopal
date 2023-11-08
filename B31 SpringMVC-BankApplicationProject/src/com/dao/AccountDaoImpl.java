package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void registerAccountDetails(Account a) {
		System.out.println("dao layer"+a);
		Session session = sf.openSession();
		session.save(a);
		session.beginTransaction().commit();
	}

	@Override
	public List<Account> getAllUserAccounts() {
		Session session = sf.openSession();
		Query<Account> q = session.createQuery("from Account");
		List<Account> alist = q.getResultList();
		return alist;
	}

	@Override
	public List<Account> getSingleAccounts(String user, String pass) {
		Session session = sf.openSession();
		Query<Account> q = session.createQuery("from Account where username=:id and password=:passwd");
		q.setParameter("id", user);
		q.setParameter("passwd", pass);
		List<Account> a = q.getResultList();
		return a;
	}

	@Override
	public Account getUser(int id) {
		Session session = sf.openSession();
		Account a = session.get(Account.class, id);
		return a;
	}

	@Override
	public void updateAccount(Account a) {
		Session session = sf.openSession();
		session.update(a);
		session.beginTransaction().commit();
	}

	@Override
	public void deleteAccount(int id) {
		Session session = sf.openSession();
		Account a = session.get(Account.class, id);
		session.delete(a);
		session.beginTransaction().commit();
	}

	@Override
	public Account displayBalance(long accNo, String user, String pass) {
		Session session = sf.openSession();
		Query<Account> q = session.createQuery("from Account where accNo=:ac and username=:id and password=:passwd");
		q.setParameter("ac", accNo);
		q.setParameter("id", user);
		q.setParameter("passwd", pass);
		Account a = q.getSingleResult();
		return a;
	}

	@Override
	public Account depositeDao(long accNo, String user, String pass, double depositeMoney) {
		Session session = sf.openSession();

		Query<Account> q = session
				.createQuery("from Account where accNo=:ac and username=:id and password=:passwd");
		q.setParameter("ac", accNo);
		q.setParameter("id", user);
		q.setParameter("passwd", pass);
		Account a = q.getSingleResult();
		if (a != null) {
			a.setInitialBalance(a.getInitialBalance() + depositeMoney);
			session.update(a);
			session.save(a);
			session.beginTransaction().commit();

			System.out.println("Successfully deposite");

		}
		return a;
	}

	@Override
	public Account withdrawMoneyDao(long accNo, String user, String pass, double withdrawMoney) {
		Session session = sf.openSession();

		Query<Account> q = session
				.createQuery("from Account where accNo=:ac and username=:user and password=:pass");
		q.setParameter("ac", accNo);
		q.setParameter("user", user);
		q.setParameter("pass", pass);
		Account a = q.getSingleResult();

		if (a != null) {
			a.setInitialBalance(a.getInitialBalance() - withdrawMoney);
			session.update(a);
			session.save(a);
			session.beginTransaction().commit();
		}
		return a;
	}
}