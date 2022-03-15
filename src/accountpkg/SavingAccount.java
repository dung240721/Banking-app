package accountpkg;

import Bankpkg.Bank;
import java.text.DecimalFormat;

public class SavingAccount extends  Account {
    private double dailyInterest;
    private int daysOfYear;

    public SavingAccount (String accountNumber, String accountHolderName, String accountType, double balance, int daysOfYear ){
        super (accountNumber, accountHolderName, accountType, balance);
        this.daysOfYear= daysOfYear;
    }
    public double calculateInterest() {
        dailyInterest = (super.getBalance() * Bank.interestRate / 100)
        / daysOfYear;
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        return Double.valueOf(twoDForm.format(dailyInterest));
    }

    @Override
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Daily Interest is: $"+ calculateInterest());
    }
}
