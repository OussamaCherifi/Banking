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
    protected ArrayList<Client>clientList;
    private final UserInputManager userInput = new UserInputManager();

    public Bank() {
    }

    
    public Bank(String bankNumber, String address) {
        this.bankNumber = bankNumber;
        this.address = address;
    }
    
    
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
    
    }


    @Override
    public Client getClient(int id) {
       return null;
    }


    @Override
    public Account getClientAccount(int clientId, int accountNumber) {
        return null;
    }

    
    
    
    
    
    
    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static ArrayList<Client> getClientList() {
        return clientList;
    }

    public static void setClientList(ArrayList<Client> clientList) {
        Bank.clientList = clientList;
    }
    
    
}
