package uk.ac.rhul.cs2800.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exception.NoRegistrationException;

/**
 * Represents a student in the system, storing information about personal details, registered
 * modules, and grades.
 */
@Entity
public class Student {

  @Id
  private Long id;
  private String firstName;
  private String lastName;
  private String username;
  private String email;

  @OneToMany(mappedBy = "student")
  private List<Registration> registrations;

  @OneToMany(mappedBy = "student")
  private List<Grade> grades;

  /**
   * Constructs a new Student with the specified personal details.
   *
   * @param id the student's id
   * @param firstName the student's first name
   * @param lastName the student's last name
   * @param username the student's username
   * @param email the student's email address
   */
  public Student(Long id, String firstName, String lastName, String username, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.email = email;
    this.registrations = new ArrayList<>();
    this.grades = new ArrayList<>();
  }

  /**
   * Gets the student's unique identifier.
   *
   * @return the student's ID.
   */
  public Long getId() {
    return id;
  }

  /**
   * Gets the student's first name.
   *
   * @return the first name of the student.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Gets the student's last name.
   *
   * @return the last name of the student.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Gets the student's username.
   *
   * @return the username of the student.
   */
  public String getUsername() {
    return username;
  }

  /**
   * Gets the student's email address.
   *
   * @return the email address of the student.
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the list of modules the student is registered for.
   *
   * @return a list of Registration objects.
   */
  public List<Registration> getRegistrations() {
    return registrations;
  }

  /**
   * Gets the list of grades the student has received.
   *
   * @return a list of Grade objects.
   */
  public List<Grade> getGrades() {
    return grades;
  }

  /**
   * Registers the student for a specified module by creating a new Registration object and adding
   * it to the list of registrations.
   *
   * @param module the module to register the student in.
   */
  public void registerModule(Module module) {
    registrations.add(new Registration(this, module));
  }

  /**
   * Adds a grade to the student's list of grades.
   *
   * @param grade the grade to be added.
   */
  public void addGrade(Grade grade) {
    grades.add(grade);
  }

  /**
   * Computes the average score of the student's grades.
   *
   * @return the average grade as a float, or 0 if no grades are present.
   */
  public float computeAverage() {
    if (grades.isEmpty()) {
      return 0;
    }

    int total = 0;
    for (Grade grade : grades) {
      total += grade.getScore();
    }

    return total / (float) grades.size();
  }

  /**
   * Retrieves the grade associated with a specific module.
   *
   * @param module the module for which to retrieve the grade.
   * @return the Grade object for the specified module.
   * @throws NoRegistrationException if the student is not registered in the specified module.
   * @throws NoGradeAvailableException if no grade is available for the specified module.
   */
  public Grade getGrade(Module module) throws NoRegistrationException, NoGradeAvailableException {
    // Check if the student is registered for the specified module
    boolean isRegistered = false;
    for (Registration registration : registrations) {
      if (registration.getModule().equals(module)) {
        isRegistered = true;
        break;
      }
    }

    if (!isRegistered) {
      throw new NoRegistrationException(
          "Student is not registered for the module: " + module.getName());
    }

    // Check if there is a grade for the specified module
    for (Grade grade : grades) {
      if (grade.getModule().equals(module)) {
        return grade;
      }
    }

    // If the student is registered but no grade is found, throw NoGradeAvailableException
    throw new NoGradeAvailableException("No grade available for the module: " + module.getName());
  }

}
