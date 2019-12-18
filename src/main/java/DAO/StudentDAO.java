package DAO;

// Data Access Object class: Data Access Objects are implemented using  interfaces
//Defines in memory database actions and methods
// Operations include inserting,selecting,deleting,updating and listing all the students in the database
// csamiselo@github.com Dec 2019

import com.example.demo.Model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDAO {
    //insert student into the database
    int insertNewStudent(UUID studentId, Student student);

    //select a student from the database
    Student selectStudentById(UUID studentId);

    //list all students in the database
    List<Student> selectAllStudents();

    //Update all students in the database
    int updateStudentById(UUID studentId, Student studentUpdate);

    //Delete students from the database
    int deleteStudentById(UUID studentId);


}
