package com.prowings.one_to_many_bidirectional;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;

import java.util.HashSet;
import java.util.Set;

public class TestOneToManyBidirectional {
    public static void main(String[] args) {
    	
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction txn = session.beginTransaction();

        Employee employee = new Employee("Ram", 1000011, new HashSet<>());

        // Create set of accounts and associate each account with the employee
        Set<Account> setOfAcc = new HashSet<>();
        
        Account account1 = new Account("Savings", 1234, employee);
        Account account2 = new Account("current", 1235, employee);
        Account account3 = new Account("Salary", 1236, employee);
        setOfAcc.add(account1);
        setOfAcc.add(account2);
        setOfAcc.add(account3);

        // Set the account set to the employee
        employee.setAccount(setOfAcc);

        // Save the employee, which will cascade to save associated accounts
        session.save(employee);

        txn.commit();
        session.close();
    }
}
