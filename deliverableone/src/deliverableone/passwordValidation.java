package deliverableone;

import java.util.Scanner;

public class passwordValidation {

public static void main(String[] args) {
	 System.out.println("Your password must contain:\r\n"         //ask for password input
             + " At least one lowercase letter\r\n"
             + " At least one uppercase letter\r\n"
             + " At least minimum 7 characters\r\n"
             + " At least maximum 12 characters\r\n"
             + " And an exclamation point\r\n"
             + "Please enter a password: ");
     final int MAX=12;
     final int MIN= 7;
     final int MIN_Uppercase=1;
     final int MIN_Lowercase=1;
     final String exclaim = "!";
     
     int maxEl=0;
     int minEl=0;
     int upperCount=0;
     int lowerCount=0;
     int digitCount=0;
         
    //Receive password input through console
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int passwordLen = input.length();
        
        
    //Check if there is at least one lower case letter  
    for (int i = 0; i < passwordLen; i++ ) {
char chr = input.charAt(i);
        
        //Check if there is at least one upper case letter
        
        if (Character.isUpperCase(chr))
            upperCount++;
        
        //Check if there is at least one lower case letter  
        else if (Character.isLowerCase(chr))
            lowerCount++;
        
        //Check if there are no more than 12 characters
        else if (Character.isDigit(chr))
            maxEl++;
        
        //Check if there are at least 7 characters
        else if (Character.isDigit(chr))
            minEl++;        
        
        if.con
    }
    
    //If the password is valid, print "Password valid and accepted"
    if(upperCount < MIN_Uppercase
        && lowerCount < MIN_Lowercase
        && maxEl < MAX
        && minEl > MIN
        
        )
        System.out.println("Password valid and accepted");
    
    // If the password isn’t valid, print "Error"
    else {
        System.out.println("Error!");
            
            
            
    } 
    
    
    
    
    

}
    }