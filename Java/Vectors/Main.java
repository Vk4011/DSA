import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();
        System.out.println("\n\t Vectors in java \n");

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");
        System.out.println("\n\t Vector animals : "+mammals);
        // Using index number
        mammals.add(2, "Cat");
        System.out.println("\n\t Vector: " + mammals);
        System.out.println("\n\t size of vector : "+mammals.size());
        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("\n\t New Vector: " + animals);
        System.out.println("\n\t Size of vector : "+animals.size());

    }
}

            output:


            Vectors in java


         Vector animals : [Dog, Horse]

         Vector: [Dog, Horse, Cat]

         size of vector : 3

         New Vector: [Crocodile, Dog, Horse, Cat]

         Size of vector : 4



         