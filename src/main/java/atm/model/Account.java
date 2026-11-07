package atm.model;

public class Account {

    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("invalid amount");
        }else {
            balance = balance + amount;
            System.out.println("Money successfully deposited!");
        }
    }
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        }else {
            balance = balance - amount;
            System.out.println("Money successfully deposited!");
        }
    }
}
