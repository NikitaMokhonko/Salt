package chapter9;

//Square class
public class Square extends Rectangle {
    //Copying over parameters from Rectangle using super()
    public Square(double side){
        super(side, side);
    }

    //Overwriting the calculatePerimeter method to fit our new Square
    public double calculatePerimeter() {
        double perimeter = height * length;
        return perimeter;

    }
    //Creating instance of Square
    public static void main(String args[]){
        Square square1 = new Square(5);
        System.out.println(square1.calculatePerimeter());
    }
}

