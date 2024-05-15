package homeworkfive;

public class Main {
    public static void main(String[] args) {

        Animal firsAnimal = new Animal();
        Animal secondAnimal = new Animal("water", 4, true);
        Cat firstCat = new Cat("meat", 4, false, "white");
        Cat secondCat = new Cat("pizza", 4, true);
        System.out.println(firsAnimal);
        System.out.println(secondAnimal);
        System.out.println(firstCat);
        System.out.println(secondCat);
        firstCat.setVegetarian(true);
    }
}
