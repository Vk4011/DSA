class Animal {
    String name;
    String breed;

    // Action
    public void walk() { // override method
        System.out.println("\n\t " + name + " is walking");
    }

    public void eat() {
        System.out.println("\n\t " + name + " is eating");
    }
}

class Dog extends Animal {
    // no code but we access properties parent class Animal

    public void pet() {
        System.out.println("\n\t " + name + " is now a pet "); // Corrected the print statement
    }

    public void run() {
        System.out.print("\t Dog is running....");
    }

    @Override // Method overriding
    public void walk() {
        System.out.println("\n\t New walk function");
    }
}

class Lion extends Animal {
    public void wild() {
        System.out.println("\n\t Killing deer ");
    }

    @Override // Method overriding
    public void walk() {
        System.out.print("\t Lion is chasing....tiger ");
    }
}

public class Inherit {

    public static void main(String[] args) {
        System.out.println("\n\t Inheritance \n");
        Dog d = new Dog(); // created object of inherited class Dog is extends inherited behaviors and properties form the parent class Animal
        d.name = "German Shepherd"; // Corrected the breed name
        d.walk();
        d.pet(); // the function is in the child not inherited walk() from the parent class is method overriding
        System.out.println("\n\t Lion class is a blueprint it defines properties and behaviors");
        Lion lion = new Lion(); // Lion class created the lion object
        lion.wild(); // calling lion class function method wild()
        System.out.println("\n\t Overriding method in animals ");
        lion.walk();
        System.out.println("\n\n Single-level Inheritance ...");
    }
}
