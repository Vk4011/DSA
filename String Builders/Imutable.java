public class Imutable {

    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println("\n\tOriginal String: " + str1);

      
        str1 = str1 + " World";
        System.out.println("\n\tModified String: " + str1);

        String str2 = str1.toUpperCase();
        System.out.println("\n\tUppercase String: " + str2);

        System.out.println("\n\tOriginal String after modifications: " + str1);
    }
}
