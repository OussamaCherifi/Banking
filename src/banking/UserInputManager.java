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
public class UserInputManager implements IUserInputManager  {
    private static final Bank bank = new Bank();
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

  
    @Override
    public Account retrieveAccountType() {
        int id = retrieveClientId();
        System.out.println("Select the desired account:\n• Type 1 for Checking account;\n•Type 2 for Savings account;");
        int type = scan.nextInt();
        if(type == 1){
            Account check = new CheckingAccount("checking");
            bank.clientList(id);
        }
        else if(type == 2){
            return new SavingsAccount("saving");
        }
        else{
            System.err.println("Please, make sure to enter 1 or 2.");
        }
        //@RR
        return null;
    }

//all
    @Override
    public int retrieveClientId() {
        System.out.println("Enter the Client's id :");
        int id = scan.nextInt();
        return id;
    }

//all the team
    @Override
    public Client retrieveClientInfo() {
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        String lastName= scan.nextLine();

        Client newClient = new Client(firstName, lastName);
        return newClient;
    }


    @Override
    public double retrieveTransactionAmount() {
        System.out.println("Enter the transaction amount :");
        double transaction = scan.nextDouble();
        return transaction;
    }

//Ismail
    public int retrieveUserOption() {
        System.out.println("Enter your option :");
        int input = scan.nextInt();
        return input;
    }
    
}
