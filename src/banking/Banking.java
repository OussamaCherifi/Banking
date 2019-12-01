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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*"Welcome to the bank, please select the option you wish to execute; \n *******************************************\n 	[1] Add a new Client  \n" +
"	[2] Create a new Account \n" +
"	[3] Make a Deposit             \n" +
"	[4] Make a Withdrawal \n" +
"	[5] List Account Transactions  \n" +
"	[6] List Clients\n" +
"	[7] List Client Accounts \n *******************************************");*/
     UserInputManager a = new UserInputManager(); 
     Bank b = new Bank();
     Client c = new Client();
     
     switch(a.retrieveUserOption()){   
         
        case 1:
             b.addClient(a.retrieveClientInfo());
             break;
        case 2:
             
        case 3:
             a.retrieveTransactionAmount();
             
        case 4:
             
        case 5:
        
        case 6:
            
        case 7:
        
        default: System.out.println("please enter one of the options above.");
         
     }     
         
    }

    }
  

