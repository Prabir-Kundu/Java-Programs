package Multiple_Inheritance;
/**
 * TODO: Java does not support multiple inheritance with classes to avoid ambiguity and complexity.
 * However, multiple inheritance can be achieved in Java using interfaces.
 **/

// First interface
interface Animal {
    int i = 10; // yes, we declare a variable inside an interface; the variable are by default public.
    void eat();
}

// Second interface
interface Bird {
    void fly();
}

// Class implementing both interfaces (achieving multiple inheritance)
class Bat implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat eats insects.");
        System.out.println("i: "+ i);
    }

    @Override
    public void fly() {
        System.out.println("Bat can fly.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();  // Output: Bat eats insects.
        bat.fly();  // Output: Bat can fly.
    }
}