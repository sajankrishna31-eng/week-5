package banking;

import payment.CardPayment;
import payment.Payment;
import payment.UPIPayment;
import transaction.OnlineTransaction;

public class Main {
    public static void main(String[] args) {
        Account account;

        account = new SavingsAccount(1001, "Arun", 50000);
        account.displayDetails();

        account = new CurrentAccount(1002, "Priya", 75000);
        account.displayDetails();

        Payment payment;

        UPIPayment upi = new UPIPayment();
        upi.verifyPayment();
        payment = upi;
        payment.pay(2500);
        identifyOnlinePayment(upi);

        payment = new CardPayment();
        payment.pay(5000);
        identifyOnlinePayment(payment);
    }

    static void identifyOnlinePayment(Object payment) {
        if (payment instanceof OnlineTransaction) {
            System.out.println("Online transaction identified");
        } else {
            System.out.println("Not an online transaction");
        }
    }
}
