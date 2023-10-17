import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("\n\t Reverse ArrayList \n");
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println("\n\t ArrayList is list : "+list);
        reverse(list);
    }
    static void  reverse(ArrayList<Integer> list ){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            l.add(list.get(i));
        }
        System.out.println("\n\t Reversed List : "+l);

    }
}
        //         output

        //          Reverse ArrayList


        //  ArrayList is list : [0, 2, 4]

        //  Reversed List : [4, 2, 0]

