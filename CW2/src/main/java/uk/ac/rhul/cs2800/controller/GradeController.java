package uk.ac.rhul.cs2800.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.rhul.cs2800.model.Grade;
import uk.ac.rhul.cs2800.model.Module;
import uk.ac.rhul.cs2800.model.Student;
import uk.ac.rhul.cs2800.repository.GradeRepository;
import uk.ac.rhul.cs2800.repository.ModuleRepository;
import uk.ac.rhul.cs2800.repository.StudentRepository;

/**
 * A REST controller for managing grades.
 */
@RestController
public class GradeController {

  private final GradeRepository gradeRepository;
  private final StudentRepository studentRepository;
  private final ModuleRepository moduleRepository;

  /**
   * Constructor for GradeController.
   *
   * @param gradeRepository the grade repository
   * @param studentRepository the student repository
   * @param moduleRepository the module repository
   */
  public GradeController(GradeRepository gradeRepository, StudentRepository studentRepository,
      ModuleRepository moduleRepository) {
    this.gradeRepository = gradeRepository;
    this.studentRepository = studentRepository;
    this.moduleRepository = moduleRepository;
  }

  /**
   * Handles POST requests to add a grade.
   *
   * @param params A map containing "student_id", "module_code", and "score".
   * @return The saved Grade object as a ResponseEntity.
   */
  @PostMapping(value = "/grades/addGrade")
  public ResponseEntity<Grade> addGrade(@RequestBody Map<String, String> params) {
    // Find the student by using student_id
    Student student = studentRepository.findById(Integer.valueOf(params.get("student_id")))
        .orElseThrow(() -> new IllegalArgumentException("Student not found"));

    // Find the module by using the module_code
    Module module = moduleRepository.findById(params.get("module_code"))
        .orElseThrow(() -> new IllegalArgumentException("Module not found"));

    // Create a Grade object and set all values
    Grade grade = new Grade();
    grade.setScore(Integer.valueOf(params.get("score")));
    grade.setStudent(student);
    grade.setModule(module);

    // Save the Grade object
    grade = gradeRepository.save(grade);

    // Return the saved Grade object
    return ResponseEntity.ok(grade);
  }
}
