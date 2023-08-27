
class Superclass {
    Superclass(int value) {
        // Constructor logic
        System.out.println("Superclass class constructor called: "+value);
    }
}

class Subclass extends Superclass {
    Subclass(int value) {
        super(value); // Calling the superclass constructor
    }
}

class Animal2 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    void makeSound() {
        super.makeSound(); // Calling the overridden method from superclass
        System.out.println("Dog barks");
    }
}


class Parent {
    void print() {
        System.out.println("Parent class");
    }
}
class Child extends Parent {
    void printChild() {
        super.print(); // Calling the method from superclass
        System.out.println("Child class");
    }
}
public class SuperKeyword {
    public static void main(String[] args){
        /**
         * Calling Superclass Constructors:
         * When you create an instance of a subclass, the constructor of the superclass is called automatically.
         * If the superclass constructor requires parameters, you can use the super keyword to explicitly call
         * the superclass constructor and provide the necessary arguments.
         * */
        Subclass subclass = new Subclass(15);

        /**
         * If a subclass overrides a method or hides a field from the superclass, you can use the super keyword to
         * explicitly access the overridden method or the hidden field of the superclass.
         * */
        Dog2 dog2 = new Dog2();
        dog2.makeSound();

        /**
         * In a subclass, if you want to call a method from the superclass, you can use the super keyword followed
         * by the method name.
         * */
        Child child = new Child();
        child.printChild();

        /**
         * The super keyword provides a way to interact with the behavior and members of the superclass when working in
         * the context of a subclass. It ensures that you can both extend and customize the behavior of the superclass
         * while maintaining access to its features.
         * */
    }
}
