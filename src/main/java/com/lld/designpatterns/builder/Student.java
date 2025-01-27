package com.lld.designpatterns.builder;

public class Student {
    String name;
    int age;
    int gradYear;
    String batch;
    String universityName;
    String phoneNo;
    double psp;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
    // validation checks
        if(builder.gradYear <=2020){
            throw new RuntimeException("Grad Year must be greater than 2020");
        }
        if(builder.psp<85){
            throw new RuntimeException("PSP must be greater than 85");
        }
        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.batch = builder.batch;
        this.universityName = builder.universityName;
        this.phoneNo = builder.phoneNo;
        this.psp = builder.psp;
    }

    public static class Builder {
        String name;
        int age;
        int gradYear;
        String batch;
        String universityName;
        String phoneNo;
        double psp;

        public Student build(){
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getGradYear() {
            return gradYear;
        }

        public void setGradYear(int gradYear) {
            this.gradYear = gradYear;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }


    }


}
