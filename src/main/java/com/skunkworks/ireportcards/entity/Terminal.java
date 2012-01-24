package com.skunkworks.ireportcards.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Terminal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private TerminalTemplate terminalTemplate;
	
	private String score;
	
	private int noOfDaysAttended;
	
	@Lob
	private String teacherRemark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TerminalTemplate getTerminalTemplate() {
		return terminalTemplate;
	}

	public void setTerminalTemplate(TerminalTemplate terminalTemplate) {
		this.terminalTemplate = terminalTemplate;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public int getNoOfDaysAttended() {
		return noOfDaysAttended;
	}

	public void setNoOfDaysAttended(int noOfDaysAttended) {
		this.noOfDaysAttended = noOfDaysAttended;
	}

	public String getTeacherRemark() {
		return teacherRemark;
	}

	public void setTeacherRemark(String teacherRemark) {
		this.teacherRemark = teacherRemark;
	}

	@Override
	public String toString() {
		return "Terminal [id=" + id + ", terminalTemplate=" + terminalTemplate
				+ ", score=" + score + ", noOfDaysAttended=" + noOfDaysAttended
				+ ", teacherRemark=" + teacherRemark + "]";
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
		Terminal other = (Terminal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
