package de.iav.studentdb.repository;

import de.iav.studentdb.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentDB {
    private final List<Student> students;

    public StudentDB() {
        students = new ArrayList<>();
    }

    public List<Student> getCatList(){
        return students;
    }

    public Student getStudentById(String id){
        for(Student student : students){
            if(student.id().equals(id)){
                return student;
            }
        }
        throw new NoSuchElementException();
    }

    public Student addStudent(Student student){
        students.add(student);
        return student;
    }
}
