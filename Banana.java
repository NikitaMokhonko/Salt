package chapter10;

public class Banana extends Fruit{

    public Banana(double calories){
        super(calories);
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made");
    }

    public void peel(){
        System.out.println("Banana has been peeled");
    }
}
