package fr.epita.bank.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a class reprensenting the customer data
 */
public class Customer {

    private String address;
    private String name;

    private List<InvestmentAccount> investmentAccounts = new ArrayList<>();
    private List<SavingAccount> savingsAccounts = new ArrayList<>();

    public Customer(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InvestmentAccount> getInvestmentAccounts() {
        return investmentAccounts;
    }

    public void setInvestmentAccounts(List<InvestmentAccount> investmentAccounts) {
        this.investmentAccounts = investmentAccounts;
    }

    public List<SavingAccount> getSavingsAccounts() {
        return savingsAccounts;
    }

    public void setSavingsAccounts(List<SavingAccount> savingsAccounts) {
        this.savingsAccounts = savingsAccounts;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", investmentAccounts=" + investmentAccounts +
                ", savingsAccounts=" + savingsAccounts +
                '}';
    }


    public void addSavingAccount(SavingAccount savingAccount) {
        this.savingsAccounts.add(savingAccount);
    }
}
