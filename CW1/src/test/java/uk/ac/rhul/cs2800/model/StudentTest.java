package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
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
    grade1 = new Grade(85, module1); // initiliase grade 1 and 2 for testing
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

  @Test
  void testRegisterModule() {
    // Test 3: Register the student in a module and verify
    student.registerModule(module1);
    List<Registration> registrations = student.getRegistrations();
    assertEquals(1, registrations.size());
    assertEquals(module1, registrations.get(0).getModule());
  }

  @Test
  void testAddGrade() {
    // Test 4: Add a grade to the student and verify
    student.addGrade(grade1);
    assertEquals(1, student.getGrades().size()); // check list size is 1
    assertEquals(grade1, student.getGrades().get(0)); // check index 0 contains grade1
  }

  @Test
  void testComputeAverage() {
    // Add grades that result in a whole number average
    student.addGrade(new Grade(80, module1));
    student.addGrade(new Grade(90, module2));

    // Check if the average is exactly 85.0
    assertEquals(85.0, student.computeAverage());
  }


  @Test
  void testGetGradeForModule() {
    // Test 6: Retrieve grade for a specific module
    student.addGrade(grade1); // Grade associated with module1
    student.addGrade(grade2); // Grade associated with module2

    assertEquals(grade1, student.getGrade(module1)); // Check if correct grade is retrieved
    assertEquals(grade2, student.getGrade(module2)); // Check if correct grade is retrieved
  }

}
