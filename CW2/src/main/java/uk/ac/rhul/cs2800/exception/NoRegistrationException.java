package uk.ac.rhul.cs2800.exception;

/**
 * Exception thrown when a user tries to access grades for an unregistered module.
 * <p>
 * This exception indicates that the user attempted to retrieve grades for a module that has not
 * been registered in the system.
 * </p>
 */
public class NoRegistrationException extends Exception {

  /** Serialization ID for maintaining version compatibility. */
  private static final long serialVersionUID = 6503724288101118059L;

  /**
   * Constructs a NoRegistrationException with a specified detail message.
   *
   * @param message the detail message explaining the reason for the exception.
   */
  public NoRegistrationException(String message) {
    super(message);
  }
}
