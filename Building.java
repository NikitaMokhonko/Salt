package testingGround;

public class Building {

    protected int age;
    protected String color;
    protected double height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Building(int age, String color, double height){
        this.age = age;
        this.color = color;
        this.height = height;
    }



    public static void main(String args[]){

    }
}
