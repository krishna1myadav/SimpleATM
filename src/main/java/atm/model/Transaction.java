package atm.model;

public class Transaction {

    private String type;
    private double amount;

    public Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }
    public String getType(){
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
