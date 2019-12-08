package com.company.ITcube2;

public class Animal {
    String name;
    int age;
    String wool;
    String sound;

    Animal(int age, String wool, String name) {
        this.age = age;
        this.wool = wool;
        this.name = name;
    }

    public String Sound() {
        return name + " говорит: " + sound;
    }
}
