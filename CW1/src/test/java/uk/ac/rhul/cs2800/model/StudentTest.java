package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

  private Student student;
  private Module module1;
  private Module module2;
  private Grade grade1;
  private Grade grade2;

  @BeforeEach
  void setUp() {
    // Test 1: Initialize a Student and sample modules and grades
    student = new Student(1L, "John", "Doe", "jdoe", "jdoe@example.com"); // Constructor will be
                                                                          // int,String,String,String,String
    module1 = new Module("CS2800", "Software Engineering", true);
    module2 = new Module("CS2900", "Advanced Software Engineering", true);
    grade1 = new Grade(85, module1);
    grade2 = new Grade(90, module2);
  }

  @Test
  void testStudentInitialization() {
    // Test 2: Ensure that the student is initialized correctly
    assertEquals(1L, student.getId());
    assertEquals("John", student.getFirstName());
    assertEquals("Doe", student.getLastName());
    assertEquals("jdoe", student.getUsername());
    assertEquals("jdoe@example.com", student.getEmail());
    assertTrue(student.getRegistrations().isEmpty());
    assertTrue(student.getGrades().isEmpty());
  }

}
