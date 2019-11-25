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
public class CheckingAccount extends Account {

    public CheckingAccount(boolean ifChecking, String owner) {
        super(ifChecking, owner);
        this.ifChecking = true;
        this.owner = owner;
        this.accountNumber = Account.counter;
        Account.counter++;
        transactions = new ArrayList<Transaction>();
    }


    
}
