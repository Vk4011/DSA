package Encapsulation;

public class Person {
    // Private fields, encapsulated
    private String name;
    private int age;

    // Constructor
    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String n) {
        this.name = n;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int a) {
        if (a >= 0) { // Validation to ensure age is non-negative
            this.age = a;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}
