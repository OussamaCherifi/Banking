/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;


/**
 *
 * @author cstuser
 */
//Oussama
public class UserInputManager implements IUserInputManager  {
    private static final Bank bank = new Bank();
    private static final UserInputManager userInput = new UserInputManager();
    private static final Scanner scan = new Scanner(System.in);
    public UserInputManager() {
    }
    
//Oussama 
    @Override
    public int retrieveAccountNumber() {
        System.out.println("Enter the account number :");
        int accountNumber = scan.nextInt();
        return accountNumber;
    }

  //Oussama
    @Override
    public Account retrieveAccountType() {
        System.out.println("Select the desired account:\n• Type 1 for Checking account;\n•Type 2 for Savings account;");
        int type = scan.nextInt();
        if(type == 1){
            return new CheckingAccount();
        }
        else if(type == 2){
            return new SavingsAccount();
        }
        else{
            System.err.println("Please, make sure to enter 1 or 2.");
        }
        //If statement != 1 or 2, then it returns nothing. 
        return null;
    }

//Oussama
    @Override
    public int retrieveClientId() {
        System.out.println("Enter the Client's id :");
        int id = scan.nextInt();
        return id;
    }

//Oussama
    @Override
    public Client retrieveClientInfo() {
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        String lastName= scan.nextLine();

        return new Client(firstName, lastName);
    }


    @Override
    public double retrieveTransactionAmount() {
        System.out.println("Enter the transaction amount :");
        double transaction = scan.nextDouble();
        return transaction;
    }

    
   //Oussama
    public int retrieveUserOption() {
        System.out.println("Enter your option :");
        System.out.println("Welcome to the bank, please select the option you wish to execute; \n *******************************************\n 	[1] Add a new Client  \n" +
"	[2] Create a new Account \n" +
"	[3] Make a Deposit             \n" +
"	[4] Make a Withdrawal \n" +
"	[5] List Account Transactions  \n" +
"	[6] List Clients\n" +
"	[7] List Client Accounts \n *******************************************");
        int input = scan.nextInt();
        return input;
    }
    
}
