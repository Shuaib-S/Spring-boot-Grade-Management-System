package uk.ac.rhul.cs2800.model;

/**
 * Represents a grade for a module in the student grade management system.
 */
public class Grade {
  private int score;

  /**
   * Constructs a new Grade with the specified score.
   *
   * @param score the grade score.
   */
  public Grade(int score) {
    this.score = score;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
