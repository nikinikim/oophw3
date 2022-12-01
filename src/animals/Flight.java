package animals;

import java.util.Objects;

public class Flight extends Birds {
    private final String movementType;

    public Flight(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        if (movementType == null || movementType.isEmpty()){
            this.movementType = "обыкновенный летающий";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public static void fly() {

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
        Flight flight = (Flight) o;
        return Objects.equals(movementType, flight.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "movementType='" + movementType + '\'' +
                '}' + super.toString();
    }
}


