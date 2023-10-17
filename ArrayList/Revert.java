import java.util.ArrayList;
import java.util.Scanner;

public class Revert {
    public static void main(String[] args) {
        System.out.println("\n\t Revere the list\n");
        ArrayList<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("\n\t Enter number of  elements : ");
        n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print("\n\t Enter elment index ("+(i)+") : ");//(i+1)
            int element = scanner.nextInt();
            list.add(element);
        }
        System.out.println("\n\t List = "+list);
        reverse(list);
    }
    static void reverse(ArrayList<Integer> l){
        System.out.println("\n\t Reverse the list \n");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=l.size()-1;i>=0;i--){
            list.add(l.get(i));
        }
        System.out.println("\n\t Reverse list : "+list);
    }
}
                    output:


                    
         Revere the list


         Enter number of  elements : 3

         Enter elment index (0) : 6

         Enter elment index (1) : 2

         Enter elment index (2) : 4

         Enter elment index (3) : 9

         List = [6, 2, 4, 9]

         Reverse the list


         Reverse list : [9, 4, 2, 6]




         