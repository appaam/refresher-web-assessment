package com.sapient.aem.model;

import java.time.LocalDate;

public class Person {
	private Long adharCard;
	private String name;
	private LocalDate birthdate;
	private String address;
	private String email;
	private Long mobile;
	
	public Person() {
		
	}

	public Person(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}

	public Long getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(Long adharCard) {
		this.adharCard = adharCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "\nAdharCard=" + adharCard + "\nName=" + name + "\nBirthdate=" + birthdate + "\nAddress=" + address
				+ "\nEmail=" + email + "\nMobile=" + mobile;
	}
	
	
}

