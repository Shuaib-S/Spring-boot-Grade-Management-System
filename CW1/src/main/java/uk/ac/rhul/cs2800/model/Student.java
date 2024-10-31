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

}
