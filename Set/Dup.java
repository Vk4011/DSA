import java.util.*;
public class Dup {
    public static void main(String[] args) {
        System.out.println("\n\t Set in java \n");
        Set<String> s=new HashSet<>();
        s.add("vik");
        s.add("vik");
        s.add("ram");
        s.add("vikram");
        s.add("vik");
        s.add("vik");
        System.out.println("\n\t set in java s : "+s);
        // Set in java 


        // set in java s : [vikram, vik, ram]
        Set<Integer> a=new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0,4 }));
        System.out.println("\n\t set a : "+a);
        // set a : [0, 1, 2, 3, 4, 8, 9]
        
    }
    
}
