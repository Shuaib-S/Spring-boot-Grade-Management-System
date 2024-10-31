package uk.ac.rhul.cs2800.model;

public class Grade {
  private int score;
  private Module module; // Reference to the module

  public Grade(int score, Module module) {
    this.score = score;
    this.module = module;
  }

  public int getScore() {
    return score;
  }

  public Module getModule() {
    return module;
  }
}
