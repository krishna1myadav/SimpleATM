package atm.model;

import java.time.LocalDateTime;

public class Transaction {

    private TransactionType type;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(TransactionType type, double amount, LocalDateTime dateTime) {
        this.type = type;
        this.amount = amount;
        this.dateTime = dateTime;
    }
    public TransactionType getType(){
        return type;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public double getAmount(){
        return amount;
    }
    public void displayTransaction(){
        System.out.println("Transaction Type: " + type);
        System.out.println("Transaction Amount: " + amount);
    }
}
