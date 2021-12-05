package ru.victor.spring.SpringAnimal;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("\n- Meow-Meow, i'm your sweet Cat");
    }
}
