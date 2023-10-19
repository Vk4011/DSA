import java.util.ArrayList;

public class SwapingList{
    public static void main(String[] args) {
        System.out.println("\n\t Swapping list \n");
        ArrayList<Integer> list = new  ArrayList<>();
        int indx1=1,indx2=3;
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        System.out.println("\n\t List : "+list);
        System.out.println("\n\t Swapping \n");
        swap(list,indx1,indx2);
        System.out.println("\n\t List : "+list);
    }
    public static void swap(ArrayList<Integer> list,int indx1,int indx2){
        int temp=list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2,temp);
    }
}

                output:

                
         Swapping list 


         List : [5, 1, 2, 6, 4]

         Swapping 


         List : [5, 6, 2, 1, 4]



         