import java.util.HashSet;
import java.util.Set;

public class Basic{
    public static void main(String[] args) {
        // Create a HashSet to store integers
        Set<Integer> numberSet = new HashSet<>();

        // Add elements to the Set
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(40);

        // Print the elements in the Set
        System.out.println("Set elements: " + numberSet);

        // Check if an element is in the Set
        int target = 30;
        if (numberSet.contains(target)) {
            System.out.println(target + " is in the Set.");
        } else {
            System.out.println(target + " is not in the Set.");
        }

        // Remove an element from the Set
        int toRemove = 20;
        numberSet.remove(toRemove);
        System.out.println("Removed " + toRemove + " from the Set.");

        // Check the size of the Set
        System.out.println("Size of the Set: " + numberSet.size());

        // Iterate and print all elements in the Set
        System.out.print("Set elements (via iteration): ");
        for (int element : numberSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        
        System.out.println("Set elements: " + numberSet);
        
        // Clear all elements in the Set
        numberSet.clear();
        System.out.println("Set is now empty: " + numberSet.isEmpty());
    }
}
