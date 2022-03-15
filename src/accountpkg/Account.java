package accountpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Account {
    String accountNumber;
    String accountHolderName;
    String accountType;
    double balance;


    public Account() {
        System.out.println("Default Constructor Invoked..");
        accountNumber = "Not Specified";
        accountHolderName = "Not Specified";
        accountType = "Not Specified";
        balance = 0.0;
    }

    public Account(String accNo, String name, String accType, double bal) {
        System.out.println("Parameterized Constructor Invoked");
        accountNumber = accNo;
        accountHolderName = name;
        accountType = accType;
        balance = bal;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void displayDetail(){
        System.out.println("Account Details of Customer");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);


    }

}