package com.code.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CourseCotroller {

	@GetMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(1, "Learn AWS", "rahul"),
				new Course(2, "Learn sping boot", "rahul"));
	}

}
