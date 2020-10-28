package app.udala.devdojo.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import app.udala.devdojo.core.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}
