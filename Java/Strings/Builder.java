import java.util.*;

public class Builder {
    public static void main(String[] args) {
        System.out.println("\n\t String builder \n");
        StringBuilder sb = new  StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
         System.out.println("\t"+sb+"\n");
    }
    
}
        // output: 

        //  String builder

        // abcdefghijklmnopqrstuvwxyz


        //