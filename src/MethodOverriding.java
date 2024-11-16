class AnimalOverriding {
    // Method in the superclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogOverriding extends AnimalOverriding {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        AnimalOverriding myAnimal = new AnimalOverriding();
        myAnimal.sound(); // Outputs: Animal makes a sound

        DogOverriding myDog = new DogOverriding();
        myDog.sound();    // Outputs: Dog barks

        // Polymorphism
        AnimalOverriding myPet = new DogOverriding();
        myPet.sound();    // Outputs: Dog barks (demonstrates polymorphism)
    }
}
