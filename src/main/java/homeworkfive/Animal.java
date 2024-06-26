package homeworkfive;

import java.util.Objects;

public class Animal {

    private String eats;
    private int noOfLegs;
    private boolean vegetarian;

    public Animal(String eats, int noOfLegs, boolean vegetarian) {
        this.eats = eats;
        this.noOfLegs = noOfLegs;
        this.vegetarian = vegetarian;
    }

    public Animal() {
        this.eats = "default";
        this.noOfLegs = 0;
        this.vegetarian = false;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "eats='" + eats + '\'' +
                ", noOfLegs=" + noOfLegs +
                ", vegetarian=" + vegetarian +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return noOfLegs == animal.noOfLegs && vegetarian == animal.vegetarian && Objects.equals(eats, animal.eats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eats, noOfLegs, vegetarian);
    }
}
