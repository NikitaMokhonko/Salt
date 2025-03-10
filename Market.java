package chapter10;

public class Market{



    public static void main(String args[]){
        Apple apple = new Apple(50);
        apple.makeJuice();
        Fruit apple1 = new Apple(40);
        System.out.println(apple1.getCalories());
    }

}
