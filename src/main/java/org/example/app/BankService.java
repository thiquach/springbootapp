package org.example.app;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {

    private final List<BankAccount> bankAccounts;
    private final int ACCOUNT_NUMBER_START = 10000000;
    private int nextAccountID = ACCOUNT_NUMBER_START;
    private  double bankTotalBalance;

    BankService(List<BankAccount> bankAccounts) {
        bankAccounts.add(new BankAccount("Joe Smith", nextAccountID++, 100.00));
        bankAccounts.add(new BankAccount("Jan Clark", nextAccountID++, 250.00));
        this.bankAccounts = bankAccounts;
        this.bankTotalBalance = 0;

    }

    public int addBankAccount(String customerName, double balance)    {
        BankAccount bankAccount = new BankAccount(customerName, this.nextAccountID, balance);
        this.bankAccounts.add(bankAccount);
        return this.nextAccountID++;
    }

    public double getBankTotalBalance() {
        for (BankAccount bankAccount : this.bankAccounts) {
            this.bankTotalBalance += bankAccount.getBalance();
        }
        System.out.println("Bank total balance " + this.bankTotalBalance);
        return this.bankTotalBalance;
    }

    public int getBankAccountSize() { return this.bankAccounts.size();   }

    public BankAccount getBankAccount(int theAccountID) {
        for (BankAccount bankAccount : this.bankAccounts) {
            if (theAccountID == bankAccount.getAccountID() ) {
                return bankAccount;
            }
        }
        return null;
    }
}
