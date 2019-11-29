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
//Sathu
public class Bank implements IBank {
    private String bankNumber;
    private String address;
    private ArrayList<Client>clientList;
    private UserInputManager userInput = new UserInputManager();

    
    @Override
    public void addClient(Client newClient) {    
        clientList.add(newClient);
    }
    
//Ismail
    @Override
    public void displayClientAccounts(int clientId) {
        for(int i=0; i<getClient(clientId).getAccountList().size();i++) {
            System.out.print(getClientAccount(clientId, i).toString());
        }
    }
    //Sathu
    @Override
    public void displayClientList() {
    for(int i=0; i<this.clientList.size();i++){
        System.out.println(this.clientList.get(i).toString());
        }
    }

//Sathu
    @Override
    public Client getClient(int id) {
        return this.clientList.get(id);
    }

//Ismail
    @Override
    public Account getClientAccount(int clientId, int accountNumber) {
        return getClient(clientId).getAccountList().get(accountNumber);
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

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    public UserInputManager getUserInput() {
        return userInput;
    }

    public void setUserInput(UserInputManager userInput) {
        this.userInput = userInput;
    }
    
    public String toString(){
        return "";
    }    
    
}
