/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banking;

/**
 *
 * @author raphaelr
 */
public interface IClient {

    /**
     * Add the new Account element to the account list
     * 
     */
    void addAccount(Account newAccount);

    /**
     * Print every Account listed in the account list
     * 
     */
    void displayAccounts();

    /**
     * Retrieve the desired Account element from the account list
     * 
     * return the Account object
     */
    Account getAccount(int accountNumber);

    /**
     * return the string that you want to output when printing the object
     */
    @Override
    String toString();
    
}
