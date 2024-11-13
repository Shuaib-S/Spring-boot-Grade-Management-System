package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeTest {

  private Module module;
  private Grade grade;

  @BeforeEach
  void setUp() {
    // Test 1: Initialize a Module and a Grade with a specific score
    module = new Module("CS2800", "Software Engineering", true);
    grade = new Grade(85, module);
  }

  @Test
  void testGradeInitialization() {
    // Test 2: Ensure that the grade is initialized correctly
    assertEquals(85, grade.getScore());
    assertEquals(module, grade.getModule());
  }

  @Test
  void testChangeGradeScore() {
    // Test 3: Ensure that the grade score can be updated
    grade.setScore(90);
    assertEquals(90, grade.getScore());
  }

  @Test
  void testAssociatedModule() {
    // Test 4: Verify that the module associated with the grade is correct
    assertEquals("CS2800", grade.getModule().getCode());
    assertEquals("Software Engineering", grade.getModule().getName());
    assertTrue(grade.getModule().isMandatoryNonCondonable());
  }

}
