
public class CheckingAccount extends Account{
    private double overdraftProtection;
    
    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }
  
    public CheckingAccount(double balance){
    this(balance, -1.0);
    }

    @Override
    public boolean whitdraw(double amount){
    if (super.whitdraw(amount)){
        return true;
    }
    
    if (overdraftProtection < 0 || overdraftProtection < amount - balance){
        return false;
    }
    
    balance = 0;
    overdraftProtection -= amount - balance;
    return true;
    }
    
    
}

