package br.com.rodrigo.core.repository;


import br.com.rodrigo.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author William Suane
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
