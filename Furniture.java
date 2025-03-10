package testingGround;

public class Furniture {

    protected int age;
    protected String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Furniture(int age, String color){
        this.age = age;
        this.color = color;
    }

    public static void main(String args[]){

    }
}
