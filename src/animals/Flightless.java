package animals;

import java.util.Objects;

public class Flightless extends Birds{
    private final String movementType;

    public Flightless(String movementType, String name, int age, String habitat) {
        super(name, age, habitat);
        if (movementType == null || movementType.isEmpty()){
            this.movementType = "ходящий";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void walk() {

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
    public void hunt() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "movementType='" + movementType + '\'' +
                '}' + super.toString();
    }
}
