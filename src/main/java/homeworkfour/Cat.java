package homeworkfour;

public class Cat extends Animal {

    private String color;

    public Cat(String eats, int noOfLegs, boolean vegetarian, String color) {
        super(eats, noOfLegs, vegetarian);
        this.color = color;
    }

    public Cat(String eats, int noOfLegs, boolean vegetarian) {
        super(eats, noOfLegs, vegetarian);
        this.color = "default";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return
                "Cat{" +
                        "color='" + color + '\'' + ", " +
                        super.toString().substring(7);
    }
}
