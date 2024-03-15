package com.prowings.one_to_many_bidirectional;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column
	private String name;
	@Column
	private int salary;
	
	 @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	//@JoinColumn(name="EMPLOYEE_ID")
	
	private Set<Account> accounts;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int salary, Set<Account> account) {
		super();
		this.name = name;
		this.salary = salary;
		this.accounts = account;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Account> getAccount() {
		return accounts;
	}

	public void setAccount(Set<Account> account) {
		this.accounts = account;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", account=" + accounts + "]";
	}
}
