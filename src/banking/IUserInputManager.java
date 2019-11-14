/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banking;

public interface IUserInputManager {

    /**
    * Inquires the user to input the account number of the desired account
    * then retrieves the entry from the console
    * 
    * return the account number
    */
    int retrieveAccountNumber();

    /**
    * Inquires the user to input the type of new account desired
    * then retrieves the entry from the console
    * 
    * return the Account object (based on the desired type)
    */
    Account retrieveAccountType();

    /**
    * Inquires the user to input the id of the desired Client
    * then retrieves the entry from the console
    * 
    * return the client id
    */
    int retrieveClientId();

    /**
    * Inquires the user to input the first and last names of the new client
    * then retrieves the entries from the console
    * 
    * return the Client object (using the entered data)
    */
    Client retrieveClientInfo();

    /**
    * Inquires the user to input the desired amount for the current transaction
    * then retrieves the entry from the console
    * 
    * return the amount of the transaction
    */
    double retrieveTransactionAmount();

    /**
    * Inquires the user to input the number associated with the operation he/she wants to execute
    * then retrieves the entry from the console
    * 
    * return the selected option number
    */
    int retrieveUserOption();
    
}
