import java.util.Vector;

public class Operations {

    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("\n\t Initial Vector: " + animals);

        // Using remove()
        String element = animals.remove(1);
        System.out.println("\n\t Removed Element: " + element);
        System.out.println("\n\t New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("\n\t Vector after clear(): " + animals);
    }
}
                output:

                Initial Vector: [Dog, Horse, Cat]

         Removed Element: Horse

         New Vector: [Dog, Cat]

         Vector after clear(): []


         