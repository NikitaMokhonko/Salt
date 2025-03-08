package chapter6;

public class PhoneBill {
    public int id;
    public double cost;
    public double minutes;
    public double minutesUsed;

    public PhoneBill(int id, double cost, double minutes, double minutesUsed) {
        this.id = id;
        this.cost = cost;
        this.minutes = minutes;
        this.minutesUsed = minutesUsed;
    }

    public static void main(String args[]) {
        PhoneBill bill1 = new PhoneBill(1, 80, 500, 450);
        System.out.println(bill1.cost);
    }
}









