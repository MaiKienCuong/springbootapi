package maikiencuong.springbootapi.controller;

import maikiencuong.springbootapi.entity.Student;
import maikiencuong.springbootapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student addNewStudent(@RequestBody Student student) {
        student.setId(null);
        studentService.save(student);
        return student;
    }

    @PutMapping("/{studentId}")
    @ResponseStatus(HttpStatus.OK)
    public Student apdateStudent(@RequestBody Student student, @PathVariable Long studentId) {
        student.setId(studentId);
        studentService.save(student);
        return student;
    }

    @DeleteMapping("/{studentId}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteStudent(@PathVariable Long studentId) {
        studentService.delete(studentId);
        return "deleted Student id =" + studentId;
    }

}
