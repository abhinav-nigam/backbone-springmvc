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
}
