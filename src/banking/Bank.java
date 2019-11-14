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
public class Bank implements IBank{
    private String bankNumber;
    private String address;
    private ArrayList<Client>clientList;
    protected int counter;
    private UserInputManager userInput = new UserInputManager();
    
    
    @Override
    public void addClient(Client newClient) {    
    userInput.retrieveClientInfo();
    
    clientList.add(userInput);
        
        

    }

    public void displayClientAccounts(int clientId) {
       
    }
//Oussama
    public void displayClientList() {
    System.out.println(clientList);
    }


    public Client getClient(int id) {
       
    }


    public Account getClientAccount(int clientId, int accountNumber) {
        
    }
    
}
