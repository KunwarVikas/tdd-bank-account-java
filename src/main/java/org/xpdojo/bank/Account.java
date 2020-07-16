package org.xpdojo.bank;

public class Account {
    private int balance;
    public int getBalance() {
        return 0;
    }

    public int depositAnAmountToIncreaseTheBalance(int amount) {
        balance+=amount;
        return balance;
    }
}
