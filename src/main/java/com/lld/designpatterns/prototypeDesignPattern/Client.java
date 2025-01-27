package com.lld.designpatterns.prototypeDesignPattern;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student july23BegBatch = new Student();
        july23BegBatch.batch = "July23 beginner ";
        july23BegBatch.instructorName = "Rajesh kumar";
        july23BegBatch.avgBatchPsp = 40.00;
        july23BegBatch.moduleName = "LLD2";
        StudentRegistry.register("july23BegBatch", july23BegBatch);

        IntelligentStudent july23Intelli = new IntelligentStudent();
        july23Intelli.instructorName = "Umang";
        july23Intelli.iq = 160;
        july23Intelli.intelligenceScore = 100;
        studentRegistry.register("july23Intelli", july23Intelli);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        

    }
}
