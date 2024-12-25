package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegistrationTest {

  private Student student;
  private Module module;
  private Registration registration;

  @BeforeEach
  void setUp() {
    // Test 1: Initialize a Student and Module for Registration
    student = new Student(1L, "John", "Doe", "jdoe", "jdoe@example.com"); // Student class TBD after
    module = new Module("CS2800", "Software Engineering", true);
    registration = new Registration(student, module);
  }

  @Test
  void testRegistrationInitialization() {
    // Test 2: Ensure that the registration is initialized correctly
    assertEquals(student, registration.getStudent());
    assertEquals(module, registration.getModule());
  }

  @Test
  void testNullStudent() {
    // Test 3: Ensure that a null student throws an exception
    assertThrows(IllegalArgumentException.class, () -> new Registration(null, module));
  }

  @Test
  void testNullModule() {
    // Test 4: Ensure that a null module throws an exception
    assertThrows(IllegalArgumentException.class, () -> new Registration(student, null));
  }
}
