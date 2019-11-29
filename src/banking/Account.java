/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.text.DecimalFormat;
import java.util.ArrayList;


/**
 *
 * @author cstuser
 */
//Ismail
public class Account implements IAccount{
    	protected int accountNumber;
	protected double balance;
	protected ArrayList<Transaction>transactions;
        protected String type;
        protected Client owner;
        protected static int counter = 0;
        private static final UserInputManager userInput = new UserInputManager();
        private static final DecimalFormat df = new DecimalFormat("###,###,##0.00");

    public Account(String type) {
        this.accountNumber = counter;
        this.type = type;
        this.balance = 0;
        counter++;
        transactions = new ArrayList<Transaction>();
    }
        
        
    @Override
    public double deposit(double d){
       this.transactions.add(new Transaction("Deposit", d));
       this.balance += d;
       System.out.println(type+"("+accountNumber+"): "+df.format(balance)+"$");
       return this.balance; 
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
        this.transactions.add(new Transaction("Withdrawal", w));
        this.balance -= w;
        System.out.println(type+"("+accountNumber+"): "+df.format(balance)+"$");
        return this.balance;

    }
    
    @Override
    public String toString(){
        return (this.type)+" "+(this.accountNumber)+": "+this.df.format(balance)+"$"; 
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