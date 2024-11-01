package uk.ac.rhul.cs2800.exception;

/**
 * Exception thrown when a user tries to access grades for unregistered modules.
 */
public class NoRegistrationException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 6503724288101118059L;

  /**
   * Constructs a NoRegistrationException with a specified detail message.
   *
   * @param message the detail message.
   */
  public NoRegistrationException(String message) {
    super(message);
  }
}
