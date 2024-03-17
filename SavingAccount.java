
public class SavingAccount extends Account{
    private double InterestRate;
    
    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.InterestRate = interestRate;
    }
    
    public void applyInterestRate(){
        balance += balance * InterestRate;
    }
    
}
