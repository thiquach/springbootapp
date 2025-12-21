package org.example.app;

public class BankAccount {
    private String name;
    private int id;
    private double balance;

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return id;
    }

}
