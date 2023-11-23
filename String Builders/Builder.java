public class Builder {
    public static void main(String[] args) {
        System.out.println("\n\t String Builder \n");
        StringBuilder str = new StringBuilder();

        str.append("Hello");
        str.append(" ");
        str.append("World");

        System.out.println("\n\t Converting the stringBuilder to a string \n");

        String result = str.toString();
        System.out.println("\n\t Resulting String : "+result);

        System.out.println("\n\t Inserting character at a specific index \n");
        str.insert(5,"  Vikram");
        System.out.println("\n\t After insertion : "+str);


        System.out.println("\n\t Deleting characters from the StringBuilder \n");
        str.delete(5,7);
        System.out.println("\n\t After deletion :  "+str);

        System.out.println("\n\t Replacing the contents of the string builder \n");

        str.replace(5, 10, " Mark");
        System.out.println("\n\t After Replacement : "+str);

        int length = str.length();
        System.out.println("\n\t Length of the StringBuilder : "+length);
        System.out.println("\n\t Get capacity of the StringBuilder \n");
        int capacity=str.capacity();
        System.out.println("\n\t Capacity of the StringBuilder : "+capacity);


        System.out.println("\n\t Ensure capacity for the StringBuilder \n");
        str.ensureCapacity(50);
        System.out.println("\n\t Updated Capacity : "+str.capacity());

        char characterAtIndex = str.charAt(8);
        System.out.println("\n\t Character at index 2 : "+characterAtIndex);

        System.out.println("\n\t    StringBuilder // ");

    }   
}


//  String Builder 


//          Converting the stringBuilder to a string


//          Resulting String : Hello World

//          Inserting character at a specific index


//          After insertion : Hello  Vikram World

//          Deleting characters from the StringBuilder


//          After deletion :  HelloVikram World

//          Replacing the contents of the string builder


//          After Replacement : Hello Markm World

//          Length of the StringBuilder : 17

//          Get capacity of the StringBuilder


//          Capacity of the StringBuilder : 34

//          Ensure capacity for the StringBuilder


//          Updated Capacity : 70

//          Character at index 2 : r

//             StringBuilder //



