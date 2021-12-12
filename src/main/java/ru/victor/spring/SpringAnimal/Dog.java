package ru.victor.spring.SpringAnimal;

public class Dog implements Pet{
//    private String name;
    public Dog() {
        System.out.println("Dog bean is created...");
    }

    @Override
    public void say() {
        System.out.println("\n- Bow-Bow, i'm your funny dog!");
    }

    protected void init() {
        System.out.println("Class Dog: init");
    }

    private void destroy() {
        System.out.println("Class Dog: destroy");
    }

//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
}
