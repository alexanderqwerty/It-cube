package com.company.ITcube2;

public class Adult extends People{
    String placeOfWork;
    String experience;
    String post;
    Adult(String firstname, String lastname, int age, String gender,String experience,String placeOfWork,String post) {
        super(firstname, lastname, age, gender);
        this.experience = experience;
        this.placeOfWork = placeOfWork;
        this.post = post;
    }
}
