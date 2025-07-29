package com.ManyToManyRelation.task;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Trainer_MTM")
public class Trainer {
	@Id
	int trainerId;
	String trainerName;
	
	@ManyToMany
	List<Tech> listTech;
	
	public Trainer() {
		super();
	}

	public Trainer(int trainerId, String trainerName, List<Tech> listTech) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.listTech = listTech;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public List<Tech> getListTech() {
		return listTech;
	}

	public void setListTech(List<Tech> listTech) {
		this.listTech = listTech;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", listTech=" + listTech + "]";
	}

		
}
