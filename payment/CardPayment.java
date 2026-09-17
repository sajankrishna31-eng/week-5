package payment;

import transaction.OnlineTransaction;

public class CardPayment implements Payment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("Card Payment Successful: " + amount);
    }
}
