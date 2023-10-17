import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\t ArrayList is inbuilt data structure\n\t java collection framework \n");
        ArrayList<Integer> list=new ArrayList<>();
        //addElement
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("\n\t list : "+list);
        System.out.println("\n\t size : "+list.size());
        //getElement
        int g=list.get(4);
        System.out.println("\n\t Get element O(1) : "+g);

        list.remove(5);// (n-1) phenomenon
        System.out.println("\n\t remove is tc O(n) : "+list);
        //set Element 
        list.set(4, 10);
        System.out.println("\n\t set element O(n) : "+list);
        //Contains Element 
        boolean b=list.contains(4);// T or F
        System.out.println("\n\t Contains O(n) : "+b);
        System.out.println("\n\t List is : "+list);

    }
}



                    output:

                     ArrayList is inbuilt data structure
         java collection framework


         list : [1, 2, 3, 4, 5, 6]

         size : 6

         Get element O(1) : 5

         remove is tc O(n) : [1, 2, 3, 4, 5]

         set element O(n) : [1, 2, 3, 4, 10]

         Contains O(n) : true

         List is : [1, 2, 3, 4, 10]






         