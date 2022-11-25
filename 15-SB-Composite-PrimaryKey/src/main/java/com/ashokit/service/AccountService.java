package com.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Account;
import com.ashokit.entity.AccountPK;
import com.ashokit.repository.AccountRepository;
@Service
public class AccountService {
	private AccountRepository accRepo;
	@Autowired
	public AccountService(AccountRepository accRepo) {
		this.accRepo=accRepo;
	}
	public Optional<Account> getAccount(){
		AccountPK accPk=new AccountPK();
		accPk.setAccId(101);
		accPk.setAccType("SAVING");
		accPk.setHolderName("BISWAJIT");
		return accRepo.findById(accPk);
	}
	public void saveAccount() {
		AccountPK accPk=new AccountPK();
		accPk.setAccId(101);
		accPk.setAccType("SAVING");
		accPk.setHolderName("BISWAJIT");
		Account ac=new Account();
		ac.setMinBal(5000.0);
		ac.setBranchName("BAJRAKOTE");
		ac.setAccPk(accPk);
		accRepo.save(ac);
		System.out.println("Account Saving Successful");
	}
	
}
