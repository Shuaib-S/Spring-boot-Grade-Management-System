package uk.ac.rhul.cs2800.model;

/**
 * Represents a module in the student grade management system. Each module has a code, name, and a
 * mandatory non-condonable flag (mnc).
 */
public class Module {
  private String code;
  private String name;
  private boolean mnc; // Mandatory Non-Condonable

  /**
   * Constructs a new Module with the specified code, name, and mnc status.
   *
   * @param code the module code, cannot be null or empty.
   * @param name the module name, cannot be null or empty.
   * @param mnc whether the module is mandatory non-condonable.
   * @throws IllegalArgumentException if code or name is null or empty.
   */
  public Module(String code, String name, boolean mnc) {
    setCode(code);
    setName(name);
    this.mnc = mnc;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    if (code == null || code.isEmpty()) {
      throw new IllegalArgumentException("Module code cannot be null or empty.");
    }
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Module name cannot be null or empty.");
    }
    this.name = name;
  }

  public boolean isMandatoryNonCondonable() {
    return mnc;
  }

  public void setMandatoryNonCondonable(boolean mnc) {
    this.mnc = mnc;
  }
}
