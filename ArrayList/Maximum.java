import java.util.ArrayList;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("\n\t Find Maximum in an ArrayList \n");
        ArrayList<Integer> list = new  ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        System.out.println("\n\t List : "+list);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
        System.out.println("\n\t Max number : "+max);
    }
    
}


                Find Maximum in an ArrayList


         List : [5, 1, 2, 6, 4]

         Max number : 6



         