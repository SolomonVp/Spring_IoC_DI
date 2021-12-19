package ru.victor.spring.SpringAnimal;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
    private String name;
    public Dog() {
        System.out.println("Dog bean is created...");
    }

    @Override
    public void say() {
        System.out.println("\n- Bow-Bow, i'm your funny dog!");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
