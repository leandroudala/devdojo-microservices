package app.udala.devdojo.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.udala.devdojo.core.model.Course;
import app.udala.devdojo.core.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	public Iterable<Course> list(Pageable pageable) {
		log.info("Retrieving all courses");
		return courseRepository.findAll(pageable);
	}
}
