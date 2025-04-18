public class PaymentProcessor {

    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing Credit Card Payment for card number: " + creditCard.getCardNumber());
    }

    public void processPayment(PayPal payPal) {
        System.out.println("Processing PayPal Payment for email: " + payPal.getEmail());
    }

    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment");
        // Bonus: Print transaction ID
        System.out.println("Transaction ID: " + bitcoin.getTransactionId());
    }

    // Bonus: Add ApplePay support
    public void processPayment(ApplePay applePay) {
        System.out.println("Processing ApplePay Payment for user: " + applePay.getUserName());
    }
}

