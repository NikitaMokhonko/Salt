package chapter9;


// Initial rectangle class
public class Rectangle {

    protected double length;
    protected double height;

    //Constructor for Rectangle
    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;

    }
    //Setters and getters
    public double getSize() {
        return height;
    }

    public void setSize(double size) {
        this.height = size;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    // Perimeter calculator for Rectangle
    public double calculatePerimeter(){
        double perimeter = (2* length) + (2 * height);
        return perimeter;
    }



}
