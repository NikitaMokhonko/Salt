package testingGround;

// Creates a class
public class Pokemon {

    private String name;
    private int generation;
    private String gender;
    private String type;

    public static void main(String args[]) {
    }

    // Creates a constructor that makes it easy to create new instances of the class
    public Pokemon(String name, int generation, String gender, String type) {
        this.name = name;
        this.generation = generation;
        this.gender = gender;
        this.type = type;
    }

    // Getters, in case we want to get access to the parameters
    public String getName() {
        return this.name;
    }

    public int getGeneration() {
        return this.generation;
    }

    public String getGender() {
        return this.gender;
    }

    public String getType() {
        return this.type;
    }

    //Setters, in case we want to change the parameters later on
    public void setName(String name) {
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

}













