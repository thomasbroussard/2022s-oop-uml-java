package fr.epita.bank.launchers;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Welcome to this application");
        Customer customer = new Customer("Paris", "Thomas");

        List<InvestmentAccount> investmentAccountList = new ArrayList<>();
        investmentAccountList.add(new InvestmentAccount(10));


        List<SavingAccount> savingsAccountList = new ArrayList<>();
        savingsAccountList.add(new SavingAccount(10));

        customer.setInvestmentAccounts(investmentAccountList);
        customer.setSavingsAccounts(savingsAccountList);

        customer.addSavingAccount(new SavingAccount(10.2));

        customer.getSavingsAccounts().clear();

        savingsAccountList.add(new SavingAccount(10.2));



        System.out.println(customer);


    }
}
