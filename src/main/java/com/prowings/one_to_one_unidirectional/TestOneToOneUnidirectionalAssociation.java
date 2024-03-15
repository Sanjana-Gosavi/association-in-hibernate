package com.prowings.one_to_one_unidirectional;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;

public class TestOneToOneUnidirectionalAssociation {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tnx = session.beginTransaction();
		
		Passport passport = new Passport();
		passport.setPassportNumber("CKM123");
		
		Person person = new Person();
		person.setName("Ram");
		person.setPassport(passport);
		
		session.save(person);
	
		tnx.commit();
		session.close();
		
	}

}
