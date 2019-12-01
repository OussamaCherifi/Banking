/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;




/**
 *
 * @author cstuser
 */
//All the team
public class Banking {

    private static final UserInputManager userI = new UserInputManager(); 
    private static final Bank b = new Bank("1", "446 Red Cross");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_RESET = "\u001B[0m";
        
        int id;
        int accountNb;
        double transaction;

        
        System.out.println(ANSI_BLUE + "Welcome to the bank" + ANSI_RESET);
        
        
    while(true){
        
        switch(userI.retrieveUserOption()){   
         
        case 1:
            b.addClient(userI.retrieveClientInfo());
            break;
        case 2:
            id = userI.retrieveClientId();
            Account acc = userI.retrieveAccountType();
            acc.setOwner(b.getClient(id));
            b.getClient(id).addAccount(acc);
            break;
             
        case 3:
            id = userI.retrieveClientId();
            accountNb = userI.retrieveAccountNumber();
            transaction = userI.retrieveTransactionAmount();
            b.getClientAccount(id, accountNb).deposit(transaction);
            System.out.println(b.getClientAccount(id, accountNb));
            break;
             
        case 4:
            id = userI.retrieveClientId();
            accountNb = userI.retrieveAccountNumber();
            transaction = userI.retrieveTransactionAmount();
            b.getClientAccount(id, accountNb).withdrawal(transaction);
            System.out.println(b.getClientAccount(id, accountNb));
            break;
        case 5:
            id = userI.retrieveClientId();
            accountNb = userI.retrieveAccountNumber();
            b.getClientAccount(id, accountNb).displayAllTransactions();
            System.out.println("\n"+b.getClientAccount(id, accountNb));
            break;
        case 6:
            System.out.println("List of current clients: ");
            b.displayClientList();
            break;
        case 7:
            id = userI.retrieveClientId();
            System.out.println("Accounts for "+b.getClient(id).getLastName()+", "+b.getClient(id).getFirstName()+" "+"("+b.getClient(id).getId()+"):");
            b.getClient(id).displayAccounts();
            break;
        
        default:
            System.err.println("Please enter a valid option.");
            break;
            }     
         
        }
 
    }

    }
  

