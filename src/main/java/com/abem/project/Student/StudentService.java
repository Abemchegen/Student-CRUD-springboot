package com.abem.project.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepo.findById(id);

        if (!student.isPresent()) {
            throw new IllegalStateException("student with id" + id + "doesn't exsist");
        }
        return student.get();

    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public void postStudent(Student student) {
        studentRepo.save(student);

    }

    @Transactional
    public void putStudent(Long id, Student student) {

        Optional<Student> studentOptional = studentRepo.findById(id);

        if (!studentOptional.isPresent()) {
            throw new IllegalStateException("student with id " + id + "doesn't exsust");
        }

        Student exsistingStudent = studentOptional.get();

        exsistingStudent.setName(student.getName());
        exsistingStudent.setEmail(student.getEmail());
        exsistingStudent.setDate(student.getDate());

    }

    public void deleteStudent(Long id) {

        studentRepo.deleteById(id);
    }

}
