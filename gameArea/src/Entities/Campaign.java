package Entities;

import java.util.Date;

public class Campaign {
	int id;
	String name;
	int percent;
	Date deadline;
	
	public Campaign(int id, String name, int percent, Date deadline) {
		this.id = id;
		this.name = name;
		this.percent = percent;
		this.deadline = deadline;
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

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
}
