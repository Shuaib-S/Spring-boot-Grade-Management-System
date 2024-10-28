package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModuleTest {

  private Module module;

  @BeforeEach
  void setUp() {
    // Test 1: Initialize a Module instance with valid attributes
    module = new Module("CS2800", "Software Engineering", true);
  }

  @Test
  void testModuleInitialization() {
    // Test 2: Ensure that the module is initialized correctly
    assertEquals("CS2800", module.getCode());
    assertEquals("Software Engineering", module.getName());
    assertTrue(module.isMandatoryNonCondonable());
  }

  @Test
  void testChangeModuleDetails() {
    // Test 3: Ensure that module details can be updated
    module.setCode("CS2900");
    module.setName("Advanced Software Engineering");
    module.setMandatoryNonCondonable(false); // add setters after

    assertEquals("CS2900", module.getCode());
    assertEquals("Advanced Software Engineering", module.getName());
    assertFalse(module.isMandatoryNonCondonable()); // add is MNC after (returns mnc value)
  }

  @Test
  void testInvalidModuleCode() {
    // Test 4: Ensure that the module code cannot be null or empty
    assertThrows(IllegalArgumentException.class,
        () -> new Module("", "Software Engineering", true));
    assertThrows(IllegalArgumentException.class,
        () -> new Module(null, "Software Engineering", true));
  }

  @Test
  void testInvalidModuleName() {
    // Test 5: Ensure that the module name cannot be null or empty
    assertThrows(IllegalArgumentException.class, () -> new Module("CS2800", "", true));
    assertThrows(IllegalArgumentException.class, () -> new Module("CS2800", null, true));
  }
}
