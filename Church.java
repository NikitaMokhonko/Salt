package testingGround;

public class Church extends Building{

    private int windows;
    private int seatAmount;
    private String windowMaterial;
    private String seatMaterial;

    public Church(int age, String color, double height, int windows, int seatAmount, String windowMaterial, String seatMaterial){
        super(age, color, height);
        this.windows = windows;
        this.seatAmount = seatAmount;
        this.windowMaterial = windowMaterial;
        this.seatMaterial = seatMaterial;
    }

    public static void main(String args[]){
        Church church1 = new Church(3, "white", 25, 16, 100, "glass", "wood" );
        System.out.println(church1.getColor());
    }

}
