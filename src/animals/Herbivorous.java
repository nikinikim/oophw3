package animals;

import java.util.Objects;

public class Herbivorous extends Mammals {
    private String typeOfFood;

    public Herbivorous(String name, int age, String habitat, int movementSpeed, String typeOfFood) {
        super(name, age, habitat, movementSpeed);
        if (this.typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "трава";
        }else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (this.typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "трава";
        }else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void grass() {
    }

    @Override
    public void walk() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivorous that = (Herbivorous) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivorous{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}' + super.toString();
    }
}
