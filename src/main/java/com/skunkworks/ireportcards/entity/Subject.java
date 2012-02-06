package com.skunkworks.ireportcards.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private SubjectTemplate subjectTemplate;
	
	private int attendance;
	
	@ManyToMany
	private Set<Terminal> terminals;
	
	private int marksForAttendance;
	
	private int marksForPracticals;
	
	private int marksForAssignment;
	
	@Lob
	private String teacherRemarks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SubjectTemplate getSubjectTemplate() {
		return subjectTemplate;
	}

	public void setSubjectTemplate(SubjectTemplate subjectTemplate) {
		this.subjectTemplate = subjectTemplate;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public Set<Terminal> getTerminals() {
		return terminals;
	}

	public void setTerminals(Set<Terminal> terminals) {
		this.terminals = terminals;
	}

	public int getMarksForAttendance() {
		return marksForAttendance;
	}

	public void setMarksForAttendance(int marksForAttendance) {
		this.marksForAttendance = marksForAttendance;
	}

	public int getMarksForPracticals() {
		return marksForPracticals;
	}

	public void setMarksForPracticals(int marksForPracticals) {
		this.marksForPracticals = marksForPracticals;
	}

	public int getMarksForAssignment() {
		return marksForAssignment;
	}

	public void setMarksForAssignment(int marksForAssignment) {
		this.marksForAssignment = marksForAssignment;
	}

	public String getTeacherRemarks() {
		return teacherRemarks;
	}

	public void setTeacherRemarks(String teacherRemarks) {
		this.teacherRemarks = teacherRemarks;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", subjectTemplate=" + subjectTemplate
				+ ", attendance=" + attendance
				+ ", marksForAttendance=" + marksForAttendance
				+ ", marksForPracticals=" + marksForPracticals
				+ ", marksForAssignment=" + marksForAssignment
				+ ", teacherRemarks=" + teacherRemarks + "]";
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
		Subject other = (Subject) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
