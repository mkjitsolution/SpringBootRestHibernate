package com.mkj.restv1.boot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.restv1.boot.dao.InstructorDAO;
import com.mkj.restv1.boot.entity.Instructor;

@RestController
@RequestMapping("/api")
public class InstructorRestController {

	@Autowired
	private InstructorDAO instructorDAO;

	public InstructorRestController(InstructorDAO instructorDAO) {
		super();
		this.instructorDAO = instructorDAO;
	}
	
	
	@GetMapping("/instructors")
	public List<Instructor> getInstructors()
	{
		return instructorDAO.getAllInstructors();
	}
	
}
