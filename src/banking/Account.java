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
	protected double balance;
	protected ArrayList<Double> transactions;
        protected String checking; 
        protected String savings;
        protected String owner;
        private int counter;

   
    
    public double deposit(double d){
       
    Scanner sc = new Scanner(System.in);
    d = sc.nextDouble();
    return d;
}

    @Override
    public void displayAllTransactions() {
       System.out.println(transactions);
    }

    @Override
    public ArrayList<Transaction> getTransactions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double withdrawal(double w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}