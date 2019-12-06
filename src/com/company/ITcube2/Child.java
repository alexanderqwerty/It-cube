package com.company.ITcube2;
public class Child extends People{
    String educationalInst;
    Child(String firstname, String lastname, int age, String gender,String educationalInst) {
        super(firstname, lastname, age, gender);
        this.educationalInst = educationalInst;
    }
}


