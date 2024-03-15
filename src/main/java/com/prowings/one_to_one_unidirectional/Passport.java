package com.prowings.one_to_one_unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "passId")
	    private int passId;
	
	private String passportNumber;

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passport(String passportNumber) {
		super();
		this.passportNumber = passportNumber;
	}

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	@Override
	public String toString() {
		return "Passport [passId=" + passId + ", passportNumber=" + passportNumber + "]";
	}
}
