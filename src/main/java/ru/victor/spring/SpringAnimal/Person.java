package ru.victor.spring.SpringAnimal;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created...");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("\n- Hello, my lovely Pet");
        pet.say();
    }
}
