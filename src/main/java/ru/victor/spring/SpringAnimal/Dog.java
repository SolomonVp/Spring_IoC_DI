package ru.victor.spring.SpringAnimal;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is created...");
    }

    @Override
    public void say() {
        System.out.println("\n- Bow-Bow, i'm your funny dog!");
    }
}
