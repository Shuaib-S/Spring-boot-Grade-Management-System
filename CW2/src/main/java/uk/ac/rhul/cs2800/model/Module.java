package uk.ac.rhul.cs2800.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Represents a module in the student grade management system. Each module has a code, name, and a
 * mandatory non-condonable flag (mnc).
 */
@Entity
public class Module {

  @Id
  private String code;
  private String name;
  private boolean mnc; // Mandatory Non-Condonable

  /**
   * Constructs a new Module with the specified code, name, and mnc status.
   *
   * @param code the module code, cannot be null or empty.
   *
   * @param name the module name, cannot be null or empty.
   *
   * @param mnc whether the module is mandatory non-condonable.
   *
   * @throws IllegalArgumentException if code or name is null or empty.
   */
  public Module(String code, String name, boolean mnc) {
    setCode(code);
    setName(name);
    this.mnc = mnc;
  }


  public Module() {

  }

  /**
   * Gets the module code.
   *
   * @return the code of the module.
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the module code.
   *
   * @param code the new code for the module, cannot be null or empty.
   *
   * @throws IllegalArgumentException if code is null or empty.
   */
  public void setCode(String code) {
    if (code == null || code.isEmpty()) {
      throw new IllegalArgumentException("Module code cannot be null or empty.");
    }
    this.code = code;
  }

  /**
   * Gets the module name.
   *
   * @return the name of the module.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the module name.
   *
   * @param name the new name for the module, cannot be null or empty.
   *
   * @throws IllegalArgumentException if name is null or empty.
   */
  public void setName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Module name cannot be null or empty.");
    }
    this.name = name;
  }

  /**
   * Checks if the module is mandatory and non-condonable (MNC).
   *
   * @return true if the module is mandatory non-condonable, otherwise false.
   */
  public boolean isMandatoryNonCondonable() {
    return mnc;
  }

  /**
   * Sets whether the module is mandatory non-condonable.
   *
   * @param mnc the new status of mandatory non-condonable.
   */
  public void setMandatoryNonCondonable(boolean mnc) {
    this.mnc = mnc;
  }
}
