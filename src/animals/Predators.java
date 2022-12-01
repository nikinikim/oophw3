package animals;

import java.util.Objects;

public class Predators extends Mammals{
    private String typeOfFood;

    public Predators(String name, int age, String habitat, int movementSpeed, String typeOfFood) {
        super(name, age, habitat, movementSpeed);
        if (this.typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "мясо";
        }else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (this.typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "мясо";
        }else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void hunt() {
    }

    @Override
    public void walk() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators that = (Predators) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}' + super.toString();
    }
}


