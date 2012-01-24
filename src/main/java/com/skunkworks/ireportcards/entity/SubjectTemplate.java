package com.skunkworks.ireportcards.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubjectTemplate {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@ManyToOne
	private Teacher teacher;
	
	private Marking marking;
	
	private boolean usedInAggregates;
	
	private int practicalWeightage;
	
	private int attendanceWeightage;
	
	private int assignmentWeightage;

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Marking getMarking() {
		return marking;
	}

	public void setMarking(Marking marking) {
		this.marking = marking;
	}

	public boolean isUsedInAggregates() {
		return usedInAggregates;
	}

	public void setUsedInAggregates(boolean usedInAggregates) {
		this.usedInAggregates = usedInAggregates;
	}

	public int getPracticalWeightage() {
		return practicalWeightage;
	}

	public void setPracticalWeightage(int practicalWeightage) {
		this.practicalWeightage = practicalWeightage;
	}

	public int getAttendanceWeightage() {
		return attendanceWeightage;
	}

	public void setAttendanceWeightage(int attendanceWeightage) {
		this.attendanceWeightage = attendanceWeightage;
	}

	public int getAssignmentWeightage() {
		return assignmentWeightage;
	}

	public void setAssignmentWeightage(int assignmentWeightage) {
		this.assignmentWeightage = assignmentWeightage;
	}

	@Override
	public String toString() {
		return "SubjectTemplate [id=" + id + ", name=" + name + ", teacher="
				+ teacher + ", marking=" + marking + ", usedInAggregates="
				+ usedInAggregates + ", practicalWeightage="
				+ practicalWeightage + ", attendanceWeightage="
				+ attendanceWeightage + ", assignmentWeightage="
				+ assignmentWeightage + "]";
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
		SubjectTemplate other = (SubjectTemplate) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
