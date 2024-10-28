package tech.strategio.service;

import tech.strategio.student.Student;

import java.util.List;

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return null;
    }

    public Student getStudentById(String id){
        return null;
    }

    public List<Student> getStudentsByFirstName(){
        return null;
    }

    public List<Student> getStudentsByLastName(){
        return null;
    }

    public Student updateStudent(Student student){
        return null;
    }

    public boolean removeStudentById(String id){
        return false;
    }
}
