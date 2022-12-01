package animals;

import java.util.Objects;

public class Amphibians extends Animal{
    private final String habitat;

    public Amphibians(String name, int age, String habitat) {
        super(name, age);
        if(habitat == null || habitat.isEmpty()){
            this.habitat = "озеро";
        } else {
            this.habitat = habitat;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void hunt(){

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "habitat='" + habitat + '\'' +
                '}' + super.toString();
    }
}
