package com.lti.model;

public class Questions {
	
	int question_id;
	String question_desc;
	int technology_id;
	int level_id;
	
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Questions(int question_id, String question_desc, int technology_id, int level_id) {
		super();
		this.question_id = question_id;
		this.question_desc = question_desc;
		this.technology_id = technology_id;
		this.level_id = level_id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion_desc() {
		return question_desc;
	}

	public void setQuestion_desc(String question_desc) {
		this.question_desc = question_desc;
	}

	public int getTechnology_id() {
		return technology_id;
	}

	public void setTechnology_id(int technology_id) {
		this.technology_id = technology_id;
	}

	public int getLevel_id() {
		return level_id;
	}

	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}

	@Override
	public String toString() {
		return "Questions [question_id=" + question_id + ", question_desc=" + question_desc + ", technology_id="
				+ technology_id + ", level_id=" + level_id + "]";
	}

	
	
	
	

}
