package uk.ac.rhul.cs2800.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Represents a grade for a module in the student grade management system.
 */
@Entity
public class Grade {

  @Id
  @GeneratedValue
  private int id;
  private int score;

  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  @ManyToOne
  @JoinColumn(name = "module_code")
  private Module module; // Reference to the module


  /**
   * Constructs a new Grade with the specified score.
   *
   * @param score the grade score.
   */

  public Grade() {

  }

  public Grade(int score, Student student, Module module) {
    this.score = score;
    this.student = student;
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

  public void setModule(Module module) {
    this.module = module;
  }


  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }
}
