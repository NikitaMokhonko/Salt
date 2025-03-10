package testingGround;

public class Table extends Furniture {
    private int legAmount;
    private String material;

    public Table(int legAmount, String material, int age, String color){
        super(age, color);
        this.legAmount = legAmount;
        this.material = material;
    }

    public static void main(String args[]){
        Table table1 = new Table(4, "wood", 2, "yellow");
        System.out.println(table1.getAge());
    }

}
