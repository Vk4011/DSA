 public class Person {             //classes
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name; // 'this' refers to the current object
        this.age = age;

        //Doesn't have any return type in construtor
    }

    // Method to display information about the person  .it is a type of function 
    public void displayInfo() {
        System.out.println("\n\tName: " + name);
        System.out.println("\n\tAge: " + age);                //Objects
    }




    public static void main(String[] args) {                            //Main function 
        // Creating objects using the constructor
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);

        // Calling methods on objects
        person1.displayInfo();
        person2.displayInfo();

        // Garbage collection: Objects are automatically managed by the JVM
    }



}

// output:
//   Name: John

//         Age: 30

//         Name: Alice

//         Age: 25

