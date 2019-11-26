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
//Ismail
public class Account implements IAccount{
    	protected int accountNumber;
	protected double balance = 0;
	protected ArrayList<Transaction>transactions;
        protected String type;
        protected String owner;
        protected static int counter = 0;
        private static final UserInputManager userInput = new UserInputManager();

    public Account(String type) {
        this.type = type;
        counter++;
        transactions = new ArrayList<Transaction>();
    }
        
        
    public double deposit(double d){
       userInput.retrieveTransactionAmount();
       
       Transaction t = new Transaction();
        
    return balance;
}
    
    @Override
    public void displayAllTransactions() {
       
    }

    @Override
    public ArrayList<Transaction> getTransactions() {
        return null;
    }

    @Override
    public double withdrawal(double w) {
        return 0;
    }
    
    
    
    
    
    

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }
    
}