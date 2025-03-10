package chapter10;

public class Apple extends Fruit{

    public Apple(double calories){
        super(calories);
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }

    public void removeSeeds(){
        System.out.println("Seeds have been removed");
    }
}
