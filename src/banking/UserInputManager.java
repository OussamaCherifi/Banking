/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import javafx.scene.control.ButtonType;

/**
 *
 * @author cstuser
 */
public class UserInputManager extends Client implements IUserInputManager  {


    public UserInputManager() {
    }
    
//Oussama 
    public int retrieveAccountNumber() {
        int accountNb = scan.nextInt();
        accountList.get(accountNb);
        return accountNb;
    }

  
    public Account retrieveAccountType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//all
    public int retrieveClientId() {
        id++;
        return id;
    
    }

//all the team
    public Client retrieveClientInfo() {
        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lastName= scan.nextLine();

        Client newClient = new Client(firstName, lastName);
        return newClient;
    }


    public double retrieveTransactionAmount() {
        double transaction = scan.nextDouble();
        return transaction;
    }

//Ismail
    public int retrieveUserOption() {
         System.out.println("Welcome to the bank\n *******************************************\n •	[1] Add a new Client  \n" +
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
