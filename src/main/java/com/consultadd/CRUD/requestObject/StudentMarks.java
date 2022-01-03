package com.consultadd.CRUD.requestObject;

public class StudentMarks {
    private int mathMarks;
    private int chemMarks;
    private int phyMarks;

    

    public StudentMarks(int mathMarks, int chemMarks, int phyMarks) {
        this.mathMarks = mathMarks;
        this.chemMarks = chemMarks;
        this.phyMarks = phyMarks;
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
