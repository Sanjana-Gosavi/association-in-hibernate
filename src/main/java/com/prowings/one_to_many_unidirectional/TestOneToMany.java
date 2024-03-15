package com.prowings.one_to_many_unidirectional;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestOneToMany {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        

        Employee emp1 = new Employee("abhi");
        Employee emp2 = new Employee("baba");
        Employee emp = new Employee("sai");
        
        
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp);
        
        
        Department dept = new Department("Engg" , employees);
        
        
        session.save(emp);
        session.save(emp1);
        session.save(emp2);
        session.save(dept);
        
        transaction.commit();
        session.close();
    }
}
