package animals;

import java.util.Objects;

public abstract class Birds extends Animal {
    private final String habitat;

    public Birds(String name, int age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "наземно - воздушная";
        } else {
            this.habitat = habitat;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public abstract void hunt();

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
        Birds birds = (Birds) o;
        return Objects.equals(habitat, birds.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

}
