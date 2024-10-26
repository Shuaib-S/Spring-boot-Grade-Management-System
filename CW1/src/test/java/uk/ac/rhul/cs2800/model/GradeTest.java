package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.model.Grade;

/**
 * Unit tests for the Grade class.
 */
class GradeTest {

  private Grade grade;

  @BeforeEach
  void setUp() {
    // Initialize a Grade instance with a score of 85
    grade = new Grade(85);
  }

  @Test
  void testGradeInitialization() {
    // Ensure that the grade is initialized correctly
    assertEquals(85, grade.getScore());
  }

  @Test
  void testChangeGrade() {
    // Ensure that the grade can be updated
    grade.setScore(90);
    assertEquals(90, grade.getScore());
  }

  @Test
  void testGradeWithVariousIntegers() {
    // Test different integer values
    grade.setScore(-10);
    assertEquals(-10, grade.getScore());

    grade.setScore(10000);
    assertEquals(10000, grade.getScore());
  }
}
