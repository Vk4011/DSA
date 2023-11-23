public class Imutable {

    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println("\n\tOriginal String: " + str1);

      
        str1 = str1 + " World";
        System.out.println("\n\tModified String: " + str1);

        String str2 = str1.toUpperCase();
        System.out.println("\n\tUppercase String: " + str2);

        System.out.println("\n\tOriginal String after modifications: " + str1);

        imutable();
        System.out.println("\n\t created using the new keyword, explicitly creating a new object in memory, separate from the string pool.");
         // Creating a new string object
         String str3 = new String("Hello"); // This creates a new string object in heap memory

         System.out.println("\n\t str1 == str3: " + (str1 == str3)); // Check if references are equal
 
    }

    public static void imutable() {
        System.out.println("\n\t String object is immutable \n");
        String s1="Java";
        s1.concat("rules");
        System.out.println("\n\t string s1 refers to  : "+s1);
        System.out.println("\n\t String constant pool : "+(s1.concat(" Base")));
    
        
        // Modifying string objects
        String original = "Immutable";
        String modified = original.concat(" Example"); // Concatenating strings creates a new string
        System.out.println("\n\t Concatenating strings creates a new string \n" );
        System.out.println("\n\tOriginal String: " + original);
        System.out.println("\n\tModified String: " + modified);
    }
}




        // Original String: Hello

        // Modified String: Hello World

        // Uppercase String: HELLO WORLD

        // Original String after modifications: Hello World

        //  String object is immutable


        //  string s1 refers to  : Java

        //  String constant pool : Java Base

        //  Concatenating strings creates a new string


        // Original String: Immutable

        // Modified String: Immutable Example

        //  created using the new keyword, explicitly creating a new object in memory, separate from the string pool.        

        //  str1 == str3: false




        