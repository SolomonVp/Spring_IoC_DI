package ru.victor.spring.SpringAnimal;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("\n- Bow-Bow, i'm your funny dog!");
    }
}
