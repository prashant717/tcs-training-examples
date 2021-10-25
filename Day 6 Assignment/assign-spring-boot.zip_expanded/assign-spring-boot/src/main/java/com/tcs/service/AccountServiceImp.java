package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.beans.Account;
import com.tcs.dao.AccountRepository;
import com.tcs.exceptions.AccountNotFoundExpection;
import com.tcs.exceptions.InsuffBalException;

@Service
public class AccountServiceImp implements AccountService {

	@Autowired
	private AccountRepository dao;
	
	@Override
	@Transactional
	public Account store(Account account) {
		return dao.save(account);
	}

	@Override
	public Account fetchAccountById(int accountId) throws AccountNotFoundExpection {
		Account account = dao.findById(accountId).orElse(null);
		if(a==null)
			throw new AccountNotFoundExpection("Account No. "+accountId+" does not exist");
		
		return account;
	}

	@Override
	@Transactional
	public Account updateAccountPassword(int accountId, String password) throws AccountNotFoundExpection {
		Account account = fetchAccountById(accountId);
		account.setPassword(password);
		return account;
	}
	
	
	@Override
	@Transactional
	public void transferBalance(int accountId1, int accountId2, double amount) throws InsuffBalException, AccountNotFoundExpection {
		
		Account account1 = fetchAccountById(accountId1);
		Account account2 = fetchAccountById(accountId2);
		double bal1 = account1.getBalance();
		if(bal1<amount)
			throw new InsuffBalException("Account No. "+accountId1+" has not sufficient balance");
		double bal2 = account2.getBalance();
		account1.setBalance(bal1 - amount);
		account2.setBalance(bal2 + amount);
	}

	
}
