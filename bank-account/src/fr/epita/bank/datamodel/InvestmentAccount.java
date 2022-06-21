package fr.epita.bank.datamodel;

public class InvestmentAccount {


    private Account primaryAccount;


    public InvestmentAccount(double initialBalance){
        this.primaryAccount = new Account(initialBalance);
    }


    public double getBalance() {
        return primaryAccount.getBalance();
    }

    public void setBalance(double balance) {
        primaryAccount.setBalance(balance);
    }
}
