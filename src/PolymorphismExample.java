class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

 class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


public class PolymorphismExample {
    public static void main(String[] args){
        /**
         * Method overloading occurs when a class has multiple methods with the same name but different parameter lists
         * (different number or types of parameters). The appropriate method to call is determined at compile time based
         * on the arguments passed during the method call.
         * */
        Calculator calculator = new Calculator();
        System.out.println("Sum (int) is "+calculator.add(12,5));
        System.out.println("Sum (double) is "+ calculator.add(2.354,8.45));

        /**
         * Method overriding occurs when a subclass provides a specific implementation for a method that is already defined
         * in its superclass. The method in the subclass must have the same method signature (name, return type, and parameters)
         * as the method in the superclass.*/
        Dog1 dog1 = new Dog1();
        dog1.makeSound();
    }
}