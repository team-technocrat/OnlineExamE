package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Levels")
public class Levels 
{
	@Id @GeneratedValue
	int level_id;
	int technology_id;
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}
	public int getTechnology_id() {
		return technology_id;
	}
	public void setTechnology_id(int technology_id) {
		this.technology_id = technology_id;
	}
	public Levels(int level_id, int technology_id) {
		super();
		this.level_id = level_id;
		this.technology_id = technology_id;
	}
	public Levels() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Levels [level_id=" + level_id + ", technology_id=" + technology_id + "]";
	}
	
	
	
	

}
