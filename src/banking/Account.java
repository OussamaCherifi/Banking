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
public class Account implements IAccount{
    	protected int accountNumber;
	protected double balance = 0;
	protected ArrayList<Transaction>transactions;
        protected String type;
        protected String owner;
        protected static int counter = 1;

    public Account(String owner) {
        this.type = type;
        counter++;
        transactions = new ArrayList<Transaction>();
    }
        
        
    public double deposit(double d){
       
    Scanner sc = new Scanner(System.in);
    d = sc.nextDouble();
    return d;
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
}