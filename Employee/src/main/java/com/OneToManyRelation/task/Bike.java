package com.OneToManyRelation.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bike_MTO")
public class Bike {
	@Id
	int modelNum;
	@Column(nullable = false)
	String brand;
	@Column(nullable = false)
	int price;
	
	@ManyToOne
	Person person;
	
	// no-argu constructor need for hibernate
	public Bike() {
		super();
	}

	// constructor
	public Bike(int modelNum, String brand, int price, Person person) {
		super();
		this.modelNum = modelNum;
		this.brand = brand;
		this.price = price;
		this.person = person;
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [modelNum=" + modelNum + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
