package com.skunkworks.ireportcards.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Section {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@ManyToMany
	private Set<SubjectTemplate> subjectTemplates;
	
	@ManyToOne
	private Teacher classTeacher;
	
	@OneToMany
	private Set<Student> students;
	
	@ManyToMany
	private Set<TerminalTemplate> terminalTemplates;
	
	private int totalDays;

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

	public Set<SubjectTemplate> getSubjectTemplates() {
		return subjectTemplates;
	}

	public void setSubjectTemplates(Set<SubjectTemplate> subjectTemplates) {
		this.subjectTemplates = subjectTemplates;
	}

	public Teacher getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<TerminalTemplate> getTerminalTemplates() {
		return terminalTemplates;
	}

	public void setTerminalTemplates(Set<TerminalTemplate> terminalTemplates) {
		this.terminalTemplates = terminalTemplates;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	@Override
	public String toString() {
		return "Section [id=" + id + ", name=" + name + ", subjectTemplates="
				+ subjectTemplates + ", classTeacher=" + classTeacher
				+ ", students=" + students + ", terminalTemplates="
				+ terminalTemplates + ", totalDays=" + totalDays + "]";
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
		Section other = (Section) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
