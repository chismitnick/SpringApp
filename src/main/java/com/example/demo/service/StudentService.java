package com.example.demo.service;

import DAO.StudentDAO;
import com.example.demo.Model.Student;

import java.util.List;
import java.util.UUID;

// Service class is responsible for business logic implementation
public class StudentService {
    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public int persistNewStudent(UUID studentId, Student student) {
        UUID studentUid = studentId == null ? UUID.randomUUID() : studentId;
        return studentDAO.insertNewStudent(studentUid, student);
    }

    //select a student from the database
    public Student getStudentById(UUID studentId) {
        return studentDAO.selectStudentById(studentId);
    }

    //list all students in the database
    public List<Student> selectAllStudents() {
        return studentDAO.selectAllStudents();
    }

    //Update all students in the database
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return studentDAO.updateStudentById(studentId, studentUpdate);
    }

    //Delete students from the database
    public int deleteStudentById(UUID studentId) {
        return studentDAO.deleteStudentById(studentId);

    }
}
