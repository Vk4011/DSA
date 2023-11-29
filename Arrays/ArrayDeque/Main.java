import java.util.ArrayDeque;

public class Main {
    /* Array Deque : internally implements a double-ended queue, means it will be ready to add the elment at either end .
     * 
     * we can efficiently add the elements at the front and back end by using ArrayDeque.
     * 
     */

    static{
        System.out.println("\n\t Array Deque \n");
        System.out.println("\n\t Array Deque is used to efficently add the element both  front and back \n");
    }
    public static void main(String ...a) {
        ArrayDeque ad=new ArrayDeque<>();
        ad.add(10);
        ad.add("virat");
        ad.add(false);
        ad.add(5.55);
        System.out.println("\n\t Array Deque : "+ad);
        ad.addFirst("First");
        ad.addLast("Last");
        System.out.print("\n\t Final arraydeque : "+ad);
    }
    
}
//  Array Deque


//          Array Deque is used to efficently add the data front and back


//          Array Deque : [10, virat, false, 5.55]





// Final arraydeque : [First, 10, virat, false, 5.55, Last]


