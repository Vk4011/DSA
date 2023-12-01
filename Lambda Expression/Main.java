import java.util.function.Function;

public class Main{
    static{
        System.out.println("\n\t Lambda Expression \n");
    }
     final static public  void main(String...args) {

     String inputString = "Hello, World!";
        
        
        Function<String, String> reverseString = str -> {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        };
        
    
        String reversedString = reverseString.apply(inputString);
        
       
        System.out.println("\n\tOriginal string : " + inputString);
        System.out.println("\n\tReversed string : " + reversedString);
   

        
    }
}




//  Lambda Expression 


//         Original string : Hello, World!

//         Reversed string : !dlroW ,olleH




