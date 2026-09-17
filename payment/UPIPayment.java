package payment;

import transaction.OnlineTransaction;

public class UPIPayment implements SecurePayment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("UPI Payment Successful: " + amount);
    }

    public void verifyPayment() {
        System.out.println("UPI Payment Verified");
    }
}
