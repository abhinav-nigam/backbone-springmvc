package com.skunkworks.ireportcards.loader;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skunkworks.ireportcards.data.dao.LevelDao;
import com.skunkworks.ireportcards.data.dao.ParentDao;
import com.skunkworks.ireportcards.data.dao.SectionDao;
import com.skunkworks.ireportcards.data.dao.StudentDao;
import com.skunkworks.ireportcards.data.dao.SubjectDao;
import com.skunkworks.ireportcards.data.dao.SubjectTemplateDao;
import com.skunkworks.ireportcards.data.dao.TeacherDao;
import com.skunkworks.ireportcards.data.dao.TerminalDao;
import com.skunkworks.ireportcards.data.dao.TerminalTemplateDao;
import com.skunkworks.ireportcards.data.dao.UserDao;
import com.skunkworks.ireportcards.entity.Level;
import com.skunkworks.ireportcards.entity.Marking;
import com.skunkworks.ireportcards.entity.Parent;
import com.skunkworks.ireportcards.entity.Section;
import com.skunkworks.ireportcards.entity.Student;
import com.skunkworks.ireportcards.entity.Subject;
import com.skunkworks.ireportcards.entity.SubjectTemplate;
import com.skunkworks.ireportcards.entity.Teacher;
import com.skunkworks.ireportcards.entity.Terminal;
import com.skunkworks.ireportcards.entity.TerminalTemplate;
import com.skunkworks.ireportcards.entity.User;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	LevelDao levelDao;
	
	@Autowired
	SectionDao sectionDao;
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	SubjectDao subjectDao;
	
	@Autowired
	SubjectTemplateDao subjectTemplateDao;
	
	@Autowired
	TerminalTemplateDao terminalTemplateDao;
	
	@Autowired
	TerminalDao terminalDao;
	
	@Autowired
	ParentDao parentDao;
	
	@Autowired
	TeacherDao teacherDao;
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		User testUser1 = new User();
		testUser1.setUserName("teststudent1");
		testUser1.setAge(25);
		
		userDao.save(testUser1);
		
		User testUser2 = new User();
		testUser2.setUserName("testparent1");
		testUser2.setAge(50);
		
		userDao.save(testUser2);
		
		User testUser3 = new User();
		testUser3.setUserName("testteacher1");
		testUser3.setAge(35);
		
		userDao.save(testUser3);
		
		Parent parent1 = new Parent();
		parent1.setName("Ravindra Jadeja");
		parent1.setEmailId("ravindra.jadeja@gmail.com");
		parent1.setPhoneNo(Long.parseLong("8275756255"));
		parent1.setUser(testUser2);
		
		parentDao.save(parent1);
		
		Teacher teacher1 = new Teacher();
		teacher1.setFirstName("Virendar");
		teacher1.setLastName("Sehwag");
		teacher1.setEmailId("virendar.sehwag@gmail.com");
		teacher1.setPhoneNo(Long.parseLong("9886588487"));
		teacher1.setImage("resources/images/teacher1.jpg");
		teacher1.setUser(testUser3);
		
		teacherDao.save(teacher1);
		
		TerminalTemplate terminalTemplate1 = new TerminalTemplate();
		terminalTemplate1.setEndDate(new Date(2011,9,30));
		terminalTemplate1.setName("first terminal");
		terminalTemplate1.setStartDate(new Date(2011,6,1));
		terminalTemplate1.setTotalDays(terminalTemplate1.getEndDate().compareTo(terminalTemplate1.getStartDate()));
		terminalTemplate1.setWeightageInFinalAggregation(10);
		
		Terminal terminal1 = new Terminal();
		terminal1.setNoOfDaysAttended(60);
		terminal1.setScore("70");
		terminal1.setTeacherRemark("Scope for improvement");
		terminal1.setTerminalTemplate(terminalTemplate1);
		
		TerminalTemplate terminalTemplate2 = new TerminalTemplate();
		terminalTemplate2.setEndDate(new Date(2011,10,01));
		terminalTemplate2.setName("second terminal");
		terminalTemplate2.setStartDate(new Date(2011,12,31));
		terminalTemplate2.setTotalDays(terminalTemplate2.getEndDate().compareTo(terminalTemplate2.getStartDate()));
		terminalTemplate2.setWeightageInFinalAggregation(20);
		
		Terminal terminal2 = new Terminal();
		terminal2.setNoOfDaysAttended(70);
		terminal2.setScore("80");
		terminal2.setTeacherRemark("Well Done!");
		terminal2.setTerminalTemplate(terminalTemplate2);
		
		TerminalTemplate terminalTemplate3 = new TerminalTemplate();
		terminalTemplate3.setEndDate(new Date(2012,1,1));
		terminalTemplate3.setName("final terminal");
		terminalTemplate3.setStartDate(new Date(2012,3,31));
		terminalTemplate3.setTotalDays(terminalTemplate3.getEndDate().compareTo(terminalTemplate3.getStartDate()));
		terminalTemplate3.setWeightageInFinalAggregation(70);
		
		Terminal terminal3 = new Terminal();
		terminal3.setNoOfDaysAttended(65);
		terminal3.setScore("75");
		terminal3.setTeacherRemark("More effort required");
		terminal3.setTerminalTemplate(terminalTemplate3);
		
		terminalTemplateDao.save(terminalTemplate1);
		terminalTemplateDao.save(terminalTemplate2);
		terminalTemplateDao.save(terminalTemplate3);
		
		terminalDao.save(terminal1);
		terminalDao.save(terminal2);
		terminalDao.save(terminal3);
		
		Set<Terminal> terminals1 = new HashSet<Terminal>();
		terminals1.add(terminal1);
		terminals1.add(terminal2);
		terminals1.add(terminal3);
		
		Set<TerminalTemplate> terminalTemplates1 = new HashSet<TerminalTemplate>();
		terminalTemplates1.add(terminalTemplate1);
		terminalTemplates1.add(terminalTemplate2);
		terminalTemplates1.add(terminalTemplate3);
		
		SubjectTemplate subjectTemplate1 = new SubjectTemplate();
		subjectTemplate1.setName("English");
		subjectTemplate1.setAssignmentWeightage(10);
		subjectTemplate1.setAttendanceWeightage(5);
		subjectTemplate1.setMarking(Marking.MARKS);
		subjectTemplate1.setPracticalWeightage(0);
		subjectTemplate1.setTeacher(teacher1);
		subjectTemplate1.setUsedInAggregates(true);
		
		subjectTemplateDao.save(subjectTemplate1);
		
		Subject subject1 = new Subject();
		subject1.setAttendance(90);
		subject1.setMarksForAssignment(82);
		subject1.setMarksForAttendance(90);
		subject1.setMarksForPracticals(0);
		subject1.setSubjectTemplate(subjectTemplate1);
		subject1.setTeacherRemarks("Well done, try to improve attendance");
		subject1.setTerminals(terminals1);

		subjectDao.save(subject1);
		
		Set<Subject> subjects1 = new HashSet<Subject>();
		subjects1.add(subject1);
		
		Student student1 = new Student();
		student1.setName("George Bailey");
		student1.setParent(parent1);
		student1.setSubjects(subjects1);
		student1.setUser(testUser1);
		student1.setImage("resources/images/student.jpeg");
		
		studentDao.save(student1);
		
		Set<Student> students1 = new HashSet<Student>();
		students1.add(student1);
		
		Set<SubjectTemplate> subjectTemplates1 = new HashSet<SubjectTemplate>();
		subjectTemplates1.add(subjectTemplate1);
		
		Section section1 = new Section();
		section1.setClassTeacher(teacher1);
		section1.setName("B");
		section1.setStudents(students1);
		section1.setSubjectTemplates(subjectTemplates1);
		section1.setTerminalTemplates(terminalTemplates1);
		section1.setTotalDays(terminalTemplate3.getEndDate().compareTo(terminalTemplate1.getStartDate()));
		sectionDao.save(section1);

		Set<Section> sections1 = new HashSet<Section>();
		sections1.add(section1);
		
		Level level1 = new Level();
		level1.setName("11");
		level1.setSections(sections1);
		
		levelDao.save(level1);
		
		student1.setLevel(level1);
		student1.setSection(section1);
		studentDao.save(student1);
	}

	
	
}
