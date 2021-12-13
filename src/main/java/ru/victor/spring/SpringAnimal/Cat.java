package ru.victor.spring.SpringAnimal;

import org.springframework.stereotype.Component;

@Component()
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean is created...");
    }

    @Override
    public void say() {
        System.out.println("\n- Meow-Meow, i'm your sweet Cat");
    }
}
