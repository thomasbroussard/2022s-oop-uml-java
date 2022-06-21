package fr.epita.bank.datamodel;

public class SavingAccount {

    private double interestRate;

    private Account primaryAccount;

    public SavingAccount(double i) {
        this.primaryAccount = new Account(i);
    }

    public double getBalance() {
        return primaryAccount.getBalance();
    }

    public void setBalance(double balance) {
        primaryAccount.setBalance(balance);
    }
}
