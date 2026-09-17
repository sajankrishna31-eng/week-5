public class PaymentMethods {
    interface Payment {
        void pay(double amount);
    }

    static class CreditCardPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    static class UPIPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using UPI");
        }
    }

    static class NetBankingPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Net Banking");
        }
    }

    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(5000);

        payment = new UPIPayment();
        payment.pay(2500);

        payment = new NetBankingPayment();
        payment.pay(3000);
    }
}
