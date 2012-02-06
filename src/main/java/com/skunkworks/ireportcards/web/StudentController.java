package com.skunkworks.ireportcards.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skunkworks.ireportcards.data.dao.LevelDao;
import com.skunkworks.ireportcards.data.dao.SectionDao;
import com.skunkworks.ireportcards.data.dao.StudentDao;
import com.skunkworks.ireportcards.data.dto.StudentDTO;
import com.skunkworks.ireportcards.entity.Level;
import com.skunkworks.ireportcards.entity.Section;
import com.skunkworks.ireportcards.entity.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao studentDao;
		
	@RequestMapping(value = "/student/{userName}",headers="Accept=*/*", method = RequestMethod.GET)
	public @ResponseBody StudentDTO getStudentByUsername(@PathVariable String userName){
		Student student = studentDao.getByUsername(userName);
		if(student==null)
			return null;
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setStudentName(student.getName());		
		studentDTO.setSection(student.getSection().getName());
		studentDTO.setLevel(student.getLevel().getName());
		studentDTO.setImage(student.getImage());
		return studentDTO;
	}
}
