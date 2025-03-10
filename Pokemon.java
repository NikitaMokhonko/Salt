package testingGround;

public class Pokemon {

    private String name;
    private int generation;
    private String gender;
    private String type;

    public String getName(){
        return this.name;
    }
    public int getGeneratrion() {
        return this.generation;
    }
    public String getGender() {
        return this.gender;
    }
    public String getType() {
        return this.type;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setGeneration(int generation) {
        this.generation = generation;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setType(String type) {
        this.type = type;
    }



    public static void main(String args[]){

        Pokemon Pikachu = new Pokemon();
        Pikachu.setGender("Male");
        Pikachu.setGeneration(1);
        Pikachu.setName("Pikachu");
        Pikachu.setType("Electric");
        System.out.println(Pikachu.name + " " + Pikachu.generation + " " + Pikachu.gender + " " + Pikachu.type);



    }
}
