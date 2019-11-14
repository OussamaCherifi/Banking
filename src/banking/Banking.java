/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author cstuser
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        UserInputManager instance = new UserInputManager();
        boolean yes = true;
        //oussama
 while(yes){
    
     
    
 switch(instance.retrieveUserOption()){
 
     case 1: 
         System.out.println("tg");
break;
     case 2:
         
     case 3:
         
     case 4:
          
     case  5:
         
     case 6:
         
     case 7:
         
     default: 
         System.out.println("please choose an option between the ones below");
          yes = false;
 
 
 
 
 
 }
 
 }   
}
}