package chapter11;

public abstract class Animal {

    int age;
    String color;

    public abstract void makeSound();

    public void eat(){
        System.out.println("I be eating");
    }
}
