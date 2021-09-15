package maikiencuong.springbootapi.service;

import maikiencuong.springbootapi.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    void delete(Long studentId);

}
