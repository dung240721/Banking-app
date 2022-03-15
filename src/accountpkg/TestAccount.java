package accountpkg;


import Bankpkg.Bank;
import accountpkg.Account;

import java.util.Scanner;

public class TestAccount {
   public static void main(String[] args) {
   String[] accountDetails = new String[5];
       String[] bankDetails = new String[3];
Scanner input = new Scanner(System.in);
System.out.print("Enter Account Number: ");
accountDetails[0] = input.nextLine();
System.out.print("Enter Name: ");
accountDetails[1] = input.nextLine();
       System.out.print("Enter Account Type: ");
       accountDetails[2] = input.nextLine();
       System.out.print("Enter Balance: ");
       accountDetails[3] = input.nextLine();



       System.out.print("Enter Bank ID: ");
      bankDetails[0] = input.nextLine();
       System.out.print("Enter Bank Name: ");
       bankDetails[1] = input.nextLine();
       System.out.print("Enter Branch: ");
      bankDetails[2] = input.nextLine();

       System.out.print("--------------------------");
Account objaccount1 = new SavingAccount(accountDetails[0],
        accountDetails[1], accountDetails[2],
        Double.parseDouble(accountDetails[3]),
        Integer.parseInt(accountDetails[4]));


objaccount1.displayDetail();
System.out.println("--------------------------------------");
Bank objBamk1 = new Bank();

objBamk1.addBankDetails(bankDetails);

objBamk1.displayBankDetails();


   }

}

//SAVING
/*SavingAccount objAccount1 = new SavingAccount(accountDetails[0],
        accountDetails[1], accountDetails[2],
        Double.parseDouble(accountDetails[3]),
        Integer.parseInt(accountDetails[4]));

objAccount1.displayDetail();
        System.out.println("----------------------------------------------");

        Bank objBank1 = new Bank();

        objBank1.addBankDetails(bankDetails);

        objAccount1.displayDetail();

        System.out.println("Daily Interest is: $" + objAccount1.calculateInterest());
*/