package com.prowings.one_to_one_bidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String accountname;
	@Column
	private int accountNumber;
	
	@OneToOne
	private Employee employee;
	
	public Account() {
		super();
	}

	public Account(String accountname, int accountNumber, Employee employee) {
		super();
		this.accountname = accountname;
		this.accountNumber = accountNumber;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountname=" + accountname + ", accountNumber=" + accountNumber + ", employee="
				+ employee + "]";
	}
	 	
	
	
}
