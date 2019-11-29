/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.text.DecimalFormat;

/**
 *
 * @author cstuser
 */
//Sathu
public class Transaction implements ITransaction{
    private String type;
    private double amount;
    private static final DecimalFormat df = new DecimalFormat("#,###,##0.00");

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    
@Override
    public String toString(){
    return this.type+" of "+Transaction.df.format(amount)+"$";
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}

