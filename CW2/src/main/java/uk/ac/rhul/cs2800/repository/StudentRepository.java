package uk.ac.rhul.cs2800.repository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.rhul.cs2800.model.Student;

/**
 * Repository interface for Student entity.
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
