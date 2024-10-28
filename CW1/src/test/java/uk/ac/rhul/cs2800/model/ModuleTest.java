package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModuleTest {

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
    module.setMandatoryNonCondonable(false);   // add setters after 

    assertEquals("CS2900", module.getCode());
    assertEquals("Advanced Software Engineering", module.getName());
    assertFalse(module.isMandatoryNonCondonable()); // add is MNC after (returns mnc value) 
  }

