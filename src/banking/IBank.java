/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banking;

public interface IBank {

    /**
     * Add the new Client element to the clientList
     * 
     */
    void addClient(Client newClient);

    /**
     * Retrieve the selected Client (based on the client id) 
     * From the resulting Client, call its method to display the Accounts in the account list
     * 
     */
    void displayClientAccounts(int clientId);

    /**
     * Print every Client listed in the client list
     * 
     */
    void displayClientList();

    /**
     * Retrieve the selected Client (based on the client id) from the client list
     * 
     * return the retrieved Client object
     */
    Client getClient(int id);

    /**
     * Retrieve the selected Client (based on the client id) 
     * From the resulting Client, retrieve the selected Account (based on the account number) 
     * 
     * return the retrieved Account object
     */
    Account getClientAccount(int clientId, int accountNumber);
    
}
