package com.company.ITcube2;

class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(3, "Есть", "Кот");
        Dog dog1 = new Dog(3, "Есть", "Собака");
        Bird bird1 = new Bird(2, "Нет", "Ворона");
        System.out.println(cat1.Sound());
        System.out.println(dog1.Sound());
        System.out.println(bird1.Sound());
    }
}
