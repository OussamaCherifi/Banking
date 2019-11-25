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
public class SavingsAccount extends Account {

    public SavingsAccount(boolean ifChecking, String owner) {
        super(ifChecking, owner);
        this.ifChecking = false;
        this.owner = owner;
        this.accountNumber = Account.counter;
        Account.counter++;
        transactions = new ArrayList<Transaction>();
    }


    
}
