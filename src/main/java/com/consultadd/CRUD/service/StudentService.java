package com.consultadd.CRUD.service;

import java.util.List;

import com.consultadd.CRUD.model.Student;
import com.consultadd.CRUD.repository.StudentRepo;
import com.consultadd.CRUD.requestObject.StudentMarks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
    @Autowired
    StudentRepo studentRepo;

    public List<Student>getAllStudents(){
        return studentRepo.findAll();
    }

    public Student addStudent(Student student){
        studentRepo.save(student);
        return student;
    }
    @Modifying
    public Student updateMarks(StudentMarks studentMarks,String email){
        Student student=studentRepo.findByEmail(email);
        student.setMathMarks(studentMarks.getMathMarks());
        student.setChemMarks(studentMarks.getChemMarks());
        student.setPhyMarks(studentMarks.getPhyMarks());
        studentRepo.save(student);
        return student;
    }

    @Modifying
    public Student deleteStudentRecord(String email) throws NullPointerException{
        Student student=studentRepo.findByEmail(email);
        if(student!=null){
            studentRepo.deleteById(student.getId()); 
            return student;
        }
        return null;
       
    }
}
