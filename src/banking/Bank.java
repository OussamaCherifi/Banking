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
public class Bank implements IBank{
    private String bankNumber;
    private String address;
    protected static ArrayList<Client>clientList;
    protected int counter;
    private UserInputManager userInput = new UserInputManager();
    
    
    @Override
    public void addClient(Client newClient){    
    userInput.retrieveClientInfo();
    clientList.add(newClient);

    }

    @Override
    public void displayClientAccounts(int clientId) {
       
    }
//Oussama
    @Override
    public void displayClientList() {
    System.out.println(clientList);
    }


    @Override
    public Client getClient(int id) {
       return null;
    }


    @Override
    public Account getClientAccount(int clientId, int accountNumber) {
        return null;
    }
    
}
