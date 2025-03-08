package chapter6;

public class Car {
    String brand;
    String color;
    int year;

    public Car(String brand, String color, int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    public static void main(String args[]){
        Car car1 = new Car("Toyota", "Yellow", 1969);
        System.out.println(car1.color);
    }
}
