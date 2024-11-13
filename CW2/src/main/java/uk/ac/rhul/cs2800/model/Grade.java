package uk.ac.rhul.cs2800.model;

/**
 * Represents a grade for a module in the student grade management system.
 */

public class Grade {
  private int score;
  private Module module; // Reference to the module


  /**
   * Constructs a new Grade with the specified score.
   *
   * @param score the grade score.
   */

  public Grade(int score, Module module) {
    this.score = score;
    this.module = module;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }


  public Module getModule() {
    return module;
  }
}
