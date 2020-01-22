package br.com.rodrigo.microservices.repository;

import br.com.rodrigo.microservices.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
