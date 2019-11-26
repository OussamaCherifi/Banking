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
public class Bank extends Client implements IBank {
    private String bankNumber;
    private String address;
    private ArrayList<Client>clientList;
    private UserInputManager userInput = new UserInputManager();

    
    @Override
    public void addClient(Client newClient) {    
    userInput.retrieveClientInfo();
    clientList.add(newClient);
    }

    public void displayClientAccounts(int clientId) {
        for(int i = 0; i < clientList.get(clientId).getAccountList().size();i++) {
            System.out.print(clientList.get(clientId).getAccountList().get(i).toString());
        }
    }
    
    public void displayClientList() {
    for(int i = 0; i< clientList.size(); i++){
        System.out.println(clientList.get(i).toString());
        }
    }


    @Override
    public Client getClient(int id) {
        return clientList.get(id);
    }


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
    
    
    
}
