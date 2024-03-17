

public class Account {
    protected double balance;
    
    public Account(double balance){
        this.balance = balance;
    }
    
    public double getbalance(){
        return balance;
    }
    
    public boolean deposit(double amount){
        if (amount > 0 ){
             balance += amount;
             return true;
        }
        return false;
    }
    
    public boolean whitdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
}
