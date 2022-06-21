package fr.epita.bank.datamodel;

public class SavingsAccount {

    private double interestRate;

    private Account primaryAccount;

    public SavingsAccount(double i) {
        this.primaryAccount = new Account(i);
    }

    public double getBalance() {
        return primaryAccount.getBalance();
    }

    public void setBalance(double balance) {
        primaryAccount.setBalance(balance);
    }
}
