public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard("1234-5678-9012-3456");
        PayPal payPal = new PayPal("example@email.com");
        Bitcoin bitcoin = new Bitcoin("TXN-98765BTC");
        ApplePay applePay = new ApplePay("ChristineI");

        // Testing all overloaded methods
        processor.processPayment(creditCard);
        processor.processPayment(payPal);
        processor.processPayment(bitcoin);
        processor.processPayment(applePay); // Bonus
    }
}
