package com.OneToManyRelation.task;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Person_MTO")
public class Person {
	@Id
	int id;
	String name;
	
	// onw person has many bikes that is why using the list to store each person data.
	@OneToMany
	List<Bike> bikesList;

	public Person() {
		super();
	}

	public Person(int id, String name, List<Bike> bikesList) {
		super();
		this.id = id;
		this.name = name;
		this.bikesList = bikesList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Bike> getBikesList() {
		return bikesList;
	}

	public void setBikesList(List<Bike> bikesList) {
		this.bikesList = bikesList;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", bikesList=" + bikesList + "]";
	}
	
}
