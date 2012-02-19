package com.skunkworks.ireportcards.data.dto;

import com.skunkworks.ireportcards.entity.Level;
import com.skunkworks.ireportcards.entity.Section;
import com.skunkworks.ireportcards.entity.Teacher;

public class StudentDTO {
	
	private String studentName;
	private String level;
	private String section;
	private String image;
	private Teacher classTeacher;
	
	public Teacher getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "StudentDTO [studentName=" + studentName + ", level=" + level
				+ ", section=" + section + ", image=" + image + "]";
	}

}
