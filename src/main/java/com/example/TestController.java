package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value = "/student1")
	public StudentDto test () {
		StudentDto studentDto = new StudentDto();
		studentDto.setName("yuna");
		studentDto.setAge(20);
		studentDto.setJavaGrade("A+");
		studentDto.setOracleGrade("C");
		
		return studentDto;
	}
	
	@GetMapping(value = "/student2")
	public StudentDto test2 () {
		StudentDto studentDto2 = new StudentDto();
		studentDto2.setName("jimin");
		studentDto2.setAge(21);
		studentDto2.setJavaGrade("B+");
		studentDto2.setOracleGrade("F");
		
		return studentDto2;
	}

}

