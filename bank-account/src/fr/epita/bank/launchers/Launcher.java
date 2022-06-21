package fr.epita.bank.launchers;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.SavingsAccount;

import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Welcome to this application");
        Customer customer = new Customer("Paris", "Thomas");

        List<InvestmentAccount> investmentAccountList = List.of(
                new InvestmentAccount(10)
        );

        List<SavingsAccount> savingsAccountList = List.of(
                new SavingsAccount(10)
        );


        customer.setInvestmentAccounts(investmentAccountList);
        customer.setSavingsAccounts(savingsAccountList);

        System.out.println(customer);


    }
}
