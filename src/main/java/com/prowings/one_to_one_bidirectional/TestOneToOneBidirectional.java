package com.prowings.one_to_one_bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOneBidirectional {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setName("Ram");
		employee.setSalary(123456);
		
		Account account = new Account();
		account.setAccountname("Savings");
		account.setAccountNumber(1111);
		
		employee.setAccount(account);
		account.setEmployee(employee);
		
		session.save(account);
		session.save(employee);
		
		tnx.commit();
		session.close();
		factory.close();
		
	}

}
