package animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if(name == null) {
            this.name = "Безымянное животное";
        }else {
            this.name = name;
        }
        if (age < 0){
            this.age = 1;
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) {
            this.name = "Безымянное животное";
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            this.age = 1;
        }else {
            this.age = age;
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animals = (Animal) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
