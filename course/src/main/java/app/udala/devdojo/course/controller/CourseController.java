package app.udala.devdojo.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.udala.devdojo.core.model.Course;
import app.udala.devdojo.course.service.CourseService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/admin/course")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {
	private final CourseService courseService;
	
	@GetMapping()
	public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
		return ResponseEntity.ok(courseService.list(pageable));
	}
}
