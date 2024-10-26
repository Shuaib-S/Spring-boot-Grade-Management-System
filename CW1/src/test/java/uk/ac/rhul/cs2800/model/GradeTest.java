package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Grade class.
 */
class GradeTest {

  private Grade grade;

  @BeforeEach
  void setUp() {
    // Test 1: Initialize a Grade instance with a score of 85
    grade = new Grade(85);
  }

  @Test
  void testGradeInitialization() {
    // Test 2: Ensure that the grade is initialized correctly
    assertEquals(85, grade.getScore());
  }

  @Test
  void testChangeGrade() {
    // Test 3: Ensure that the grade can be updated
    grade.setScore(90);
    assertEquals(90, grade.getScore());
  }

  @Test
  void testGradeWithVariousIntegers() {
    // Test 4: Test different integer values (including negative and large numbers)
    grade.setScore(-10);
    assertEquals(-10, grade.getScore());

    grade.setScore(10000);
    assertEquals(10000, grade.getScore());
  }
}
