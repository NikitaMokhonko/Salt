package chapter13;

public class DivideByZero {

    public static void main(String args[]){

        try{
            int c = 30/0;
        }catch(Exception e){}
        finally{
            System.out.println("Division is fun");
        }
    }
}
