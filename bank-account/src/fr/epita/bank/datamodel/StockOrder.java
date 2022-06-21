package fr.epita.bank.datamodel;

import java.time.LocalDateTime;

public class StockOrder {

    private double commission;
    private double unitPrice;
    private double quantity;
    private LocalDateTime dateTime;

    private Stock stock;
    private InvestmentAccount account;

}
