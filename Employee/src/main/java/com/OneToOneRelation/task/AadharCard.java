package com.OneToOneRelation.task;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AadharCard {
	@Id
	int addnum;
	String name;
	String address;
	String gender;
	
	@OneToOne
	Person person;

	public AadharCard() {
		super();
	}

	public AadharCard(int addnum, String name, String address, String gender, Person person) {
		super();
		this.addnum = addnum;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.person = person;
	}

	public int getAddnum() {
		return addnum;
	}

	public void setAddnum(int addnum) {
		this.addnum = addnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "AadharCard [addnum=" + addnum + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", person=" + person + "]";
	}
	
	
	
}
