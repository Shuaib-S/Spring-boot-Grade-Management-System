package uk.ac.rhul.cs2800.repository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.rhul.cs2800.model.Registration;

/**
 * Repository interface for Registration entity. Provides CRUD operations for Registration.
 */
public interface RegistrationRepository extends CrudRepository<Registration, Integer> {
}
