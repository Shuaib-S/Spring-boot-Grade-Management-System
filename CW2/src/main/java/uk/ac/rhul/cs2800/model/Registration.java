package uk.ac.rhul.cs2800.model;

/**
 * Represents the registration of a student in a specific module.
 */
public class Registration {
  private Student student; // to be implemented after
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
