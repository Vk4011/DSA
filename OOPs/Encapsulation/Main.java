package Encapsulation;



public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Banner", 30);

        // Accessing and modifying the object's properties using getter and setter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Bob");
        person.setAge(15); // This will print "Age cannot be negative."

        // Displaying updated information
        System.out.println("Name: " + person.getName()); // Name changed to "Bob"
        System.out.println("Age: " + person.getAge());  // Age remains 30 due to validation

    }
}
