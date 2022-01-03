package com.consultadd.CRUD.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.bytebuddy.implementation.bind.annotation.Super;

@Entity
public class Student {
    @Id
    String id;
    String email;
    String firstName;
    String lastName;
    int mathMarks;
    int chemMarks;
    int phyMarks;
    
    public Student(){};

    public Student(String id,String email, String firstName, String lastName, int mathMarks, int chemMarks, int phyMarks) {
        this.id = id;
        this.email=email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mathMarks = mathMarks;
        this.chemMarks = chemMarks;
        this.phyMarks = phyMarks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getChemMarks() {
        return chemMarks;
    }

    public void setChemMarks(int chemMarks) {
        this.chemMarks = chemMarks;
    }

    public int getPhyMarks() {
        return phyMarks;
    }

    public void setPhyMarks(int phyMarks) {
        this.phyMarks = phyMarks;
    }

    

}
