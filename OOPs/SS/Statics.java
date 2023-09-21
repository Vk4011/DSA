package SS;

public class Statics {
    public static void main(String[] args) {
        System.out.println("\n\t Static key word\n");
        add(6,9);

        // Access the static methods and variable without creating an instance
        Counter.increment();
        Counter.increment();
        Counter.increment();

        // Get and display the current count
        int currentCount = Counter.getCount();
        System.out.println("Current Count: " + currentCount);


    }
    static int add(int a,int b){
        System.out.println("\n\t Static value : "+(a+b));
        return a+b;
    }
}

class Counter {
    private static int count = 0; // A static variable to keep track of the count

    // A static method to increment the count
    public static void increment() {
        count++;
    }

    // A static method to get the current count
    public static int getCount() {
        return count;
    }
}