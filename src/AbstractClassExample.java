abstract class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    abstract void makeSound(); // Abstract method

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Woof woof!");
    }
}

class Cat extends Animal {
    Cat(String species) {
        super(species);
    }

    @Override
    void makeSound() {
        System.out.println("Meow meow!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog goldenRetriever = new Dog("Dog", "Golden Retriever");
        Cat siameseCat = new Cat("Cat");

        goldenRetriever.displaySpecies();
        goldenRetriever.makeSound();

        siameseCat.displaySpecies();
        siameseCat.makeSound();

    }
}
