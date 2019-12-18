package dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;
// needs to be injected into service class
@Repository("TestDao")
public class TestStudentDaoImpl implements StudentDAO {

    private final Map<UUID, Student> database;

    public TestStudentDaoImpl() {
        database = new HashMap<>();
    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        database.put(studentId, student);

        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        database.put(studentId, studentUpdate);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        database.remove(studentId);
        return 0;
    }
}
