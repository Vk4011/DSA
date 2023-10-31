
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t Remove Duplicates in a string \n");
        String str="gatescolleage";
        System.out.println("\n\t The string is str : "+str);
        remdup(str, 0,new StringBuilder(""),new boolean[26]);
        // System.out.println(str);
    }
    public static void remdup(String str,int idx,StringBuilder newStr , boolean map[]){
        //base case 
        if(idx == str.length()){
            System.out.println("\n\t The new string str : "+newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            remdup(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            remdup(str, idx+1, newStr.append(currChar), map);
        }
    }
}



        //              Remove Duplicates in a string


        //  The string is str : gatescolleage

        //  The new string str : gatescol



        