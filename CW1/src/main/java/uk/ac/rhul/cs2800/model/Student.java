package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a student in the system, storing information about personal details, registered
 * modules, and grades.
 */
public class Student {
  private Long id;
  private String firstName;
  private String lastName;
  private String username;
  private String email;
  private List<Registration> registrations;
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
   * @return the Grade object for the specified module, or null if no grade is found.
   */
  public Grade getGrade(Module module) {
    for (Grade grade : grades) {
      if (grade.getModule().equals(module)) {
        return grade;
      }
    }
    return null; // Return null if no grade is found for the specified module
  }
}
