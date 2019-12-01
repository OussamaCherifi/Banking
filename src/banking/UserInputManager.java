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
    
    private static final Scanner scan = new Scanner(System.in);
    private static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    
    public UserInputManager() {
    }

    @Override
    public int retrieveAccountNumber() {
        boolean b = true;
        while(b){
            System.out.println("Enter the account number :");
            int accountNumber = scan.nextInt();
            
            if(accountNumber>=0 && accountNumber<Account.getCounter()){
            return accountNumber;
            }
            else{
                System.out.println(ANSI_RED+"This account number does not exist. Please try again.\n"+ANSI_RESET);
            }
        }
        return 0;
    }

    @Override
    public Account retrieveAccountType() {
        boolean b = true;
        while(b){
            System.out.println("Select the desired account:\n\n• Type 1 for Checking account;\n• Type 2 for Savings account;");
            int type = scan.nextInt();
            
            if(type==1){
                return new CheckingAccount();
            }
            else if(type==2){
                return new SavingsAccount();        
            }
            else{
                System.out.println(ANSI_RED+"Please make sure to enter one of the options.\n"+ANSI_RESET);
            }
        }
        return null;
    }

    @Override
    public int retrieveClientId() {
        boolean b = true;
        while(b){
            System.out.println("Enter the client's id :");
            int id = scan.nextInt();
            
            if(id>=0 && id<Client.getCounter()){
            return id;
            }
            else{
                System.out.println(ANSI_RED+"This client id does not exist. Please try again.\n"+ANSI_RESET);
            }
        }
        return 0;
    }
    
    @Override
    public Client retrieveClientInfo() {
        System.out.print("Enter your first name: ");
        String firstName = scan.next();
        System.out.print("Enter your last name: ");
        String lastName = scan.next();

        return new Client(firstName, lastName);
    }

    @Override
    public double retrieveTransactionAmount() {
        System.out.println("Enter the transaction amount :");
        double transaction = scan.nextDouble();
        return transaction;
    }

    
   
    @Override
    public int retrieveUserOption() {
        System.out.println("\n*******************************************\n"+
" 	[1] Add a new Client  \n" +
"	[2] Create a new Account \n" +
"	[3] Make a Deposit             \n" +
"	[4] Make a Withdrawal \n" +
"	[5] List Account Transactions  \n" +
"	[6] List Clients\n" +
"	[7] List Client Accounts \n *******************************************");
        
        System.out.println("Enter your option :");
        int input = scan.nextInt();
        
        System.out.println(ANSI_GREEN+"Your selected option is: " +input+"\n"+ANSI_RESET);
        return input;
    }
    
}
