import java.util.Scanner;
public class passwordValidatingGC {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    int min =7;
    int max=12;
    int special=0;
    int upCount=0;
    int loCount=0;
    String password;
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter Your Password:");
        password = scan.nextLine();
    if(password.length()>=min&&password.length()<=max){
        for(int i =0;i<password.length();i++){
            char c = password.charAt(i);
            if(Character.isUpperCase(c)){      
                upCount++;
            }
            if(Character.isLowerCase(c)){       
                loCount++;

            }
            if(c>=33&&c<=46||c==64){
                special++;
            }
        }
        if(special>=1&&loCount>=1&&upCount>=1){    
            System.out.println(" Password is valid and accepted:");
        }

    }

    if(password.length()<min){

        for(int i =0;i<password.length();i++){
            char c = password.charAt(i);
            if(Character.isLowerCase(c)){
                loCount++;
            }
            }

        if(loCount>0){
        	System.out.println("Error!");



    }
    }
    else if(password.length()<min&&upCount>1){
        for(int i =0;i<password.length();i++){
        char c =password.charAt(i);
        if(Character.isLowerCase(c)){
            loCount++;
        }
         if(Character.isUpperCase(c)){
            upCount++;
        }
        }
        if(loCount>0&&upCount>0){
        	System.out.println("Error!");
    }
    }
     if(password.length()>max||password.length()>=max&&upCount>1&&loCount>1){
    	 System.out.println("Error!");
        }
      if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&special==0){
    	  System.out.println("Error!");
     }
      if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&special==0){
         System.out.println("Error!");
     }
   }
}