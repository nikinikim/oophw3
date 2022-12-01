package animals;

import java.util.Objects;

public abstract class Mammals extends Animal {
    private final String habitat;
    private final int movementSpeed;

    public Mammals(String name, int age, String habitat, int movementSpeed) {
        super(name, age);

        if (habitat == null) {
            this.habitat = "наземная";
        }else {
            this.habitat = habitat;
        }
        if (movementSpeed <= 0){
            this.movementSpeed = 1;
        }else {
            this.movementSpeed = movementSpeed;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public abstract void walk();


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
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && Objects.equals(habitat, mammals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, movementSpeed);
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "habitat='" + habitat + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}
