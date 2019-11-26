/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;


/**
 *
 * @author cstuser
 */

//Mohamed
public class Client implements IClient {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Account>accountList;
    private static int counter = 0;

    public Client(String firstName, String lastName) {
        this.id = Client.counter;
        this.firstName = firstName;
        this.lastName = lastName;
        counter++;
        accountList = new ArrayList<Account>();
    }
    
    @Override
    public void addAccount(Account newAccount) {
        accountList.add(newAccount);
    }

    @Override
    public void displayAccounts() {
        
    }

    @Override
    public Account getAccount(int accountNumber) {
        return null;
    }

    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Client.counter = counter;
    }
    
    //@RR
    public String toString(){
        return "";
    }
    
}
