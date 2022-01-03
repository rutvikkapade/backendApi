package com.consultadd.CRUD.controller;

import java.util.List;

import com.consultadd.CRUD.model.Student;
import com.consultadd.CRUD.repository.StudentRepo;
import com.consultadd.CRUD.requestObject.StudentMarks;
import com.consultadd.CRUD.responseObject.DeletedStudent;
import com.consultadd.CRUD.service.StudentService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public Student sendWelcome(@RequestBody Student student){
        System.out.println("triggered");
        System.out.println(student.getEmail());
        return studentService.addStudent(student);
    }

    @PostMapping("/test")
    public Object test(@RequestBody Object object){
        System.out.println("triggered");
        System.out.println(object);
        return object;
    }
    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
    }
    
    @PostMapping("/update/{email}")
    public ResponseEntity<Student>updateMarksByEmail(@PathVariable String email,@RequestBody StudentMarks studentMarks){
        System.out.println(studentMarks.getMathMarks());
        return new ResponseEntity<>(studentService.updateMarks(studentMarks,email),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{email}")
    public ResponseEntity<DeletedStudent> deleteByEmail(@PathVariable String email){
        Student student=studentService.deleteStudentRecord(email);
       
             DeletedStudent deletedStudent=new DeletedStudent(student, (student==null? "student with email "+email+" does not exist":"deleted"));
            return new ResponseEntity<>(deletedStudent,HttpStatus.OK);
    }
    
}
