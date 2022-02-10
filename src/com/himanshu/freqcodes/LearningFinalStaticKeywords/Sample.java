package com.himanshu.freqcodes.LearningFinalStaticKeywords;

public class Sample {

    final int idFinal = 57; //for final variable, we have the option to initialize it here or in constructor or in static block
    final static int idFinalStatic = 56;    // for final static, it has to be initialized here only
    static int idStatic = 1;

    int rollNo;
    int marks;

    public Sample() {
        idStatic += 1;

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Sample   {" +
                "idFinal=" + idFinal +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
