import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println("\n\t Random Password Generator \n");
        String characters = "abcdefghijklmnopqrstuvwxyz"+"ASDFGHJKLQWERTYUIOPZXCVBNM"+"1234560789"+"!@#$%&*_";
        String password="";
        Random random = new Random();

        for(int i=0;i<8;i++){
            int index=random.nextInt(characters.length());
            password=password+characters.charAt(index);
        }
        System.out.println("\n\t Generated Password : "+password);
        System.out.println("\n");

    }
    
}
                    output:

                     Random Password Generator 


                    Generated Password : @NVa_mgw