/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cstuser
 */


public class Client implements IClient{
    protected int id;
    protected String firstName;
    protected String lastName;
    static ArrayList<Account>accountList;
    private static int counter = 42;
    
    static Scanner scan = new Scanner(System.in);

    public Client() {
        this.id = Client.counter;
        Client.counter++;
    }


    public Client(String firstName, String lastName) {
        this.id = Client.counter;
        this.firstName = firstName;
        this.lastName = lastName;
        Client.counter++;
    }
    
    @Override
    public void addAccount(Account newAccount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayAccounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account getAccount(int accountNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
