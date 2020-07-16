package org.xpdojo.bank;

public class Account {
    private int balance=100;
    public int getBalance() {
        return 100;
    }

    public int depositAnAmountToIncreaseTheBalance(int amount) {
        balance+=amount;
        return balance;
    }

    public int withdrawAmount(int amount) {
        balance-=amount;
        return balance;
    }
}
