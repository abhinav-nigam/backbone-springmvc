package com.skunkworks.ireportcards.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TerminalTemplate {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Date startDate;
	
	private Date endDate;
	
	private int totalDays;
	
	private int weightageInFinalAggregation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public int getWeightageInFinalAggregation() {
		return weightageInFinalAggregation;
	}

	public void setWeightageInFinalAggregation(int weightageInFinalAggregation) {
		this.weightageInFinalAggregation = weightageInFinalAggregation;
	}

	@Override
	public String toString() {
		return "TerminalTemplate [id=" + id + ", name=" + name + ", startDate="
				+ startDate + ", endDate=" + endDate + ", totalDays="
				+ totalDays + ", weightageInFinalAggregation="
				+ weightageInFinalAggregation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TerminalTemplate other = (TerminalTemplate) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
