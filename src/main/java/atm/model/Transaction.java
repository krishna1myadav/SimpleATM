package atm.model;

public class Transaction {

    private TransactionType type;
    private double amount;

    public Transaction(TransactionType type, double amount){
        this.type = type;
        this.amount = amount;
    }
    public TransactionType getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public void displayTransaction(){
        System.out.println("Transaction Type: " + type);
        System.out.println("Transaction Amount: " + amount);
    }
}
