package Abstract_Class_Scenario;

//TODO: Abstract Class in Real-World Scenario-
// Abstract Class
abstract class Payment {
    double amount;

    // Constructor
    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method (must be implemented by child classes)
    abstract void processPayment();

    // Concrete method (can be used by all child classes)
    void showAmount() {
        System.out.println("Processing payment of amount: $" + amount);
    }
}

// Concrete class for Credit Card Payment
class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        showAmount();
        System.out.println("Payment done using Credit Card: " + cardNumber);
    }
}

// Concrete class for PayPal Payment
class PayPalPayment extends Payment {
    String email;

    PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    void processPayment() {
        showAmount();
        System.out.println("Payment done using PayPal: " + email);
    }
}

// Main class to test
public class Abstract_Class {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment(100.50, "1234-5678-9876");
        creditCard.processPayment();

        Payment payPal = new PayPalPayment(200.75, "user@example.com");
        payPal.processPayment();
    }
}
