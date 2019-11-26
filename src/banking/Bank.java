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
public class Bank extends Client implements IBank {
    private String bankNumber;
    private String address;
    private ArrayList<Client>clientList;
    
    private UserInputManager userInput = new UserInputManager();
    
    
    @Override
    public void addClient(Client newClient) {    
    userInput.retrieveClientInfo();
    
    clientList.add(userInput);
        
        

    }

    public void displayClientAccounts(int clientId) {
        int userId = userInput.retrieveClientId();
        
      for(int i = 0; i < accountList.size(); i++) {   
          
    System.out.print(accountList.get(i));
       
        
    }
    }
    public void displayClientList() {
        for(int i = 0; i< clientList.size(); i++){
    System.out.println(clientList.toString() );
    
        }
    }


    @Override
    public Client getClient(int id) {
        for(int i = 0; i<=clientList.size()+1; i++){
            if(clientList.get(i).id==this.id){
                return clientList.get(i);
            }
            else if(i==clientList.size()+1){
                System.err.println("This id does not exist in any client.");   
            }
        }
        return null;
    }


    public Account getClientAccount(int clientId, int accountNumber) {
        int idValid = -1;
        if(getClient()> idValid){
            
            
        }
        
        return null;
        
    }
}
