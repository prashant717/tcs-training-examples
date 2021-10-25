package com.tcs.service;
import com.tcs.beans.Account;
import com.tcs.exceptions.*;


public interface AccountService {
	public Account store(Account account);
	public Account fetchAccountById(int accountId) throws AccountNotFoundExpection;
	public Account updateAccountPassword(int accountId, String password) throws AccountNotFoundExpection;
	public void transferBalance(int accountId1, int accountId2, double amount) throws InsuffBalException, AccountNotFoundExpection;
	
}
