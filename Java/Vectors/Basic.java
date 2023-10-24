import java.util.Vector;

public class Basic {
    public static void main(String[] args) {
        System.out.println("\n\t Vectors in java \n");
        
        // Create a vector of strings
        Vector<String> stringVector = new Vector<String>();

        // Adding elements using add() method of List
        stringVector.add("Tiger");
        stringVector.add("Lion");
        stringVector.add("Dog");
        stringVector.add("Elephant");

        // Adding elements using addElement() method of Vector
        stringVector.addElement("Rat");
        stringVector.addElement("Cat");
        stringVector.addElement("Deer");

        // Display the elements in the Vector
        System.out.println("\n\t Elements are: " + stringVector);

        // Create a vector to store integers
        Vector<Integer> integerVector = new Vector<>();

        // Adding integers to the vector
        integerVector.add(10);
        integerVector.add(20);
        integerVector.add(30);
        integerVector.add(40);

        // Call a separate method to work with the integer vector
        vi(integerVector);
    }

    public static void vi(Vector<Integer> integerVector) {
        // Accessing elements by index
        int firstValue = integerVector.get(0);
        int secondValue = integerVector.get(1);

        System.out.println("First value: " + firstValue);
        System.out.println("Second value: " + secondValue);

        // Iterating through the vector
        System.out.println("All values:");
        for (Integer value : integerVector) {
            System.out.println(value);
        }

        // Removing an element
        integerVector.remove(2); // Remove the element at index 2

        System.out.println("After removing the element at index 2:");
        for (Integer value : integerVector) {
            System.out.println(value);
        }

        // Checking if an element exists
        if (integerVector.contains(30)) {
            System.out.println("30 is in the vector.");
        } else {
            System.out.println("30 is not in the vector.");
        }

        // Getting the size of the vector
        System.out.println("Number of elements in the vector: " + integerVector.size());
    }
}
