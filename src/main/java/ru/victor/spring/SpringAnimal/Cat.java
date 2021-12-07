package ru.victor.spring.SpringAnimal;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean is created...");
    }

    @Override
    public void say() {
        System.out.println("\n- Meow-Meow, i'm your sweet Cat");
    }
}
