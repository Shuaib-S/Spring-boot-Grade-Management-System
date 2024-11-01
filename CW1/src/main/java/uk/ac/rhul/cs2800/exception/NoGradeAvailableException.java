package uk.ac.rhul.cs2800.exception;

/**
 * Exception thrown when there is no grade available for a student.
 */
public class NoGradeAvailableException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 2091285415704371529L;

  /**
   * Constructs a NoGradeAvailableException with a specified detail message.
   *
   * @param message the detail message.
   */
  public NoGradeAvailableException(String message) {
    super(message);
  }
}
