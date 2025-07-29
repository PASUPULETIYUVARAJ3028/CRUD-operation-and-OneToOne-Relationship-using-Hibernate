package com.ManyToManyRelation.task;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Tech_MTM")
public class Tech {
		@Id
		int techId;
		String techName;
		
		@ManyToMany
		List<Trainer> listTrainer;

		public Tech() {
			super();
		}

		public Tech(int techId, String techName, List<Trainer> listTrainer) {
			super();
			this.techId = techId;
			this.techName = techName;
			this.listTrainer = listTrainer;
		}

		public int getTechId() {
			return techId;
		}

		public void setTechId(int techId) {
			this.techId = techId;
		}

		public String getTechName() {
			return techName;
		}

		public void setTechName(String techName) {
			this.techName = techName;
		}

		public List<Trainer> getListTrainer() {
			return listTrainer;
		}

		public void setListTrainer(List<Trainer> listTrainer) {
			this.listTrainer = listTrainer;
		}

		@Override
		public String toString() {
			return "Tech [techId=" + techId + ", techName=" + techName + ", listTrainer=" + listTrainer + "]";
		}
		
}
