package com.init;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Account;
import com.service.AccountServices;

@Controller
public class BankApplicationSystem {

	@Autowired
	private AccountServices service;

	@RequestMapping(value = "/")
	public String homePageCalled() {

		return "home";
	}

	@RequestMapping(value = "/log")
	public String loginCredential(@RequestParam String username,
			@RequestParam String password, Model m) {

		if (username.equals("Admin") && password.equals("admin@123")) {
			
			List<Account> listAcc = service.getAllAccounts();
			m.addAttribute("listAcc", listAcc);
			return "details";
		} else {
			List<Account> listAcc = service.getUserAccount(username, password);
			
			for(Account al:listAcc) {
				
				if(listAcc != null && username.equals(al.getUsername()) && password.equals(al.getPassword() )) {
					
					m.addAttribute("listAcc", listAcc);
					return "details";
				}
			}		
		}
		m.addAttribute("msg", "You have entered wrong Credentials, Try again...");
		return "invalid"; 
	}

	@RequestMapping(value = "/reg")
	public String registerDetails(@ModelAttribute Account a, Model m) {

		System.out.println(a);
		service.registerAccount(a);

		return "success";
	}

	@RequestMapping(value = "edit")
	public String editAction(@RequestParam int id, Model m) {

		Account a = service.getSingleUser(id);
		m.addAttribute("account", a);
		return "edit";
	}

	@RequestMapping(value = "up")
	public String updateAction(@ModelAttribute Account a) {

		service.updateData(a);
		return "index";
	}

	@RequestMapping(value = "del")
	public String deleteAction(@RequestParam int id, Model m) {

		service.delAccount(id);

		return "index";
	}

	@RequestMapping(value = "balance")
	public String balance(@RequestParam long accNo, @RequestParam String username, @RequestParam String password,
			Model m) {
		Account a = service.displayBalance(accNo, username, password);
		m.addAttribute("bal", a);
		return "successbalance";
	}

	@RequestMapping(value = "deposit")
	public String deposit(@RequestParam long accNo, @RequestParam String username, @RequestParam String password,
			@RequestParam double depositMoney, Model m) {
		Account accDepositMoney = service.depositeService(accNo, username, password, depositMoney);
		m.addAttribute("accDepositMoney", accDepositMoney);
		return "successdeposit";
	}

	@RequestMapping(value = "/withdraw")
	public String withdrawService(@RequestParam long accNo,@RequestParam String username, @RequestParam String password, @RequestParam double withdrawMoney , Model m) {
		
		Account acc = service.withdrawService(accNo, username, password,withdrawMoney );
		m.addAttribute("acc", acc);
		return "successwithdraw";
	}
}
