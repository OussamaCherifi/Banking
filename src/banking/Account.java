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
//Ismail
public class Account implements IAccount{
    	protected int accountNumber;
	protected double balance = 0;
	protected ArrayList<Transaction>transactions;
        protected String type;
        protected Client owner;
        protected static int counter = 0;
        private static final UserInputManager userInput = new UserInputManager();

    public Account(String type) {
        this.type = type;
        counter++;
        transactions = new ArrayList<Transaction>();
    }
        
        
    @Override
    public double deposit(double d){
       //@RR
       transactions.add(new Transaction("Deposit", d));
       balance += d;
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
        transactions.add(new Transaction("Deposit", w));
        balance -= w;
        return balance;

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

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }
    
}