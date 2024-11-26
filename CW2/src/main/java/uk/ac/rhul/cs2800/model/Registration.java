package uk.ac.rhul.cs2800.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Represents the registration of a student in a specific module.
 */

@Entity
public class Registration {

  @Id
  @GeneratedValue
  private int id;

  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student; // to be implemented after

  @ManyToOne
  @JoinColumn(name = "module_code")
  private Module module;

  /**
   * Constructs a new Registration for a specific student and module.
   *
   * @param student the student who is registering.
   * @param module the module the student is registering for.
   * @throws IllegalArgumentException if student or module is null.
   */
  public Registration(Student student, Module module) {
    if (student == null) {
      throw new IllegalArgumentException("Student cannot be null.");
    }
    if (module == null) {
      throw new IllegalArgumentException("Module cannot be null.");
    }
    this.student = student; // to be implemented after
    this.module = module;
  }

  /**
   * Gets the student associated with this registration.
   *
   * @return the student.
   */
  public Student getStudent() { // TBD
    return student;
  }

  /**
   * Gets the module associated with this registration.
   *
   * @return the module.
   */
  public Module getModule() {
    return module;
  }
}
