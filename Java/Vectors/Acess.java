import java.util.Vector;

import java.util.Iterator;

public class Acess {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();
        System.out.println("\n\t Acessing elements in vector \n");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        // Using get()
        String element = animals.get(2);
        System.out.println("\n\t Element at index 2: " + element);
        System.out.println("\n\t Vector : " + animals);
        System.out.println("\n\t Size of the vector : " + animals.size());

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("\n\t Vector: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        String s = animals.set(2, "mark");
        System.out.println("\n\n\t set elemnt : " + s);

        animals.add("lion");
        System.out.println("\n\t Final Vector is : " + animals);
        System.out.println("\n\t Final Size of the vector : " + animals.size());

    }
}

            output:

             Acessing elements in vector


         Element at index 2: Cat

         Vector : [Dog, Horse, Cat]

         Size of the vector : 3

         Vector: Dog, Horse, Cat,

         set elemnt : Cat

         Final Vector is : [Dog, Horse, mark, lion]

         Final Size of the vector : 4


         