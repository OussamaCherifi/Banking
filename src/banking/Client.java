/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import com.sun.jmx.snmp.UserAcl;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cstuser
 */


public class Client implements IClient {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Account>accountList;
    private static int counter = 1;
    Bank bank = new Bank();
    static Scanner scan = new Scanner(System.in);
    UserInputManager userInput = new UserInputManager();

    public Client() {
        this.id = Client.counter;
        Client.counter++;
    }


    public Client(String firstName, String lastName) {
        this.id = Client.counter;
        this.firstName = firstName;
        this.lastName = lastName;
        Client.counter++;
        accountList = new ArrayList<Account>();
    }
    
    @Override
    public void addAccount(Account newAccount) {
  
        bank.clientList.get(userInput.retrieveClientId()).accountList.add(userInput.retrieveAccountType());
    }

    @Override
    public void displayAccounts() {
        
    }

    @Override
    public Account getAccount(int accountNumber) {
        return null;
    }
    
}
