package com.lld.designpatterns.prototypeDesignPattern;

public class IntelligentStudent extends Student {
    int iq;
    double intelligenceScore;
    IntelligentStudent() {}

    IntelligentStudent(IntelligentStudent student) {
        // initialise the parent attribues.
        super(student);
        this.iq = student.iq;
        this.intelligenceScore = student.intelligenceScore;

    }
    @Override
    public IntelligentStudent clone() {
       return new IntelligentStudent(this);
    }
}
