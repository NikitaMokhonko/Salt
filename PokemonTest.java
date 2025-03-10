package testingGround;

public class PokemonTest {

    // Creating an instance of Pokemon, this one being Pikachu

    public static void main(String args[]){

        Pokemon pikachu = new Pokemon("Pikachu", 1, "Male", "Electric");

        pikachu.setGender("Female");

        System.out.println(pikachu.getName() + " " + pikachu.getGeneration() + " " + pikachu.getGender() + " " + pikachu.getType());
    }

}
