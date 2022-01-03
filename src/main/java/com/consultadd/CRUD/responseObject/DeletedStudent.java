package com.consultadd.CRUD.responseObject;

import com.consultadd.CRUD.model.Student;

import org.springframework.beans.factory.annotation.Autowired;

public class DeletedStudent {
    @Autowired
    private Student student;
    private String deleted;
    public Student getStudent() {
        return student;
    }
    public DeletedStudent(Student student, String string) {
        this.student = student;
        this.deleted = string;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public String getDeleted() {
        return deleted;
    }
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    

}
