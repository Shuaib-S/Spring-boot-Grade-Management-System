package uk.ac.rhul.cs2800.exception;

/**
 * Exception thrown when no grade is available for a specific module.
 * <p>
 * This exception is used to indicate that a grade lookup failed due to the absence of a recorded
 * grade for a particular module.
 * </p>
 */
public class NoGradeAvailableException extends Exception {

  /** Serialization ID for maintaining version compatibility. */
  private static final long serialVersionUID = 2091285415704371529L;

  /**
   * Constructs a NoGradeAvailableException with a specified detail message.
   *
   * @param message the detail message explaining the exception.
   */
  public NoGradeAvailableException(String message) {
    super(message);
  }
}
