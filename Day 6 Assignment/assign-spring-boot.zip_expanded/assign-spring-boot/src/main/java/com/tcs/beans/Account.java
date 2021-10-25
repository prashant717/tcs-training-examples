package com.tcs.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	
	@Column(name="accountNumber")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNumber;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="dateofBirth")
	private String dateofBirth;
	
	@Column(name="balance")
	private double balance;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accountNumber, String username, String password, String dateofBirth, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
		this.password = password;
		this.dateofBirth = dateofBirth;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	public String getdateofBirth() {
		return dateofBirth;
	}
	public void setdateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
