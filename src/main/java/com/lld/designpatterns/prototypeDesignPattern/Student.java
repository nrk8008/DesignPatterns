package com.lld.designpatterns.prototypeDesignPattern;

public class Student implements Prototype {
    String name;
    int age;
    String psp;
    String batch;
    double avgBatchPsp;
    String instructorName;
    String moduleName;
    Student(){

    }
    Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batch = student.batch;
        this.avgBatchPsp = student.avgBatchPsp;
        this.instructorName = student.instructorName;
        this.moduleName = student.moduleName;

    }
    @Override
    public Student clone() {
       return new Student(this);
    }

    // copy() --> clone();

}
